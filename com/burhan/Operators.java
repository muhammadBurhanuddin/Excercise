package com.burhan;

class Operators {

	public static void main(String[] args){

		double a = 20;
		double b = 80;

		double result = (a+b)*25;

		double modResult =result + 40;

		System.out.println((modResult<=20) ? "Total was over limit":"ok"); 	
		
		result++;
		
		System.out.println("Result is now " + result);

		result--;

		System.out.println("Result is now " + result);

		result+=2;

		System.out.println("Result is now " + result);

		result*=10;

		System.out.println("Result is now " + result);

		result-=10;

		System.out.println("Result is now " + result);

		result/=10;

		System.out.println("Result is now " + result);



		booelan isAlien = false;

		if(isAlien == true)
			System.out,println("It is not an alien!");


		int topScore = 80;

		if(topScore >= 80)
			System.out.println("you has a  highscore");

		
		
		

	}
}
