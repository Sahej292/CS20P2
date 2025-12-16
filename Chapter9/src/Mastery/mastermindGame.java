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
		
		Random rand = new Random();
		for (int i = 0; i < numPegs; i++) {
			secretcode[i] = rand.nextInt(numColors) +1;	
			
		
		}
	}
public int[] checkGuess(int[] guess) {
	int exact = 0;
	int colorOnly = 0; 
	
	int[] secretCount = new int[numColors + 1];
    int[] guessCount = new int[numColors + 1];
	
    for (int i = 0; i < numPegs; i++) {
        // code is cracked
    	if (guess[i] == secretcode[i]) {
            exact++;
        } else {
            // wrong code --- adding of guess
        	secretCount[secretcode[i]]++;
            guessCount[guess[i]]++;
        }
    }
    for (int c = 1; c <= numColors; c++) {
        if (secretCount[c] < guessCount[c]) {
            colorOnly += secretCount[c];
        } else {
            colorOnly += guessCount[c];
        }
    }
	return new int[] {exact, colorOnly};

}


    }


	
