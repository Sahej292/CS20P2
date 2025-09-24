import java.util.Scanner;

public class Visitors {

	public static void main(String[] args) {
		int numVisitors = 0; 
		int totalVisitors= 0;
		int avgVisitors = 0;
		
		Scanner input = new Scanner(System.in);
		
		for (int day = 1; day <= 5; day++)
		{
			System.out.println(
							"Enter the number"
						+ "of visitors on day"
						+ day + " : "
							);
			numVisitors = input.nextInt();
			totalVisitors= totalVisitors + numVisitors; 
			
			
						
		} // end of loop
		
		avgVisitors = (totalVisitors / 5);
		System.out.println("The average number of "
				+ "vistors is : "
				+ avgVisitors);

	}

}
