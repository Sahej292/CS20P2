package Level2;
import com.phidget22.*;
public class HotAndCold {

	public static void main(String[] args) throws Exception {
	    TemperatureSensor temperatureSensor = new TemperatureSensor();
	    
	    TemperatureSensor temperatureSensor1 = new TemperatureSensor();
        DigitalOutput greenLED = new DigitalOutput();
        DigitalOutput redLED = new DigitalOutput();

        // Address LEDs (adjust ports if needed)
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);

        // Open devices
        temperatureSensor1.open(1000);
        greenLED.open(1000);
        redLED.open(1000);

        // Use your Phidgets
        while (true) {
        
        	double temperature = temperatureSensor1.getTemperature();

            // Output exact temperature
            System.out.println("Temperature: " + temperature + " °C");

            // Check temperature range
            if (temperature >= 20 && temperature <= 24) {
                greenLED.setState(true);   // Comfortable range
                redLED.setState(false);
            } else {
                redLED.setState(true);     // Outside range
                greenLED.setState(false);
            }

            Thread.sleep(150);
        }
    }

	}


