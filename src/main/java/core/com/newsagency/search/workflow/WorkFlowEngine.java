package com.newsagency.search.workflow;

import com.newsagency.search.workflow.exception.StateExecutionException;
import com.newsagency.search.workflow.exception.WorkflowExecutionException;
import com.newsagency.search.workflow.exception.WorkflowInitializationException;
import com.newsagency.search.workflow.state.AfterState;
import com.newsagency.search.workflow.state.BeforeState;
import com.newsagency.search.workflow.state.exception.AfterStateExecutionException;
import com.newsagency.search.workflow.state.exception.BeforeStateExecutionException;
import com.newsagency.search.workflow.state.exception.StateLifeCycleExecutionException;

/**
 * @author bikash
 *
 * @param <T>
 * @param <E>
 */
public class WorkFlowEngine<T extends WorkflowContext, E extends WorkflowRequest> implements WorkflowEngineDef<T, E> {

	private E request = null;

	private T ctxt = null;

	@Override
	public void initialize(T ctxt) throws WorkflowInitializationException {
		this.ctxt = ctxt;
	}

	@Override
	public void executeState(T ctxt, E request) throws StateExecutionException {
		this.request = request;
		@SuppressWarnings("unchecked")
		Class<? extends WorkflowState<T, E>>[] states = (Class<? extends WorkflowState<T, E>>[]) request.getClass()
				.getAnnotation(States.class).states();
		for (Class<? extends WorkflowState<T, E>> state : states) {
			try {
				executeStateLifeCycle(state);
			} catch (StateLifeCycleExecutionException e) {
				e.printStackTrace();
				throw new StateExecutionException();
			}
		}
	}

	private void executeStateLifeCycle(Class<? extends WorkflowState<T, E>> state)
			throws StateLifeCycleExecutionException {
		try {

			Before beforeAnnotations = state.getAnnotation(Before.class);
			if (beforeAnnotations != null) {
				@SuppressWarnings("unchecked")
				Class<? extends BeforeState<T, E>>[] names = (Class<? extends BeforeState<T, E>>[]) beforeAnnotations
						.names();
				executeBeforeState(names);
			}
			executeState(state);
			After afterAnnotations = state.getAnnotation(After.class);
			if (afterAnnotations != null) {
				@SuppressWarnings("unchecked")
				Class<? extends AfterState<T, E>>[] names = (Class<? extends AfterState<T, E>>[]) afterAnnotations
						.names();
				executeAfterState(names);
			}
		} catch (BeforeStateExecutionException bse) {
			bse.printStackTrace();
		} catch (StateExecutionException tee) {
			tee.printStackTrace();
		} catch (AfterStateExecutionException ase) {
			ase.printStackTrace();
		}

	}

	private void executeAfterState(Class<? extends AfterState<T, E>>[] afterState) throws AfterStateExecutionException {
		System.out.println("State Execution : After");
		try {
			for (Class<? extends AfterState<T, E>> state : afterState) {
				AfterState<T, E> newInstance = state.newInstance();
				newInstance.after(ctxt, request);
			}
		} catch (InstantiationException e) {
			e.printStackTrace();

		} catch (IllegalAccessException e) {
			e.printStackTrace();
			throw new AfterStateExecutionException();
		}

	}

	private void executeBeforeState(Class<? extends BeforeState<T, E>>[] beforeState)
			throws BeforeStateExecutionException {
		System.out.println("State Execution : Before");
		try {
			for (Class<? extends BeforeState<T, E>> state : beforeState) {
				BeforeState<T, E> newInstance = state.newInstance();
				newInstance.before(ctxt, request);
			}
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

	}

	private void executeState(Class<? extends WorkflowState<T, E>> state) throws StateExecutionException {
		System.out.println("State Execution start");
		try {
			WorkflowState<T, E> newInstance = state.newInstance();
			newInstance.execute(ctxt, request);
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (WorkflowExecutionException e) {
			e.printStackTrace();
		}
	}

}
