/**
 * 
 */
package tests;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import vehicles.Airplane;
import vehicles.AirplaneFactory;
import vehicles.FlyingFactory;
import vehicles.Flying;
import vehicles.HarrierFactory;
import vehicles.ModelPlaneFactory;
import vehicles.PassengerAirplaneFactory;

import vehicles.LiftOff;
import vehicles.LiftOffFactory;

/**
 * @author oded
 *
 */
public class AirplaneTest {

	@BeforeClass
	public static void onlyOnce(){
		new FlyingFactory();
		new LiftOffFactory();
	}


	@Test
	public void test1() {
				
		String expectedOutput = "Like a fighter jet";
		String stringReturned = null;
		AirplaneFactory harrierFactory = new HarrierFactory();
		Flying fly = harrierFactory.createFlying();
		LiftOff liftOff = harrierFactory.createLiftOff();
				
		Airplane classUnderTest = new Airplane(liftOff,fly);

		stringReturned = classUnderTest.howDoYouFly();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}

	
	@Test
	public void test2() {
				
		String expectedOutput = "I don't Fly";
		String stringReturned = null;

		AirplaneFactory modelPlaneFactory = new ModelPlaneFactory();
		Flying fly = modelPlaneFactory .createFlying();
		LiftOff liftOff = modelPlaneFactory.createLiftOff();

		Airplane classUnderTest = new Airplane(liftOff,fly);

		stringReturned = classUnderTest.howDoYouFly();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}
	
	@Test
	public void test3() {
				
		String expectedOutput = "Like a passenger airplane";
		String stringReturned = null;
		AirplaneFactory passengerAirplaneFactory = new PassengerAirplaneFactory();
		Flying fly = passengerAirplaneFactory.createFlying();
		LiftOff liftOff = passengerAirplaneFactory.createLiftOff();


		Airplane classUnderTest = new Airplane(liftOff,fly);

		stringReturned = classUnderTest.howDoYouFly();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}
	
	
	@Test
	public void test4() {
				
		String expectedOutput = "Vertically";
		String stringReturned = null;
		
		AirplaneFactory HarrierFactory = new HarrierFactory();
//		Flying fly = flyingFactory.createFlying("Fighter Jet");
//		LiftOff liftOff =  liftOffFactory.createLiftOff("Vertically");
		Flying fly = HarrierFactory.createFlying();
		LiftOff liftOff = HarrierFactory.createLiftOff();
		
		Airplane classUnderTest = new Airplane(liftOff,fly);

		stringReturned = classUnderTest.howDoYouLiftOff();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}
	
	@Test
	public void test5() {
				
		String expectedOutput = "I don't LiftOff";
		String stringReturned = null;
		AirplaneFactory HarrierFactory = new HarrierFactory();
//		Flying fly = flyingFactory.createFlying("Fighter Jet");
//		LiftOff liftOff = liftOffFactory.createLiftOff("don't");;
		Flying fly = HarrierFactory.createFlying();
		LiftOff liftOff = HarrierFactory.createLiftOff();
		
		Airplane classUnderTest = new Airplane(liftOff,fly);

		stringReturned = classUnderTest.howDoYouLiftOff();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}

	@Test
	public void test6() {
				
		String expectedOutput = "Horizontally";
		String stringReturned = null;
		
		AirplaneFactory HarrierFactory = new HarrierFactory();
		Flying fly = HarrierFactory.createFlying();
		LiftOff liftOff = HarrierFactory.createLiftOff();		
		
//		Flying fly = flyingFactory.createFlying("Fighter Jet");
//		LiftOff liftOff = liftOffFactory.createLiftOff("Horizontally");

		Airplane classUnderTest = new Airplane(liftOff,fly);

		stringReturned = classUnderTest.howDoYouLiftOff();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}


}
