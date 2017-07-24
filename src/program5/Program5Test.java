package program5;

import static org.junit.Assert.*;

import org.junit.Test;

public class Program5Test {

	@Test
	public void testGetPone() {
		Program5 p5=new Program5();
		assertEquals("0.35005863689720107",p5.getP(9, 1.1, 10));
	}
	@Test
	public void testGetPtwo() {
		Program5 p5=new Program5();
		assertEquals("0.3675734051525516",p5.getP(10, 1.1812, 10));
	}
	@Test
	public void testGetPthree() {
		Program5 p5=new Program5();
		assertEquals("0.4949998582485177",p5.getP(30, 2.750, 10));
	}
}
