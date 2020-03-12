import java.util.Scanner;

public class ComputeAndInterpretBMI {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter weight in kilograms: ");
		double weight = input.nextDouble();
		
		System.out.print("Enter height in meters: ");
		double height = input.nextDouble();
		
		//final double KILOGRAMS_PER_POUND = 0.45359237;
		//final double METERS_PER_INCH = 0.0254;
		
		//double weightInKilograms = weight * KILOGRAMS_PER_POUND;
		//double heightInMeters = height * METERS_PER_INCH;
		double bmi = weight / (height * height);
		
		System.out.println("BMI is " + bmi);
		if (bmi < 18.5)
			System.out.println("Underweight");
		else if (bmi < 25)
			System.out.println("Normal");
		else if (bmi < 30)
			System.out.println("OverWeight");
		else
			System.out.println("Obese");
	}

}
