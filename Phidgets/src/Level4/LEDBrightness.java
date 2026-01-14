package Level4;
import com.phidget22.*;

public class LEDBrightness {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		  // Create LED
        DigitalOutput redLED = new DigitalOutput();

        // Address LED
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);

        // Open LED
        redLED.open(1000);

        // Brightness increases
        for (double i = 0.0; i <= 1.0; i += 0.2) {
            redLED.setDutyCycle(i);
            Thread.sleep(300);
        }

        // Brightness decreases
        for (double i = 1.0; i >= 0.0; i -= 0.2) {
            redLED.setDutyCycle(i);
            Thread.sleep(300);
        }

        // LED off
        redLED.setDutyCycle(0.0);
    }

	}


