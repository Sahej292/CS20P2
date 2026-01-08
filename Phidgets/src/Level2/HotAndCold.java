package Level2;
import com.phidget22.*;
public class HotAndCold {

	public static void main(String[] args) throws Exception {
	    TemperatureSensor temperatureSensor = new TemperatureSensor();
	    
	    DigitalInput redButton = new DigitalInput();
	    DigitalOutput redLED = new DigitalOutput();
	     
	    DigitalInput greenButton = new DigitalInput();
	    DigitalOutput greenLED = new DigitalOutput();
	    
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
	      
	    while (true) {
	    	 double temp = temperatureSensor.getTemperature();
	       if (temp >= 20 && temp <= 24 ) {
	    	   greenLED.setState(true);
               
	       } else {
	    	   redLED.setState(true);
	       }
	    	
	    }
	}

}
