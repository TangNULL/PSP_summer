package program8;

import static org.junit.Assert.*;

import org.junit.Test;

public class Program8Test {
	Program8 p8=new Program8();
	@Test
	public void testPrintP8one() {
		double[] w={345,168,94,187,621,255};
		double[] x={65,18,0,185,87,0};
		double[] y={23,18,0,98,10,0};
		double[] z={31.4,14.6,6.4,28.3,42.1,15.3};
		double Wk=185;
		double Xk=150;
		double Yk=45;
		assertEquals("Beta0 is:0.566457469602117"+System.lineSeparator()+"Beta1 is:0.06532925469423224"+System.lineSeparator()+"Beta2 is:0.008718736194583604"+System.lineSeparator()+"Beta3 is:0.1510486476103509"+System.lineSeparator()+"Projected Hours is:20.757369159688412"+System.lineSeparator()+"UPI is:26.88884087739668"+System.lineSeparator()+"LPI is:14.625897441980143",p8.printP8(w, x, y, z, Wk, Xk, Yk));
	}
	@Test
	public void testPrintP8two() {
		double[] w={1142,863,1065,554,983,256};
		double[] x={1060,995,3205,120,2896,485};
		double[] y={325,98,23,0,120,88};
		double[] z={201,98,162,54,138,61};
		double Wk=650;
		double Xk=3000;
		double Yk=155;
		assertEquals("Beta0 is:6.701336536389064"+System.lineSeparator()+"Beta1 is:0.07836603673386552"+System.lineSeparator()+"Beta2 is:0.015041331199344934"+System.lineSeparator()+"Beta3 is:0.2460563325801476"+System.lineSeparator()+"Projected Hours is:140.90198556135934"+System.lineSeparator()+"UPI is:179.75176949346994"+System.lineSeparator()+"LPI is:102.05220162924874",p8.printP8(w, x, y, z, Wk, Xk, Yk));
	}

}
