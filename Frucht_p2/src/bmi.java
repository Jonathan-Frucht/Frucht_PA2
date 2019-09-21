import java.util.Scanner;

public class bmi {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		float height,weight,bmi;
		int formula;
		
		System.out.println("Please choose a BMI formula:\n1) Metric\n2) Imperial");
		formula = scnr.nextInt();
		if (formula == 1) {
		System.out.println("Please enter your weight(kilograms):");
		weight = scnr.nextFloat();
		System.out.println("Please enter your height(meters):");
		height = scnr.nextFloat();
			bmi = (weight)/(height * height);
		}
		
		else if (formula == 2) {
			System.out.println("Please enter your weight(pounds):");
			weight = scnr.nextFloat();
			System.out.println("Please enter your height(inches):");
			height = scnr.nextFloat();
			bmi = (703 * weight)/(height * height);
		}
		else
		{
			System.out.println("Your input for the formula was invalid, please try again");
			scnr.close();
			return;
		}
		
		System.out.println("\nYour calculated BMI is: " + bmi);
		System.out.println("\nHere are the BMI categories from the National Heart, Lung, and Blood Institute.");
		System.out.println("Normal BMI: 19 - 24");
		System.out.println("Overweight BMI: 25 - 29");
		System.out.println("Obese BMI: 30 - 39");
		System.out.println("Extreme Obesity BMI: 40 - 54");
		scnr.close();
	}
}
		