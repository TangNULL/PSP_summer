package program6;

import static org.junit.Assert.*;

import org.junit.Test;

import program5.Program5;

public class Program6Test {

	@Test
	public void testGetXone() {
		Program6 p6=new Program6();
		assertEquals("0.5533809165353887",p6.getX(6, 1.0, 10, 1, 0.20));
	}
	@Test
	public void testGetXtwo() {
		Program6 p6=new Program6();
		assertEquals("1.7530505624599755",p6.getX(15, 1.0, 10, 1, 0.45));
	}
	@Test
	public void testGetXthree() {
		Program6 p6=new Program6();
		assertEquals("4.604095999151468",p6.getX(4, 1.0, 10, 1, 0.495));
	}
}
