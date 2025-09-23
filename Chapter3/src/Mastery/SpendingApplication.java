package Mastery;

import java.util.Scanner;

public class SpendingApplication 
{
	public static void main(String[] args) 
	{

	Scanner input = new Scanner(System.in);  // Create a Scanner object to read user 
	  
	// start off with original prompt and start to ask the categories
	System.out.println("Enter the amount spent last month on the following items ");
	
    System.out.println("Food:  ");
	int food = input.nextInt();
	
	System.out.println("Clothing:  ");
	int clothing  = input.nextInt();
	
	 System.out.println("Entertainment:  ");
	int entertainment = input.nextInt();
	
	System.out.println("Rent:  ");
	int rent = input.nextInt();
	// After getting the amounts, add to get the total 
	int  total = food + clothing + entertainment + rent; 
	
	double foodPercent = (food / total) * 100;
	double clothingPercent = (clothing / total) * 100;
	double entertainmentPercent = (entertainment / total) * 100;
	double rentPercent = (rent / total) * 100;
	
	// Round to 2 decimal places
	foodPercent = Math.round(foodPercent * 100.0) / 100.0;
	clothingPercent = Math.round(clothingPercent * 100.0) / 100.0;
	entertainmentPercent = Math.round(entertainmentPercent * 100.0) / 100.0;
	rentPercent = Math.round(rentPercent * 100.0) / 100.0;
	
	
	System.out.println("Food percent: " + foodPercent + "%");
	System.out.println("Clothing percent: " + clothingPercent + "%");
	System.out.println("Entertainment percent: " + entertainmentPercent + "%");
	System.out.println("Rent percent: " + rentPercent + "%");
	
	
	
	
	

	
	
	

	}
} 
