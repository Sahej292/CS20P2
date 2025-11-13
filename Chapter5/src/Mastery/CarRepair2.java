package Mastery;

import java.util.Scanner;

public class CarRepair2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create a Scanner object to get input from the user
        Scanner input = new Scanner(System.in);  
       int carmodel; 
      
        
        do {
        	 System.out.print("Enter your car model (Enter 0 to quit):  ");
        	 carmodel = input.nextInt();
        	 
        	 if (carmodel == 0) {
        		 break;
        	 }
        	 
        	 
        	 if (carmodel == 119 || carmodel == 179 || carmodel == 189 || carmodel == 195 || carmodel == 221 || carmodel == 780) {
        	            // If the car model matches any defective model, print this message
        	            System.out.println("Your car is defective! It must be repaired.");
        	        } else {
        	            // If the car model does not match any defective model, print this message
        	            System.out.println("Your car is not defective");
        	        }
        } while (true) ;
        
        
        	 
   
	}
	
}



