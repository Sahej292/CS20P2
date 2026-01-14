package Level4;
import com.phidget22.*;
public class ClosingPhidgets {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 //Create
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Open
        temperatureSensor.open(1000);

        //Use your Phidgets
        System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
        
        //Close your Phidgets
        temperatureSensor.close();
        System.out.println("Temperature (after close): "
                + temperatureSensor.getTemperature() + " °C");

        // Try to open again (this line will NOT be reached)
        temperatureSensor.open(1000);

        // Try to print temperature again
        System.out.println("Temperature (after re-open): "
                + temperatureSensor.getTemperature() + " °C");
    }
    
	
} 


