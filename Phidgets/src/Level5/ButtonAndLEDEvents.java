package Level5;
import com.phidget22.*;
public class ButtonAndLEDEvents {
	 static boolean turnRedLEDOn = false;
	 static boolean turnGreenLEDOn = false;
	 
	 static int redButtonCount = 0;
	 static int greenButtonCount = 0;
	 
	 static boolean gameOver = false;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 //Create
        DigitalInput redButton = new DigitalInput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalOutput greenLED = new DigitalOutput();

        //Address
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        
        //Event 
        redButton.addStateChangeListener(new DigitalInputStateChangeListener() {
            public void onStateChange(DigitalInputStateChangeEvent e) {
            	 if (e.getState() && !gameOver) {
                     redButtonCount++;
                     turnGreenLEDOn = true;

                     System.out.println("Red Button Presses: " + redButtonCount);

                     if (redButtonCount >= 10) {
                         gameOver = true;
                         System.out.println("RED BUTTON WINS!");
                     }
                 }
                 if (!e.getState()) {
                     turnGreenLEDOn = false;
                 }
             }
         });
            


   //Event 
        greenButton.addStateChangeListener(new DigitalInputStateChangeListener() {
            public void onStateChange(DigitalInputStateChangeEvent e) {
                if (e.getState() && !gameOver) {
                    greenButtonCount++;
                    turnRedLEDOn = true;

                    System.out.println("Green Button Presses: " + greenButtonCount);

                    if (greenButtonCount >= 10) {
                        gameOver = true;
                        System.out.println("GREEN BUTTON WINS!");
                    }
                }
                if (!e.getState()) {
                    turnRedLEDOn = false;
                }
            }
        });

        // Open
        redLED.open(1000);
        greenLED.open(1000);
        redButton.open(1000);
        greenButton.open(1000);
        
        System.out.println("3");
        Thread.sleep(1000);
        System.out.println("2");
        Thread.sleep(1000);
        System.out.println("1");
        Thread.sleep(1000);
        System.out.println("GO!");
        
        // Main loop
        while (true) {

            // If game over, turn BOTH LEDs on
            if (gameOver) {
                redLED.setState(true);
                greenLED.setState(true);
            } 
            // Otherwise, normal control
            else {
                redLED.setState(turnRedLEDOn);
                greenLED.setState(turnGreenLEDOn);
            }

            Thread.sleep(150);
        }
	}
}



