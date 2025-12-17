package Mastery;

import java.util.Random;
// Introducing your variables --- 
public class mastermindGame {
	private int[] secretcode;
	private int numPegs;
	private int numColors;
	// 
	public mastermindGame(int numPegs, int numColors) {
		this.numColors= numColors;
		this.numPegs= numPegs;
		secretcode = new int [numPegs];
		// randomizer
		Random rand = new Random();
		for (int i = 0; i < numPegs; i++) {
			secretcode[i] = rand.nextInt(numColors) +1;	
			
		
		}
	}
public int[] checkGuess(int[] guess) {
	int colorsAndpegs = 0; //the correct code-> correct color and position
	int colors = 0; // the colors regardless of position 
	
	//creating array's --> index starts at 1
	
	int[] secretCount = new int[numColors + 1]; //how many times each color in the code
    int[] guessCount = new int[numColors + 1]; // how many times each color appears in the guess
	
    for (int i = 0; i < numPegs; i++) {
        // check if guessed color matches the secret code
    	if (guess[i] == secretcode[i]) { //if code is correct
            colorsAndpegs++;
        } else {
            // wrong code --- adding of guess
        	secretCount[secretcode[i]]++; // if code is not correct
            guessCount[guess[i]]++;
        }
    }
    for (int c = 1; c <= numColors; c++) {  
        if (secretCount[c] < guessCount[c]) {
            colors += secretCount[c];
        } else {
            colors += guessCount[c]; 
        }
    }
	return new int[] {colorsAndpegs, colors};

}


    }


	
