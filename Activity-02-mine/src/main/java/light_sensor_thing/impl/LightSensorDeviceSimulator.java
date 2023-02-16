/**
 * Simulator/mock for a light device
 * 
 */
package lamp_thing.impl;

public class LightSensorDeviceSimulator implements lamp_thing.impl.LightSensorDevice {

	private LampSimFrame frame;
	private String lightID;
	
	public LightSensorDeviceSimulator(String lightID){
		this.lightID = lightID;
	}
	
	public void init() {
		frame = new LampSimFrame(lightID);
		frame.display();
	}
	
	@Override
	public void on() {
		frame.setOn(true);	
	}

	@Override
	public void off() {
		frame.setOn(false);	
	}
}
