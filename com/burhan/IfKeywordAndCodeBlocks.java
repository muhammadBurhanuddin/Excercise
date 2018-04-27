package com.burhan;

public class IfKeywordAndCodeBlocks {


	public static void main(String[] args){
	
	boolean gameOver = true;
	int score = 10000;
	int levelCompleted =8;
	int bonus = 200 ;

	if(gameOver){
		
		int finalScore = score + (levelCompleted * bonus);
		int secondScore = score +(levelCompleted * bonus); 
		System.out.println("Your final score was " + finalScore);
		System.out.println("Your second score was "+ secondScore);

	}	
     }
}
