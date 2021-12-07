package com.MoodAnalyser;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoodAnalyserMain {
    @Test        
	public void MoodSad() {
    	MoodAnalyser analysemood = new MoodAnalyser("Im in Sad Mood");
    	String mood = analysemood.Analyse();
    	assertEquals("sad", mood);
    }
    @Test        
   	public void MooHappy() {
       	MoodAnalyser analysemood = new MoodAnalyser("Im in Happy Mood");
       	String mood = analysemood.Analyse();
       	assertEquals("happy", mood);
       }
}
