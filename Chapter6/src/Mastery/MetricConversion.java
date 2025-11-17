package Mastery;

import java.util.Scanner;

public class MetricConversion {
	
	public static void inchesToCentimeters(double inches) {
		double cm = inches * 2.54;
		System.out.print(inches + " inches equals to "  + cm + " centimeters");
		
	}
	
	public static void feetToCentimeters(double feet) {
		double cm = feet * 30;
		System.out.print(feet + " feet equals to "  + cm + " centimeters");
		
	}
	
	public static void yardsToMeters(double yards) {
		double meters = yards * 0.91;
		System.out.print(yards + " yards equals to "  + meters + " meters");
			
	}
	
	public static void milesToKilometers(double miles) {
		double kilometers = miles * 1.6;
		System.out.print(miles + " miles equals to "  + kilometers + " kilometers");
				
	}

	public static void centimetersToInches(double cm) {
		double inches = cm / 2.54;
		System.out.print(cm + " centimeters equals to "  + inches + " inches");
			
	}
	
	public static void centimetersToFeet(double cm) {
		double feet = cm / 30;
		System.out.print(cm + " centimeters equals to "  + feet + " feet");
			
	}
	
	public static void metersToYards(double meters) {
		double yards = meters/ 0.91;
		System.out.print(meters + " meters equals to "  + yards + " yards");
			
	}
	
	public static void kilometersToMiles(double kilometers) {
		double miles = kilometers * 0.91;
		System.out.print(kilometers + " kilometers equals to "  + miles + " miles");
			
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
		 
	System.out.print("Enter a number: ");
	double number= input.nextDouble();
	
	System.out.println("Convert: ");
	
	System.out.println("1. Inches to Centimeters          5. Centimeters to Inches ");
	System.out.println("2. Feet to Centimeters            6. Centimeters to Feet ");
	System.out.println("3. Yards to Meters                7. Meters to Yards");	
	System.out.println("4. Miles to Kilometers            8. Kilometers to Miles ");

	System.out.print("Enter your choice: ");
	int choice = input.nextInt();
	
	if (choice == 1) inchesToCentimeters(number);
    else if (choice == 2) feetToCentimeters(number);
    else if (choice == 3) yardsToMeters(number);
    else if (choice == 4) milesToKilometers(number);
    else if (choice == 5) centimetersToInches(number);
    else if (choice == 6) centimetersToFeet(number);
    else if (choice == 7) metersToYards(number);
    else if (choice == 8) kilometersToMiles(number);
    else System.out.println("Invalid choice."); 
	
	




	
		 
		
	}

}
