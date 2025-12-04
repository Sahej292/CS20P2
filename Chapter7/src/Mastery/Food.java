package Mastery;

public class Food {
		
		private double price;
		private int fats;
		private int carbs;
		private int fiber; // establishing the instance variables 
		public int getCarbs;
		
		//primary food constructor
		// - the values that we pass get stored in the variables above 
		public Food (double price, int fats, int carbs, int fiber) {
			this.price = price;
			this.fats = fats;
			this.carbs = carbs;
			this.fiber = fiber; 
		}
		// allowing other classes to access the private variables
		public double getFats() {
			return fats;
			
		}
		public double getCarbs() {
			return carbs;
			
		}
		
		public double getFiber() {
			return fiber;
			
		}
		public double getPrice() {
			return price;
			
		}






	}


