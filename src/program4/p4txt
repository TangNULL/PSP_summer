package program4;

import program1.Program1;
import program3.Program3;

public class Program4 {//@C
	//Program4
	public double[] getRange(double[] data){//@F
		//getRange
		double result[]=new double[5];
		Program1 p1=new Program1();
		Program3 p3=new Program3();
		double[] ln_data=new double[data.length];
		for(int i=0;i<data.length;i++){
			ln_data[i]=Math.log(data[i]);
		}
		double avg=p1.average(ln_data);
		double[] temp=new double[data.length];
		for(int i=0;i<data.length;i++){
			temp[i]=ln_data[i]-avg;
		}
		double var=p3.sum_pow_two(temp)/(data.length-1+0.0);
		double delta=Math.pow(var, 0.5);
		result[0]=Math.pow(Math.E, avg-2*delta);
		result[1]=Math.pow(Math.E,avg-delta);
		result[2]=Math.pow(Math.E,avg);
		result[3]=Math.pow(Math.E,avg+delta);
		result[4]=Math.pow(Math.E,avg+2*delta);
		return result;
	}//@f
	public String printP4(double[] data){//@F
		//printP4
		StringBuffer str=new StringBuffer();
		str.append("VS is:"+data[0]+System.lineSeparator());
		str.append("S is:"+data[1]+System.lineSeparator());
		str.append("M is:"+data[2]+System.lineSeparator());
		str.append("L is:"+data[3]+System.lineSeparator());
		str.append("LV is:"+data[4]+System.lineSeparator());
		return str.toString();
	}//@f
}//@c
