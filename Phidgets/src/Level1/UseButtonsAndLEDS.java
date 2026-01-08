package Level1;

//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
import com.phidget22.*;

public class UseButtonsAndLEDS {
    public static void main(String[] args) throws Exception{

      //Create | Create objects for your buttons and LEDs.
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

      boolean prevRedState = false;
      boolean prevGreenState = false;
      int GCounter = 0; 
      int RCounter = 0; 
      
      
      while (true) {

          boolean redState = redButton.getState();
          boolean greenState = greenButton.getState();

          // GREEN button controls RED LED (inverted)
          redLED.setState(!greenState);

          // RED button controls GREEN LED (inverted)
          greenLED.setState(!redState);

          // Count GREEN button press
          if (greenState && !prevGreenState) {
              GCounter++;
              System.out.println("Number of Green Button presses: " + GCounter);
          }

          // Count RED button press
          if (redState && !prevRedState) {
              RCounter++;
              System.out.println("Number of Red Button presses: " + RCounter);
          }

          // Update previous states
          prevGreenState = greenState;
          prevRedState = redState;

          Thread.sleep(200);
}
    }
}
