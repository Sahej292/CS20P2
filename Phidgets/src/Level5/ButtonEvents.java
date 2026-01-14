package Level5;
import com.phidget22.*;
public class ButtonEvents {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 //Create
        DigitalInput redButton = new DigitalInput();
        DigitalInput greenButton = new DigitalInput();
        //Address
        redButton.setIsHubPortDevice(true);
        redButton.setHubPort(0);
        
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);

        //Event 
        redButton.addStateChangeListener(new DigitalInputStateChangeListener() {
            public void onStateChange(DigitalInputStateChangeEvent e) {
            	if (e.getState()) {
                    System.out.println("Red Button: Pressed");
                } else {
                    System.out.println("Red Button: Not Pressed");
                }
            }
        });
        
        greenButton.addStateChangeListener(new DigitalInputStateChangeListener() {
            public void onStateChange(DigitalInputStateChangeEvent e) {
            	if (e.getState()) {
                    System.out.println("Green Button: Pressed");
                } else {
                    System.out.println("Green Button: Not Pressed");
                }
            }
        });

        //Open
        redButton.open(1000);
        greenButton.open(1000);
        //Keep program running
        while (true) {
            Thread.sleep(150);
        }
	}

}
