package day3;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please select Imperial (pounds/inches) measurements by entering '1' or metric (meters/kilograms) units by pressing '2'");
		
		int units = scanner.nextInt();
		System.out.println(units);
		
		switch (units) {
		case 1:
			System.out.println("Using Imperial measurements for BMI Calculations");
			System.out.println("Enter your weight in pounds");
			
			double weightImp = scanner.nextDouble();

			System.out.println("Enter your height in inches");
			
			double heightImp = scanner.nextDouble();
			//BMI (Imperial units) = weight * 703 / height * height
			double bmiImp = (weightImp*703)/(heightImp*heightImp);
			
			System.out.println("Your BMI is = "+bmiImp);
			
			if (bmiImp<16)
			{
				System.out.println("You are considered severely under weight");
			}
			
			else if (bmiImp>=16 && bmiImp<=16.9)
			{
			System.out.println("You are considered moderately under weight");
			}			
			
			else if (bmiImp>=17 && bmiImp<=18.5)
			{
			System.out.println("You are considered slightly under weight");
			}
			
			else if (bmiImp>=18.5 && bmiImp<=24.9)
			{
			System.out.println("You are considered Normal weight");
			}
			
			else if (bmiImp>=25 && bmiImp<=29.9)
			{
			System.out.println("You are considered over weight");
			}
			
			else if (bmiImp>=30 && bmiImp<=34.9)
			{
			System.out.println("You are considered slightly obese");
			}
			
			else if (bmiImp>=35 && bmiImp<=39.9)
			{
			System.out.println("You are considered moderately obese");
			}
			
			else if (bmiImp>=40)
			{
			System.out.println("You are considered severely obese");
			}
						
			break;
									
		case 2:
			System.out.println("Using Metric units for BMI Calculations");
			System.out.println("Enter your weight in kilograms");
			
			double weightMet = scanner.nextDouble();
			
			System.out.println("Enter your height in meters");
			
			double heightMet = scanner.nextDouble();
			//BMI (Metric units) = weight (kg) / height * height
			double bmiMet = weightMet/(heightMet*heightMet);
			
			System.out.println("Your BMI is = "+bmiMet);
			
			if (bmiMet<16)
			{
				System.out.println("You are considered severely under weight");
			}
			
			else if (bmiMet>=16 && bmiMet<=16.9)
			{
			System.out.println("You are considered moderately under weight");
			}			
			
			else if (bmiMet>=17 && bmiMet<=18.5)
			{
			System.out.println("You are considered slightly under weight");
			}
			
			else if (bmiMet>=18.5 && bmiMet<=24.9)
			{
			System.out.println("You are considered Normal weight");
			}
			
			else if (bmiMet>=25 && bmiMet<=29.9)
			{
			System.out.println("You are considered over weight");
			}
			
			else if (bmiMet>=30 && bmiMet<=34.9)
			{
			System.out.println("You are considered slightly obese");
			}
			
			else if (bmiMet>=35 && bmiMet<=39.9)
			{
			System.out.println("You are considered moderately obese");
			}
			
			else if (bmiMet>=40)
			{
			System.out.println("You are considered severely obese");
			}
			
			break;
			
		default:
			System.out.println("Invalid Choice");
			
		}
		
				
	}

}
