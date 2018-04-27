package com.burhan;

public class FloatAndDouble {

		
		public static void main(String[] args){
			

			float pound = 0.45359237f;
			int myIntValue = 5/3;
			float myFloatValue = 5f/3f;
			double myDoubleValue = 5d/3d;

			int totalIntPund = (int)(pound * myIntValue);

			System.out.println("Total int pound is : "+totalIntPund);

			float totalFloatPund = pound * myFloatValue ;

			System.out.println("Total Float pound is : "+totalFloatPund);

			double totalDoublePund = pound * myDoubleValue;

			System.out.println("Total Double pound is : "+totalDoublePund);

			double poundValue = 200d;

			double convertedToKg = poundValue * 0.45359237d;

			System.out.println("Kilogram value is : "+convertedToKg);


		}			

}
