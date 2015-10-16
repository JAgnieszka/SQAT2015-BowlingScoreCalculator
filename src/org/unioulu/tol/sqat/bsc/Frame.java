package org.unioulu.tol.sqat.bsc;

public class Frame {
	private int firstThrow;
	private int secondThrow;
	BowlingGame bg =new BowlingGame();
	
	public Frame(int firstThrow, int secondThrow){
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
	}
	//Frame fr=new Frame();
	//the score of a single frame
	public int score(){
		//to be implemented
		bg.addFrame(this);
		int som =bg.score();
		if(som!=0){
			System.out.println("fsfs");
		}
		int sum=firstThrow+secondThrow;
//		Frame frame=new Frame(sum, sum);
		
		
		return sum;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){
		//to be implemented
		return false;
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		//to be implemented
		return false;
	}

	//return whether this is the last frame of the match
	public boolean isLastFrame(){
		//to be implemented
		return false;
	}

	//bonus throws
	public int bonus(){
		//to be implemented
		return 0;
	}
}
