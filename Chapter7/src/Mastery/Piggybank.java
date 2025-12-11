package Mastery;

public class Piggybank {
 private int pennies;
 private int nickels;
 private int dimes;
 private int quarters;
 
 public Piggybank() {
	 pennies = 0;
	 nickels = 0;
	 dimes = 0;
	 quarters = 0;
 }
 public void AddPennies(int count) {
	 pennies += count;
	}
public void AddNickels(int count) {
	nickels += count;
}

public void AddDimes(int count) {
	dimes += count;
}

public void AddQuarters(int count) {
	quarters += count;
}

public double getTotal() {
    return pennies * 0.01 + nickels * 0.05 + dimes * 0.10 + quarters * 0.25;
}

// Withdraw all money at once
public double withdrawAll() {
    double total = getTotal();
    pennies = 0;
    nickels = 0;
    dimes = 0;
    quarters = 0;
    return total;
}
}