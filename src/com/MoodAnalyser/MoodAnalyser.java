package com.MoodAnalyser;

public class MoodAnalyser {
	String msgs;
	
                    
	public MoodAnalyser(String msgs) {
		super();
		this.msgs = msgs;
	}                   /* Constructor.,Refactored*/


	public String Analyse() {
		if(msgs.contains("Sad")) {
	    	 System.out.println(msgs);
			return "sad";
		}
	    else {
    	 System.out.println(msgs);
			return "happy";
	   }
	}
}
