package Mastery;

import java.util.Scanner;

public class CarRepair {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);  


	    	// Ask user for the pizza diameter
	        System.out.print("Enter your car model (Type 0 for program to end):  ");
	        int carmodel = input.nextInt();
	        
	        
	        if (carmodel== 119  || carmodel == 179 || carmodel==189 || carmodel==195 || carmodel == 221|| carmodel == 780 )
	        	System.out.print("Your car is defective! It must be repaired.");
	        else
	        	System.out.print("Your car is not defective");
	        
		
}
}
