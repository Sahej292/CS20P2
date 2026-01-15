
package Level5;
import com.phidget22.*;
public class AttachAndDetachEvents {

	public static void main(String[] args) throws Exception {
		//Create
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        DigitalInput redButton = new DigitalInput();
        DigitalInput greenButton = new DigitalInput();
        
        DigitalOutput redLED = new DigitalOutput();
        DigitalOutput greenLED = new DigitalOutput();
        
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        //Data Event 
        temperatureSensor.addTemperatureChangeListener(new TemperatureSensorTemperatureChangeListener() {
            public void onTemperatureChange(TemperatureSensorTemperatureChangeEvent e) {
                
            }
        });

        //Attach Event 
        temperatureSensor.addAttachListener(new AttachListener() {
            public void onAttach(AttachEvent e) {
                System.out.println("Attach Temperature Sensor");
            }
        });
        
        redButton.addAttachListener(new AttachListener() {
            public void onAttach(AttachEvent e) {
                System.out.println("Attach Red Button");
            }
        });

        greenButton.addAttachListener(new AttachListener() {
            public void onAttach(AttachEvent e) {
                System.out.println("Attach Green Button");
            }
        });

        redLED.addAttachListener(new AttachListener() {
            public void onAttach(AttachEvent e) {
                System.out.println("Attach Red LED");
            }
        });

        greenLED.addAttachListener(new AttachListener() {
            public void onAttach(AttachEvent e) {
                System.out.println("Attach Green LED");
            }
        });
        
        

        //Detach Event 
        temperatureSensor.addDetachListener(new DetachListener() {
            public void onDetach(DetachEvent e) {
                System.out.println("Detach Temperature Sensor");
            }
        });
        redButton.addDetachListener(new DetachListener() {
            public void onDetach(DetachEvent e) {
                System.out.println("Detach Red Button");
            }
        });

        greenButton.addDetachListener(new DetachListener() {
            public void onDetach(DetachEvent e) {
                System.out.println("Detach Green Button");
            }
        });

        redLED.addDetachListener(new DetachListener() {
            public void onDetach(DetachEvent e) {
                System.out.println("Detach Red LED");
            }
        });

        greenLED.addDetachListener(new DetachListener() {
            public void onDetach(DetachEvent e) {
                System.out.println("Detach Green LED");
            }
        });
        

        

        //Open
        temperatureSensor.open(1000);
        redButton.open(1000);
        greenButton.open(1000);
        redLED.open(1000);
        greenLED.open(1000);


        //Keep program running
        while (true) {
            Thread.sleep(150);
        }
    }
	}


