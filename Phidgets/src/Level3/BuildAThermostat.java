package Level3;
import com.phidget22.*;

public class BuildAThermostat {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	    TemperatureSensor temperatureSensor = new TemperatureSensor();

        DigitalInput greenButton = new DigitalInput();
        DigitalInput redButton = new DigitalInput();

        DigitalOutput greenLED = new DigitalOutput();
        DigitalOutput redLED = new DigitalOutput();

        // Address devices
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);

        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);

        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);

        // Open devices
        temperatureSensor.open(1000);
        greenButton.open(1000);
        redButton.open(1000);
        greenLED.open(1000);
        redLED.open(1000);

        // Starting set temperature
        int setTemperature = 21;

      
        while (true) {
        	if (greenButton.getState()) {
        		setTemperature += 1;
        		System.out.println("Current Temp: " + setTemperature + "°C" );
        	}
        	else if (redButton.getState()) {
        		setTemperature -=1; 
        		System.out.println("Current Temp: " + setTemperature + "°C");
        	}
        	if (setTemperature < 24 && setTemperature > 18) {
            	greenLED.setState(true);
            	redLED.setState(false);
            	Thread.sleep(200);
            }
            else {
            	redLED.setState(true);
            	greenLED.setState(false);
            	Thread.sleep(200);
            }
    }
        
	}
}


