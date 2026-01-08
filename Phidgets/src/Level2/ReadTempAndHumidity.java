package Level2;
import com.phidget22.*;
public class ReadTempAndHumidity {

	public static void main(String[] args) throws Exception {
		 //Create 
        HumiditySensor humiditySensor = new HumiditySensor();
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Open 
        humiditySensor.open(1000);
        temperatureSensor.open(1000);

        //Use your Phidgets 
        while(true){
            double temp = temperatureSensor.getTemperature();
            double humid = humiditySensor.getHumidity();
            
            if (temp > 21) {
            	System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
            	Thread.sleep(300);
            } else {
            	System.out.println("Room is too cold ");
            	Thread.sleep(300);
            	
            } 
            
            if (humid > 30) {
            	System.out.println("Humidity: " + humiditySensor.getHumidity() +" %RH");
        } else {
        	System.out.println("Humidity is low");
            Thread.sleep(300);
        }
            Thread.sleep(150);

        }

	}
}





