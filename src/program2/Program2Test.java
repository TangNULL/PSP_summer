package program2;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class Program2Test {

	@Test
	public void testPrintP2one() {
		Program2 p2=new Program2();
		File myfile=new File("D:\\workspace\\programPSP\\src\\program2\\p1txt");
		assertEquals("class:"+System.lineSeparator()+"LOC_of_"+"Program1"+":"+"72"+System.lineSeparator()+"method:"+System.lineSeparator()+"LOC_of_P1Print:5"+System.lineSeparator()+"LOC_of_average:16"+System.lineSeparator()+"LOC_of_getData:28"+System.lineSeparator()+"LOC_of_standardDeviation:20",p2.printP2(myfile));
	}
	@Test
	public void testPrintP2two() {
		Program2 p2=new Program2();
		File myfile=new File("D:\\workspace\\programPSP\\src\\program2\\p2txt");
		assertEquals("class:"+System.lineSeparator()+"LOC_of_"+"Program2"+":"+"101"+System.lineSeparator()+"method:"+System.lineSeparator()+"LOC_of_LOC_of_class:39"+System.lineSeparator()+"LOC_of_print:12"+System.lineSeparator()+"LOC_of_LOC_of_method:41"+System.lineSeparator()+"LOC_of_getClassName:5",p2.printP2(myfile));
	}

}
