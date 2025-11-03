package Mastery;

import java.util.Scanner;

public class CarRepair {

    public static void main(String[] args) {
        // Create a Scanner object to get input from the user
        Scanner input = new Scanner(System.in);  

        // Ask the user to enter their car model
        System.out.print("Enter your car model:  ");
        
        // Read the car model as an integer from user input
        int carmodel = input.nextInt();
        
        // Check if the car model is one of the defective models
        if (carmodel == 119 || carmodel == 179 || carmodel == 189 
            || carmodel == 195 || carmodel == 221 || carmodel == 780) {
            // If the car model matches any defective model, print this message
            System.out.print("Your car is defective! It must be repaired.");
        } else {
            // If the car model does not match any defective model, print this message
            System.out.print("Your car is not defective");
        }

        // Close the scanner to prevent resource leak
        input.close();
    }
}