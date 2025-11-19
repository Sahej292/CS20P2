package SkillBuilders;

public class student {

	private String FirstName;
	private String lastName;
	private String address;
	private int StuID;
	
	// the same as a class
	public student () //constructor method 
	{
	
		FirstName = "Unknown";
		lastName = "Unknown";
		address = "Unknown";
		StuID = 00000;
	}

	 public student(String f, String l, String ad, int id) { // Overload constructor method 
		 
		 
	 }
	 
	 //Accessor methods 
	 public String getFirstName()
	 {
		 
	return FirstName;
	
	 }
	//Modifier methods
	 public void setFirstName(String f)
	 {
		 FirstName = f;
	 }
	 
	 
	 //TwoString
	 public String toString()
	 {
		 return("First Name: "+ FirstName
				 +"\nLastName: " + lastName
				 + "\nAddress: " + address
				 + "\nStudent Id: " + StuID);
	 }
}
