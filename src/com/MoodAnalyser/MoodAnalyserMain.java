package com.MoodAnalyser;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoodAnalyserMain {
    @Test
	public void MoodTest() {
    	MoodAnalyser analysemood = new MoodAnalyser();
    	String mood = analysemood.Analyse(" Write message");
    	assertEquals("sad", mood);
    }
}
