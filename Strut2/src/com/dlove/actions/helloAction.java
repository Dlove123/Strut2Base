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
		message="��һ��strust2��Ŀ";
		return "success";
	}
}
