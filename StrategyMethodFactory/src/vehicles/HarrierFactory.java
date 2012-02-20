/**
 * 
 */
package vehicles;



/**
 * @author jwan01
 *
 */
public class HarrierFactory implements AirplaneFactory {

	/* (non-Javadoc)
	 * @see vehicles.AirplaneFactory#createFlying()
	 */
	@Override
	public Flying createFlying() {
		FlyingFactory flyingFactory = new FlyingFactory();
		return flyingFactory.createFlying("Fighter Jet");
	}

	/* (non-Javadoc)
	 * @see vehicles.AirplaneFactory#createLiftOff()
	 */
	@Override
	public LiftOff createLiftOff() {
		LiftOffFactory liftOffFactory = new LiftOffFactory();
		return liftOffFactory.createLiftOff("Vertically");
	}
	
}
