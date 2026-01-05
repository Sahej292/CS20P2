package Level1;

import com.phidget22.*;

public class BlinkLED {

	public static void main(String[] args) throws Exception {
		 DigitalOutput greenLED = new DigitalOutput();
		 DigitalOutput redLED = new DigitalOutput();

	        //Address 
	        greenLED.setHubPort(5);
	        greenLED.setIsHubPortDevice(true);
	        redLED.setHubPort(1);
	        redLED.setIsHubPortDevice(true);
	        //Open 
	        greenLED.open(1000);
	        redLED.open(1000);

	        //Use your Phidgets 
	        while(true){
	            greenLED.setState(true);
	            Thread.sleep(2000);
	            greenLED.setState(false);
	            Thread.sleep(1000);
	            
	            redLED.setState(true);
	            Thread.sleep(2000);
	            redLED.setState(false);
	            Thread.sleep(1000);
	            
	}
	}
}
