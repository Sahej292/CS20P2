
public class RandomNumbers {

	public static void main(String[] args) 
	{
		int randNum;
		int seqlength = 0; 
		do 
		{
			randNum = (int)(11*Math.random());
			System.out.println(randNum +" ");
			seqlength = seqlength +1 ; 
		}while(randNum != 0);
		
		System.out.println("\n"
				+ "Length of Sequence was"
				+ seqlength
				);
	}

}