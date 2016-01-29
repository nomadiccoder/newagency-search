"use strict";

var React = require('react');
var TextInput = require('../common/textInput');
var TextAreaInput = require('../common/textAreaInput');

var ArticleForm = React.createClass({
	propType:{
		article: React.PropTypes.object.isRequired,
		onSave: React.PropTypes.func.isRequired,
		onChange: React.PropTypes.func.isRequired,
		errors: React.PropTypes.object
	},
	
	render(){
		return(
				<form>
					<h1> Manage Article </h1>
					<TextInput
						name="title"
						label="Title"
						value={this.props.article.title}
						onChange={this.props.onChange}
						error={this.props.errors.title}/>
					<br />
					<TextAreaInput
						name="content"
						label="Content"
						value={this.props.article.description}
						onChange={this.props.onChange}
						error={this.props.errors.description}/>
					<br />

					<TextInput
						name="author"
						label="Author"
						value={this.props.article.author}
						onChange={this.props.onChange}
						error={this.props.errors.author}/>
					<br />

					<TextInput
						name="directUrl"
						label="url"
						value={this.props.article.fullContentUri}
						onChange={this.props.onChange}
						error={this.props.errors.fullContentUri}/>
					<br />

					<input type="submit" value="Save" className="btn btn-default" onClick={this.props.onSave}/>
				</form>
			);
	}
});

module.exports = ArticleForm;