package SkillBuilders;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);  // Create a Scanner object to read user 
		  
		  System.out.print("Enter a two digit number: ");
	     int number = input.nextInt();  // Read an digits from user
	     
	     int tens, ones; // Declare the space for tens and ones
	     
	     tens = number/ 10;
	     ones= number % 10;
	     
	    System.out.println("Tens= " + tens);
	    System.out.println("Ones= " + ones);
	}
	
	  
}
