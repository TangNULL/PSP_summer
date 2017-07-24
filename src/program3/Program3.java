package program3;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import program1.Program1;
public class Program3 {//@C
	//Program3
	public int getN(double[] array){
		return array.length;
	}
	public double sum(double[] array){//@F
		//sum
		double result=0;
		for(int i=0;i<array.length;i++){
			result+=array[i];
		}
		return result;
	}//@f
	public double sum_pow_two(double[] array){//@F
		//sum_pow_two
		double result=0;
		for(int i=0;i<array.length;i++){
			double temp=array[i]*array[i];
			result+=temp;
		}
		return result;
	}//@f
	public double sum_xMULy(double[] x,double[] y){//@F
		//sum_xMULy
		double result=0;
		for(int i=0;i<x.length;i++){
			double temp=x[i]*y[i];
			result+=temp;
		}
		return result;
	}//@f
	public double Beta1(double[] x,double[] y){//@F
		//Beta1
		Program1 p=new Program1();
		//DecimalFormat de=new DecimalFormat("#.000000");
		double temp1=sum_xMULy(x,y)-(getN(x)*p.average(x)*p.average(y));
		double temp2=sum_pow_two(x)-(getN(x)*p.average(x)*p.average(x));
		return temp1/(0.0+temp2);
	}//@f
	public double Beta0(double[] x,double[] y,double Beta1){//@F
		//Beta0
		Program1 p=new Program1();
	//	DecimalFormat de=new DecimalFormat("#.000000");
		return p.average(y)-Beta1*p.average(x)+0.0;
	}//@f
	public double Rxy(double[] x,double[] y){//@F
		//Rxy
		//DecimalFormat de=new DecimalFormat("##.000000");
		Program1 p=new Program1();
		double temp1=getN(x)*sum_xMULy(x,y)-sum(x)*sum(y);
		double temp2=Math.pow((getN(x)*sum_pow_two(x)-sum(x)*sum(x))*(getN(y)*sum_pow_two(y)-sum(y)*sum(y)),0.5);
		return temp1/(0.0+temp2);
		//return temp1/(0.0+temp2);
	}//@f
	public double R2(double Rxy){//@F
		//R2
	//	DecimalFormat de=new DecimalFormat("#.000000");
		return Rxy*Rxy;
	}//@f
	public double Yk(double Beta0,double Beta1,double Xk){//@F
		//Yk
		//DecimalFormat de=new DecimalFormat("#.000000");
		return Beta0+0.0+Beta1*Xk;
	}//@f
	public String printP3(double[] x,double[] y){//@F
		//printP3
		double Beta1=Beta1(x,y);
		double Beta0=Beta0(x,y,Beta1);
		double Rxy=Rxy(x,y);
		double R2=R2(Rxy);
		double Yk=Yk(Beta0,Beta1,386);
		return "Beta0 is:"+Beta0+System.lineSeparator()+"Beta1 is:"+Beta1+System.lineSeparator()+"Rxy is:"+Rxy+System.lineSeparator()+"R2 is:"+R2+System.lineSeparator()+"Yk is:"+Yk;
	}//@f
}//@c
