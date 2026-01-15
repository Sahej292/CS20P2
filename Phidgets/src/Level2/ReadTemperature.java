package Level2;
import com.phidget22.*;

public class ReadTemperature {

	public static void main(String[] args) throws Exception {
		//Create 
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Open 
        temperatureSensor.open(1000);

        //Use your Phidgets 
      
       
        while (true) {
        	 
        	double Ctemp = temperatureSensor.getTemperature();
            double Ftemp = (Ctemp * 1.8) + 32;
             
            Ftemp = Math.round(Ftemp * 100.0) / 100.0;
        	
        	System.out.println("Temperature: " + Ftemp + " °F" );
            Thread.sleep(500);
            System.out.println("Temperature: " + Ctemp + " °C" );
            Thread.sleep(500);
        }
    }
	
}


