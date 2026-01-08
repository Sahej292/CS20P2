package Level1;
import com.phidget22.*;
public class TugOfWar {

	public static void main(String[] args) throws Exception{

		 DigitalInput redButton = new DigitalInput();
	      DigitalOutput redLED = new DigitalOutput();
	     
	      DigitalInput greenButton = new DigitalInput();
	      DigitalOutput greenLED = new DigitalOutput();

	      //Address | Address your four objects which lets your program know where to find them.
	      redButton.setHubPort(0);
	      redButton.setIsHubPortDevice(true);
	      
	      redLED.setHubPort(1);
	      redLED.setIsHubPortDevice(true);
	     
	      greenButton.setHubPort(5);
	      greenButton.setIsHubPortDevice(true);
	      
	      greenLED.setHubPort(4);
	      greenLED.setIsHubPortDevice(true);

	      //Open | Connect your program to your physical devices.
	      redButton.open(1000);
	      redLED.open(1000);
	      
	      greenButton.open(1000);
	      greenLED.open(1000);
	      
	      int GCount= 0;
	      int RCount = 0;
	      
	      boolean prevRed = false;
	      boolean prevGreen = false;
	      
	      System.out.println("READY");
	      Thread.sleep(200);
	      System.out.println("SET");
	      Thread.sleep(200);
	      System.out.println("GO!");
	      Thread.sleep(200);

	      while (true) {
	    	 
	    	  boolean redState = redButton.getState();
	          boolean greenState = greenButton.getState();
	    	 
	          if (redState && !prevRed) {
	              RCount++;
	      }
	          if (greenState && !prevGreen) {
	              GCount++;
	      }
	          if ((RCount == 10 || GCount == 10)) {
	        	  redLED.setState(true);
	                greenLED.setState(true);
	                Thread.sleep(300);
	                redLED.setState(false);
	                greenLED.setState(false);
	                Thread.sleep(300);

	                // Winner LED flashes 5 times
	                if (RCount == 10) {
	                    System.out.println("RED PLAYER WINS!");
	                    for (int i = 0; i < 5; i++) {
	                        redLED.setState(true);
	                        Thread.sleep(200);
	                        redLED.setState(false);
	                        Thread.sleep(200);
	                    }
	                } else {
	                    System.out.println("GREEN PLAYER WINS!");
	                    for (int i = 0; i < 5; i++) {
	                        greenLED.setState(true);
	                        Thread.sleep(200);
	                        greenLED.setState(false);
	                        Thread.sleep(200);
	                    }
	                }

	                break; // End the game
	            }
	          prevRed = redState;
	          prevGreen = greenState;
	          
	          Thread.sleep(100);
	          }
	}

}
