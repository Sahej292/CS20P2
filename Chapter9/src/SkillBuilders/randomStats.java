package SkillBuilders;

public class randomStats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// declare an that one dimension - initalizaing 
		int[] outcomes = new int[10]; // going to use a for loop 
		int outcome; // an array
		
		// storing values into the array
		for (int i =0; i<100; i++) {
			outcome =(int)(10*Math.random());
			outcomes[outcome] += 1; 
			
		}
		 	
		// display what is an array
		for (int i = 0; i < 10; i++) {
			System.out.print(outcomes[i]);
			System.out.println(" ");
			
		}
		
	
	
	
	}

}
