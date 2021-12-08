package com.MoodAnalyser;

public class MoodAnalyser {
	String msgs;
	
	public MoodAnalyser(String msgs) {
		super();
		this.msgs = msgs;
	}                   /* Constructor.,Refactored*/


	public String Analyse() throws Exception{
		
		if(msgs == null) {
	    	 //System.out.println(msgs);
			throw new ExceptionClass("Message Cast cant be Null");
		}
		/*else if(msgs.equals("")) {
			throw new ExceptionClass("Message Cast cant be Empty");
    	}*/
	    else if(msgs.contains("sad"))
    	// System.out.println(msgs);
			return "sad";	
	    else
		    return "happy";
	}
}
