package com.MoodAnalyser;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoodAnalyserMain {
    @Test        //Test Case 1.2
	public void MoodSad() {
    	MoodAnalyser analysemood = new MoodAnalyser();
    	String mood = analysemood.Analyse("Im in Sad Mood");
    	assertEquals("sad", mood);
    }
    @Test        
   	public void MooHappy() {
       	MoodAnalyser analysemood = new MoodAnalyser();
       	String mood = analysemood.Analyse("Im in Any Mood");
       	assertEquals("happy", mood);
       }
}
