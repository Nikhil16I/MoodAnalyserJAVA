package com.MoodAnalyser;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoodAnalyserMain {
    @Test        
	public void MoodSad() throws Exception{
    	MoodAnalyser analysemood = new MoodAnalyser("Im in sad Mood");
    	String mood = analysemood.Analyse();
    	assertEquals("sad", mood);
    }
    @Test        
   	public void MooHappy() throws Exception {
       	MoodAnalyser analysemood = new MoodAnalyser("Im in Any Mood");
       	String mood = analysemood.Analyse();
       	assertEquals("happy", mood);
       }
    @Test (expected=ExceptionClass.class)      
   	public void TestMoodNull() throws Exception {
       	MoodAnalyser analysemood = new MoodAnalyser(null);
       	String mood = analysemood.Analyse();
       	assertEquals(null, mood); //TestCase for null point exception
    }
}
