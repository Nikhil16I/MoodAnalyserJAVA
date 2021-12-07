package com.MoodAnalyser;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoodAnalyserMain {
    @Test        //Test Case 1.1
	public void MoodTest() {
    	MoodAnalyser analysemood = new MoodAnalyser();
    	String mood = analysemood.Analyse("Im in Sad Mood");
    	assertEquals("sad", mood);
    }
}
