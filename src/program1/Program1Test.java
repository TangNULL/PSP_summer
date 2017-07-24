package program1;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class Program1Test {

	@Test
	public void testP1Printone() {
		Program1 p1=new Program1();
		double[] data=p1.getData("E:\\workspace\\programPSP\\src\\program1\\Column1");
		assertEquals ("average is:"+"550.6"+System.lineSeparator()+"standardDeviation is:"+"572.026844746915","average is:"+p1.average(data)+System.lineSeparator()+"standardDeviation is:"+p1.standardDeviation(data));
	}
	@Test
	public void testP1Printtwo() {
		Program1 p1=new Program1();
		double[] data=p1.getData("E:\\workspace\\programPSP\\src\\program1\\Column2");
		assertEquals ("average is:"+"60.32000000000001"+System.lineSeparator()+"standardDeviation is:"+"62.25583060601187","average is:"+p1.average(data)+System.lineSeparator()+"standardDeviation is:"+p1.standardDeviation(data));
	}

}
