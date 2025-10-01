package Mastery;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);  // Create a Scanner object to read user 

		// Ask user for the pizza diameter
        System.out.print("Enter your grade: ");
        
        int gradepercentage = input.nextInt();

        
       if (gradepercentage >= 90 && gradepercentage <= 100) {
    	   System.out.print("A");
            } else if (gradepercentage >= 80 && gradepercentage < 90) {
            	 System.out.print("B");            
            	 
           } else if (gradepercentage >= 70 && gradepercentage < 80) {
        	   System.out.print("C");
            } else if (gradepercentage >= 60 && gradepercentage < 70) {
            	 System.out.print("D");
        }
        	

     
	}

}
