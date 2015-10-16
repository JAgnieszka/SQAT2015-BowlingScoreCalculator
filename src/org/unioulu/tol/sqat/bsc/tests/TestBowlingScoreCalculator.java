package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;



import org.junit.Test;
import org.unioulu.tol.sqat.bsc.BowlingGame;
import org.unioulu.tol.sqat.bsc.Frame;

public class TestBowlingScoreCalculator {

	@Test
	public void testFirstFrame() {
		Frame frame = new Frame(1 , 4);
		
		BowlingGame bg = new BowlingGame();
		//bg.addFrame(frame);
		
		int result = frame.score();
		assertEquals(5, result);
	}

	@Test
		public void testSecondFrame() {
			Frame frame = new Frame(4 , 5);
			int result = frame.score();
			assertEquals(14, result);
		}
}
