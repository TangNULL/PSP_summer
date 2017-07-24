package program7;

import static org.junit.Assert.*;

import org.junit.Test;

public class Program7Test {
	double[] Estimated_Proxy_Size={130,650,99,150,128,302,95,945,368,961};
	double[] Plan_Added_and_Modified_Size={163,765,141,166,137,355,136,1206,433,1130};
	double[] Actual_Added_and_Modified_Size={186,699,132,272,291,331,199,1890,788,1601};
	double[] Actua_Development_Hours={15.0,69.9,6.5,22.4,28.4,65.9,19.4,198.7,38.8,138.2};
	
	@Test
	public void testPrintP7one() {
		Program7 p7=new Program7();
		assertEquals("Rxy is:0.9544965741046826"+System.lineSeparator()+"R2 is:0.9110637099775758"+System.lineSeparator()+"tail area is:1.775192207076337E-5"+System.lineSeparator()+"Beta0 is:-22.55253275203438"+System.lineSeparator()+"Beta1 is:1.7279324262069864"+System.lineSeparator()+"Yk is:644.4293837638623"+System.lineSeparator()+"Range is:230.00170191433716"+System.lineSeparator()+"UPI is:874.4310856781995"+System.lineSeparator()+"LPI is:414.4276818495252"+System.lineSeparator(),p7.printP7(Estimated_Proxy_Size, Actual_Added_and_Modified_Size,386));
	}
	@Test
	public void testPrintP7two() {
		Program7 p7=new Program7();
		assertEquals("Rxy is:0.9333068981405511"+System.lineSeparator()+"R2 is:0.871061766116737"+System.lineSeparator()+"tail area is:7.982103461989798E-5"+System.lineSeparator()+"Beta0 is:-4.038881574687579"+System.lineSeparator()+"Beta1 is:0.168126649881629"+System.lineSeparator()+"Yk is:60.858005279621224"+System.lineSeparator()+"Range is:27.55764534154637"+System.lineSeparator()+"UPI is:88.4156506211676"+System.lineSeparator()+"LPI is:33.300359938074855"+System.lineSeparator(),p7.printP7(Estimated_Proxy_Size, Actua_Development_Hours,386));
	}
	@Test
	public void testPrintP7three() {
		Program7 p7=new Program7();
		double[] x={53.10,17.19,45,24.66};
		double[] y={82,36,49,33};
		assertEquals("",p7.printP7(x, y,48.91));
	}
	@Test
	public void testPrintP7four() {
		Program7 p7=new Program7();
		double[] x={53.10,17.19,45,24.66};
		double[] y={190,78,130,174};
		assertEquals("",p7.printP7(x, y,48.91));
	}
	

}
