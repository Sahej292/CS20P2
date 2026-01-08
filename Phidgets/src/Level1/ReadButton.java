package Level1;

//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
import com.phidget22.*;

public class ReadButton {
    //Handle Exceptions | Exceptions will happen in your code from time to time. These are caused by unexpected things happening. Make sure you’ve added "throws Exception" to your main method.
    public static void main(String[] args) throws Exception{
        
        //Create | Here you've created a DigitalInput object for your button. An object represents how you interact with your device. DigitalInput is a class from the Phidgets library that's used to read the state of your button.
        DigitalInput redButton = new DigitalInput();
        DigitalInput greenButton = new DigitalInput();
        //Address | This tells your program where to find the device you want to work with. Your button is connected to port 0 and your code reflects that. IsHubPortDevice must be set if you are not using a Smart Phidget (more on this later).
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
       
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);

        //Open | Open establishes a connection between your object and your physical Phidget. You provide a timeout value of 1000 to give the program 1000 milliseconds (1 second) to locate your Phidget. If your Phidget can't be found, an exception will be thrown.
        redButton.open(1000);
        greenButton.open(1000);

        boolean lastRedState = redButton.getState();
        boolean lastGreenState = greenButton.getState();

        	
        
       
	while (true) {
                boolean currentRedState = redButton.getState();
                boolean currentGreenState = greenButton.getState();

                // Only print when the RED button state changes
                if (currentRedState != lastRedState) {
                    System.out.println("Red Button State: " + currentRedState);
                    lastRedState = currentRedState;
                }

                // Only print when the GREEN button state changes
                if (currentGreenState != lastGreenState) {
                    System.out.println("Green Button State: " + currentGreenState);
                    lastGreenState = currentGreenState;
                }

        }
    }
}
  