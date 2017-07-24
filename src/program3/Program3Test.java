package program3;

import static org.junit.Assert.*;

import org.junit.Test;

public class Program3Test {
	double[] Estimated_Proxy_Size={130,650,99,150,128,302,95,945,368,961};
	double[] Plan_Added_and_Modified_size={163,765,141,166,137,355,136,1206,433,1130};
	double[] Actual_Added_and_Modified_Size={186,699,132,272,291,331,199,1890,788,1601};
	double[] Actual_Development_Hours={15.0,69.9,6.5,22.4,28.4,65.9,19.4,198.7,38.8,138.2};
	@Test
	public void testPrintP3one() {
		Program3 p3=new Program3();
		assertEquals ("Beta0 is:"+"-22.55237"+System.lineSeparator()+"Beta1 is:"+"1.727932"+System.lineSeparator()+"Rxy is:"+"0.954497"+System.lineSeparator()+"R2 is:"+"0.911065"+System.lineSeparator()+"Yk is:"+"644.429382",  p3.printP3(Estimated_Proxy_Size, Actual_Added_and_Modified_Size));
	}
	@Test
	public void testPrintP3two() {
		Program3 p3=new Program3();
		assertEquals ("Beta0 is:"+"-4.039016"+System.lineSeparator()+"Beta1 is:"+"0.168127"+System.lineSeparator()+"Rxy is:"+"0.933307"+System.lineSeparator()+"R2 is:"+"0.871062"+System.lineSeparator()+"Yk is:"+"60.858006",  p3.printP3(Estimated_Proxy_Size, Actual_Development_Hours));
	}
	@Test
	public void testPrintP3three() {
		Program3 p3=new Program3();	
		assertEquals ("Beta0 is:"+"-23.923914"+System.lineSeparator()+"Beta1 is:"+"1.430967"+System.lineSeparator()+"Rxy is:"+"0.963114"+System.lineSeparator()+"R2 is:"+"0.927589"+System.lineSeparator()+"Yk is:"+"528.429348",  p3.printP3(Plan_Added_and_Modified_size, Actual_Added_and_Modified_Size));
	}
	@Test
	public void testPrintP3four() {
		Program3 p3=new Program3();
		assertEquals ("Beta0 is:"+"-4.603965"+System.lineSeparator()+"Beta1 is:"+"0.140164"+System.lineSeparator()+"Rxy is:"+"0.948033"+System.lineSeparator()+"R2 is:"+"0.898767"+System.lineSeparator()+"Yk is:"+"49.499339",  p3.printP3(Plan_Added_and_Modified_size, Actual_Development_Hours));
	}
	
}
