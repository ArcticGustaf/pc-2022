package lamp_thing.consumer;

import io.vertx.core.Future;
import io.vertx.core.Vertx;
import light_sensor_thing.consumer.LightSensorThingMQTTProxy;

public class RunLightSensorDeviceThingConsumerHTTP {

	static final int LAMP_THING_PORT = 8890; //HTTP port

	public static void main(String[] args) throws Exception {
		Vertx vertx = Vertx.vertx();
		
		LightSensorThingMQTTProxy thing = new LightSensorThingMQTTProxy("my-consumer","MyLamp", "localhost", LAMP_THING_PORT);
		Future<Void> fut = thing.setup(vertx);
		
		fut.onSuccess(h -> {
			vertx.deployVerticle(new VanillaLightSensorDeviceThingConsumerAgent(thing));
		});
	}

}
