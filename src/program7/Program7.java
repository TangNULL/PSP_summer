package program7;

import program1.Program1;
import program3.Program3;
import program5.Program5;
import program6.Program6;

public class Program7 {//@C
	//Program7
	Program5 p5=new Program5();
	Program1 p1=new Program1();
	Program3 p3=new Program3();
	Program6 p6=new Program6();
	public double tail_area(double[] x,double[] y){//@F
		//tail_area
		double Rxy=p3.Rxy(x, y);
		double X=Math.abs(Rxy)*Math.sqrt(x.length-2)/(Math.sqrt(1-Math.pow(Rxy, 2))+0.0);
		double p=Double.parseDouble(p5.getP(x.length-2,X,10));
		return 1-2*p;
	}//@f
	
	public double Range(double[] x,double[] y){//@F
		//Range
		double t=Double.parseDouble(p6.getX(x.length-2, 1.0, 10, 1.0, 0.35));
		double Beta1=p3.Beta1(x, y);
		double Beta0=p3.Beta0(x, y, Beta1);
		double temp=0.0;
		for(int i=0;i<x.length;i++){
			temp+=Math.pow(y[i]-Beta0-Beta1*x[i], 2);
		}
		double del=Math.sqrt((1/(x.length-2+0.0))*temp);
		double Xavg=p1.average(x);
		double temp1=Math.pow((386-Xavg),2);
		double temp2=0.0;
		for(int j=0;j<x.length;j++){
			temp2+=Math.pow(x[j]-Xavg, 2);
		}
		double temp3=Math.sqrt((temp1/temp2)+(1/(x.length+0.0))+1);
		return t*del*temp3;
	}//@f
	
	public double UPI(double[] x,double[] y,double Xk){//@F
		//UPI
		double range=Range(x,y);
		double Beta1=p3.Beta1(x, y);
		double Beta0=p3.Beta0(x, y, Beta1);
		double Yk=p3.Yk(Beta0, Beta1,Xk);
		return Yk+range;
	}//@f
	
	public double LPI(double[] x,double[] y,double Xk){//@F
		//LPI
		double range=Range(x,y);
		double Beta1=p3.Beta1(x, y);
		double Beta0=p3.Beta0(x, y, Beta1);
		double Yk=p3.Yk(Beta0, Beta1,Xk);
		return Yk-range;
	}//@f
	
	public String printP7(double[] x,double[] y,double Xk){//@F
		//printP7
		double Rxy=p3.Rxy(x, y);
		double R2=p3.R2(Rxy);
		double tailarea=tail_area(x,y);
		double Beta1=p3.Beta1(x, y);
		double Beta0=p3.Beta0(x, y, Beta1);
		double Yk=p3.Yk(Beta0, Beta1,Xk);
		double Range=Range(x,y);
		double UPI=UPI(x,y,Xk);
		double LPI=LPI(x,y,Xk);
		return "Rxy is:"+Rxy+System.lineSeparator()+"R2 is:"+R2+System.lineSeparator()+"tail area is:"+tailarea+System.lineSeparator()+"Beta0 is:"+Beta0+System.lineSeparator()+"Beta1 is:"+Beta1+System.lineSeparator()+"Yk is:"+Yk+System.lineSeparator()+"Range is:"+Range+System.lineSeparator()+"UPI is:"+UPI+System.lineSeparator()+"LPI is:"+LPI+System.lineSeparator();
	}//@f
}//@c
