package pkgTestShape;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgShape.Cuboid;

public class CuboidTest {

	/* I believe that testing the getters using 
	the setters functions is reasonable test for 
	both the setters and getters as both have to 
	work for the tests to work.*/
	@Test
	public void getiWidth() {
		Cuboid cubTest = new Cuboid();
		cubTest.setiWidth(7);
		 assertEquals(7,cubTest.getiWidth());
		
	}
	@Test
	public void getiLength() {
		Cuboid cubTest = new Cuboid();
		cubTest.setiLength(9);
		 assertEquals(9, cubTest.getiLength());
	}
	@Test
	public void getiDepth() {
		Cuboid cubTest = new Cuboid();
		cubTest.setiDepth(11);
		assertEquals(11, cubTest.getiDepth());

	}
	@Test
	public void area() {
		Cuboid cubTest = new Cuboid();
		cubTest.setiWidth(7);
		cubTest.setiLength(9);
		cubTest.setiDepth(11);
		 assert(478 == cubTest.area());
	}
	@Test
	public void volume() {
		Cuboid cubTest = new Cuboid();
		cubTest.setiWidth(23);
		cubTest.setiLength(15);
		cubTest.setiDepth(18);
		assert(6210 == cubTest.volume());
	}
	//Tests meant to check for exceptions are below are below.
	@Test(expected = IllegalArgumentException.class)
	public void area1() {
		Cuboid cubTest = new Cuboid();
		cubTest.setiWidth(7);
		cubTest.setiLength(9);
		cubTest.setiDepth(-11);
		 assertEquals(new IllegalArgumentException(), cubTest.area());
	}
	@Test(expected = UnsupportedOperationException.class)
	public void perimeter() {
		Cuboid cubTest = new Cuboid();
		assertEquals(new UnsupportedOperationException(), cubTest.perimeter());
	}
}
