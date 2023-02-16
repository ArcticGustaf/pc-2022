package light_sensor_thing.consumer;

import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

/**
 * Toy LightThing API 
 *   
 * @author aricci
 *
 */
public interface LightSensorThingAPI {
	
	/**
	 * Get the TD
	 * 
	 * @return
	 */
	Future<JsonObject> getTD();
	
	/* properties */

	/**
	 * 
	 * Get the light sensor
	 * 
	 */
	Future<Double> getLightLevel();

	/**
	 * 
	 * Get light level
	 * @param handler
	 * @return
	 */


	Future<Void> subscribe(Handler<JsonObject> handler);
}
