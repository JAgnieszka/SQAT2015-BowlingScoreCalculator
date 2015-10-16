package org.unioulu.tol.sqat.bsc;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private List<Integer> scores = new ArrayList<Integer>();
	private Frame bonus;
	
	public BowlingGame(){}
	
	public void addFrame(Frame frame){
		//to be implemented
		frames.add(frame);
		int zz=score();
	}
	
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
	}
	
	public int score(){
		//to be implemented
		/*		int size=frames.size();
		System.out.println("last "+size);
		System.out.println("lasdddt "+frames.get(0));
		for(int i=0; i<size;i++){
			
		} */
		int index=scores.size();
		System.out.println("index "+index);
		int sum= scores.get(index);
		return 0;
	}
	
	public boolean isNextFrameBonus(){
		//to be implemented
		return false;
	}

	public void sentScore(int sum) {
		// TODO Auto-generated method stub
		scores.add(sum);
		
	}
}
