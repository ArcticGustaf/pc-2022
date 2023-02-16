package lamp_thing.impl;

import io.vertx.core.Vertx;

/**
 * Launching the Lamp Thing service.
 * 
 * @author aricci
 *
 */
public class RunLampThingService {

	public static void main(String[] args) {
		Vertx vertx = Vertx.vertx();

		LampDeviceThingModel model = new LampDeviceThingModel("MyLamp");
		model.setup(vertx);
		
		LightSensorDeviceThingService service = new LightSensorDeviceThingService(model);
		vertx.deployVerticle(service);
	}

}
