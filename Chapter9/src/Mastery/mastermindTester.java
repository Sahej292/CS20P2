package Mastery;

import java.util.Scanner;

public class mastermindTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//asking the user how many pegs and colors + getting their answers
		System.out.println("Enter the number of pegs <1-10>: ");
		int numPegs = input.nextInt();
		System.out.println("Enter the number of colors <1-9>: ");
		int numColors = input.nextInt();
		
		// creating a new game 
		 mastermindGame game = new mastermindGame(numPegs, numColors);
		 // introducing our guess variable
	   int guessNum = 1;
	        // while loop for game 
	        while (true) {
	        	// Guess#
	        	System.out.println("Guess" + guessNum + ":");
	        	int[] guess = new int[numPegs];
	        	
	            // Read the user's guess
	            for (int i = 0; i < numPegs; i++) {
	                System.out.print("Color for peg " + (i + 1) + ": ");
	                guess[i] = input.nextInt();
	            }

	            // Check the guess
	            int[] result = game.checkGuess(guess);

	            // Display results
	            System.out.println(
	                "You have " + result[0] + " peg(s) correct and " +
	                (result[1] + result[0]) + " color(s) correct."
	            );

	            // Check win condition
	            if (result[0] == numPegs) {
	                System.out.println(
	                    "\nYou have broken the code in " + guessNum + " guesses."
	                );
	                break;
	            }

	            guessNum++;
	        }
	        }
	}



