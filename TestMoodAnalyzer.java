package moodanalyzer;
import static org.junit.Assert.*;

import org.junit.Test;

import demoMoodAnalyzer.MoodAnalyzer;
import org.junit.Test;
public class TestMoodAnalyzer {
	@Test
	public void givenMessage_whenSad_shouldReturnSad() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is a sad message");
		String mood = moodAnalyzer.analyzeMood();
		assertEquals("SAD", mood);
	}
	
	@Test
	public void givenMessage_whenNotSad_shouldReturnHappy() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is a happy message");
		String mood = moodAnalyzer.analyzeMood();
		assertEquals("HAPPY", mood);
	}
	
	@Test
	public void givenMessage_whenNull_shouldThrowException() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
		String mood = moodAnalyzer.analyzeMood();
		assertEquals("HAPPY", mood);
	}

}
