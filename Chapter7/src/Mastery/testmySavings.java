package Mastery;

import java.util.Scanner;

public class testmySavings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        Piggybank bank = new Piggybank(); // Now constructor works
        double totalWithdrawn = 0.0;

       
        System.out.println("1. Show total in bank.");
        System.out.println("2. Add a penny.");
        System.out.println("3. Add a nickel.");
        System.out.println("4. Add a dime.");
        System.out.println("5. Add a quarter.");
        System.out.println("6. Take money out. ");
        System.out.println("Enter 0 to quit");

        int choice;

        do {
            System.out.print("\nEnter choice: ");
            choice = input.nextInt();

            if (choice == 1) {
                System.out.printf("Your total in bank: $%.2f\n", bank.getTotal());
            } else if (choice == 2) {
                bank.AddPennies(1);
               
            } else if (choice == 3) {
                bank.AddNickels(1);
              
            } else if (choice == 4) {
                bank.AddDimes(1);
               
            } else if (choice == 5) {
                bank.AddQuarters(1);
                
                }
            else if (choice == 6) {
            	double withdrawn = bank.withdrawAll(); // Withdraw all money
                totalWithdrawn += withdrawn;

            } else if (choice == 0) {
            	 System.out.printf("\nFinal balance: $%.2f\n", bank.getTotal());
                 System.out.printf("Total withdrawn: $%.2f\n", totalWithdrawn);
            	break;
            } 

        } while (choice != 0);
       
    }

		
		
		

}

