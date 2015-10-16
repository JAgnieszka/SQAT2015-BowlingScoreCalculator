package org.unioulu.tol.sqat.bsc;

public class Frame {
	private int firstThrow;
	private int secondThrow;
	// BowlingGame bg =new BowlingGame();

	public Frame(int firstThrow, int secondThrow) {
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
	}

	public Frame() {
		// TODO Auto-generated constructor stub
		super();
	}

	// the score of a single frame
	public int score() {
		BowlingGame bg = new BowlingGame();
		int oldScore = bg.score();

		int sum = firstThrow + secondThrow;
		bg.sentScore(sum);

		System.out.println("oldScore " + oldScore);
		// Frame frame=new Frame(sum, sum);
		int result = sum + oldScore;

		return result;
	}

	// returns whether the frame is a strike or not
	public boolean isStrike() {
		// to be implemented
		return false;
	}

	// return whether a frame is a spare or not
	public boolean isSpare() {
		// to be implemented
		return false;
	}

	// return whether this is the last frame of the match
	public boolean isLastFrame() {
		// to be implemented
		return false;
	}

	// bonus throws
	public int bonus() {
		// to be implemented
		return 0;
	}
}
