package SkillBuilders;

import java.util.Scanner;

public class RectanglePerimeter {

    public static void main(String[] args) {
        int width;
        int length;
        
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        
        System.out.print("Enter the width: ");
         width = input.nextInt();  // Read an integer from the user

        System.out.print("Enter the length: ");
         length = input.nextInt();

        System.out.println("The Width is: "+ width);
       
        System.out.println("The length is: "+ length);
        
     // Calculate the perimeter
     // Calculate the perimeter
        int perimeter = 2 * width + 2 * length;

        // Display the perimeter
        System.out.println("The perimeter of the rectangle is: " + perimeter); 
        
  
}

	
}
