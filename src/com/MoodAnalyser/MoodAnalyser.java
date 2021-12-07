package com.MoodAnalyser;

public class MoodAnalyser {
                    //Test Case 1.2
	public String Analyse(String msgs) {
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
