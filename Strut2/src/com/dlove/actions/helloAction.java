package com.dlove.actions;

public class helloAction {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public String excute(){
		message="第一个strust2项目";
		return "success";
	}
}
