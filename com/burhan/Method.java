package com.burhan;

public class Method {

	public static void main(String[] args){
		
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;
		
		calculateScore(true,800, levelCompleted, bonus);

		calculateScore(false,200, 10, 300);
				

	}


	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

		if(gameOver){
			int finalScore =score + (levelCompleted * bonus);

			finalScore = score + (levelCompleted * bonus);
			finalScore += 1000;
			System.out.println("Your final score was " + finalScore);
			System.out.println(0);
			return finalScore;
		}
		
		System.out.println(-1);
		return -1;
				

	}

}
