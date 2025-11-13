package Mastery;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner input = new Scanner(System.in);  
		  
		  System.out.print("Enter first number: ");
		  int num1 = input.nextInt();
		  
		  System.out.print("Enter second number: "); 
		  int num2 = input.nextInt();
		  
		 int temp; 
		 
		  while (num2 > 0) {
			  temp = num1 % num2;
			  num1 = num2;
			  num2 = temp;
			 }
		  
		  System.out.print("The GCD is " + num1);
	}

}
