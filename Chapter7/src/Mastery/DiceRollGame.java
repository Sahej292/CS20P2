package Mastery;

import java.util.Scanner;

public class DiceRollGame {
	static int score = 1000; 
	static Die die1 = new Die();
	static Die die2 = new Die();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.println("You have " + score + " points.");
			
			System.out.println("How many points do you want to risk? (-1 to quit)");
			int risk = input.nextInt();
			
			if (risk == -1) {
				break;
			}
		
			System.out.println("Make a call (0 for low, 1 for high) ");
			int call = input.nextInt(); 
			 String choice;
	            if (call == 0) {
	                choice = "low";
	            } else {
	                choice = "high";
	            }
			
	        die1.roll();
			die2.roll();
			
			int total = die1.getValue() + die2.getValue();
			
			System.out.println("You rolled: " + total);
			
			 // Apply game rules
            if (total == 7) {
                score -= risk;  // automatic loss
            }
            else if (total >= 2 && total <= 6 && choice.equals("low")) {
                score += risk * 2; // correct low guess
            }
            else if (total >= 8 && total <= 12 && choice.equals("high")) {
                score += risk * 2; // correct high guess
            }
            else {
                score -= risk; // wrong guess
            }

            // Show updated score
            System.out.println("You now have " + score + " points");
            
            if (score == 0) {
            	break;
            }
			
			
			
		}
		
		
		

	}

}
