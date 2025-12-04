package Mastery;

import java.util.Scanner;

public class FoodTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        
        
     Food Hamburger = new Food(1.85,9,33,1);
     Food Salad = new Food(2.00,1,11,5);
     Food FrenchFries = new Food(1.30,11,36,4);
     Food Soda = new Food(0.95,0,38,0);
     

     System.out.print("Enter number of hamburgers: ");
     int numHB = input.nextInt();
     
     System.out.println("Each hamburger has "
    		 	+ Hamburger.getFats()+"g of fat, "
    		 	+ Hamburger.getCarbs() + "g of carbs, "
    		 	+ Hamburger.getFiber() + "g of fiber.");
          
     System.out.print("Each number of salads: ");
     int numSalad = input.nextInt();

     System.out.println("Each salad has "
    		 + Salad.getFats() + "g of fat, "
    		 + Salad.getCarbs() + "g of carb, "
    		 + Salad.getFiber() + "g of fiber.");
     
     System.out.print("Each number of fries: ");
     int numFF = input.nextInt();

     System.out.println("French Fries have "
    		 + FrenchFries.getFats() + "g of fat, "
    		 + FrenchFries.getCarbs() + "g of carb, "
    		 + FrenchFries.getFiber() + "g of fiber.");
     
     System.out.print("Each number of sodas: ");
     int numSoda = input.nextInt();

     System.out.println("Each soda has  "
    		 + Soda.getFats() + "g of fat, "
    		 + Soda.getCarbs() + "g of carb, "
    		 + Soda.getFiber() + "g of fiber.");
    		 
     double total = (Hamburger.getPrice() * numHB) + (Salad.getPrice() * numSalad) + (FrenchFries.getPrice() * numFF) + (Soda.getPrice() * numSoda);
     
     System.out.print("Your order comes to: $" + String.format("%.2f", total));
	}

}
