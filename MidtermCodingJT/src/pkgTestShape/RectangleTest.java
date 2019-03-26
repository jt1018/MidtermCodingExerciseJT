package pkgTestShape;

import static org.junit.Assert.*;
import org.junit.Test;

import pkgShape.Rectangle;

public class RectangleTest {
	/* I believe that testing the getters using 
	the setters functions as reasonable test for 
	both the setters and getters as both have to 
	work for the tests to work.*/
	@Test
	public void getiWidth() {
		Rectangle recTest = new Rectangle();
		 recTest.setiWidth(7);
		 assertEquals(7,recTest.getiWidth());
		
	}
	@Test
	public void getiLength() {
		Rectangle recTest = new Rectangle();
		 recTest.setiLength(9);
		 assertEquals(9, recTest.getiLength());
		
	}
	@Test
	public void area1() {
		Rectangle recTest = new Rectangle();
		 recTest.setiWidth(7);
		 recTest.setiLength(9);
		 assert(63 == recTest.area());
	}
	@Test
	public void perimeter1() {
		Rectangle recTest = new Rectangle();
		recTest.setiWidth(8);
		recTest.setiLength(10);
		assert(36 == recTest.perimeter());
	}
	// The tests below are for if there are negative values in length or width.
	@Test(expected = IllegalArgumentException.class)
	public void area2() {
		Rectangle recTest = new Rectangle();	
		recTest.setiWidth(-7);
		recTest.setiLength(9);
	 assertEquals(new IllegalArgumentException(), recTest.area());
	} 
	@Test(expected =IllegalArgumentException.class)
	public void perimeter2() {
		Rectangle recTest = new Rectangle();
		recTest.setiWidth(8);
		recTest.setiLength(-10);
		assertEquals(new IllegalArgumentException(), recTest.perimeter());
	}
	}

	
	
	
	

