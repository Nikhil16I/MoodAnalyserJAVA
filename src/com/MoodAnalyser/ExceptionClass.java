package com.MoodAnalyser;

public class ExceptionClass extends Exception {

public ExceptionType type;
public String msgs;

	public enum ExceptionType{
		NULL,EMPTYSTRING
	}
	
	public ExceptionClass(String msgs, ExceptionType type) {
		// TODO Auto-generated constructor stub
		super(msgs);
		this.type = type;
	}

}
