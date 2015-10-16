package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;



import org.junit.Test;
import org.unioulu.tol.sqat.bsc.BowlingGame;
import org.unioulu.tol.sqat.bsc.Frame;

public class TestBowlingScoreCalculator {

	@Test
	public void testFirstFrame() {
		Frame frame = new Frame(1 , 4);
		int result = frame.score();
		assertEquals(5, result);
	}

}
