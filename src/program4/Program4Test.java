package program4;

import static org.junit.Assert.*;

import org.junit.Test;

public class Program4Test {

	@Test
	public void testPrintP4one() {
		int[][] class_method={{18,3},{18,3},{25,3},{31,3},{37,3},{82,5},{82,4},{87,4},{89,4},{230,10},{85,3},{87,3},{558,10}};
		double[] data=new double[class_method.length];
		for(int i=0;i<data.length;i++){
			data[i]=class_method[i][0]/(0.0+class_method[i][1]);
		}
		Program4 p4=new Program4();
		double[] result=p4.getRange(data);
		assertEquals("VS is:4.395269124478685"+System.lineSeparator()+"S is:8.508138249389225"+System.lineSeparator()+"M is:16.469620953940062"+System.lineSeparator()+"L is:31.881053929269868"+System.lineSeparator()+"LV is:61.713721431934815"+System.lineSeparator(),p4.printP4(result));
	}
	@Test
	public void testPrintP4two() {
		double[] data={7,12,10,12,10,12,12,12,12,8,8,8,20,14,18,12};
		Program4 p4=new Program4();
		double[] result=p4.getRange(data);
		assertEquals("VS is:6.337517961211724"+System.lineSeparator()+"S is:8.43928111212605"+System.lineSeparator()+"M is:11.238069244993518"+System.lineSeparator()+"L is:14.965042481379406"+System.lineSeparator()+"LV is:19.928022473189476"+System.lineSeparator(),p4.printP4(result));
	}

}
