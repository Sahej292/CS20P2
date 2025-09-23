package Mastery;

import java.util.Scanner;

public class PizzaCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);  


	    	// Ask user for the pizza diameter
	        System.out.print("Enter the diameter of the pizza (in inches): ");
	        int diameter = input.nextInt();


	        // Fixed costs
	        double labor = 0.75;
	        double rent = 1.00;


	        // Materials cost depends on diameter
	        double materials = 0.05 * diameter * diameter;


	        // Total cost
	        double totalCost = labor + rent + materials;


	        // Print result
	        System.out.println("The cost of making a " + diameter + " inch pizza is: $" + totalCost);

	}

}
