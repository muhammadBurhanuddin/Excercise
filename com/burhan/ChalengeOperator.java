package com.burhan;

class ChalengeOperators{
	

	public static void main(String[] args){

	
		double a = 20;
		double b = 80;

		double multiAdd = (80+20)*25;

		multiAdd = multiAdd + multiAdd;

		double mod = multiAdd % 40;

		System.out.println("Mod Result :"+mod);

		if(mod <= 20)
			System.out.println("Total was over the limit");

	}

}
