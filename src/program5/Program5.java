package program5;

public class Program5{//@C
	//Program5
	public double t_distribution_integral(int dof,double x,int num_seg){//@F
		//t_distribution_integral
		double W=x/num_seg;
		double segFour=0;
		for(int i=1;i<=num_seg-1;i=i+2){
			segFour+=4*F(dof,i*W);
		}
		double segTwo=0;
		for(int i=2;i<=num_seg-2;i=i+2){
			segTwo+=2*F(dof,i*W);
		}
		double p=W/3*(F(dof,0)+segFour+segTwo+F(dof,x));
		return p;
	}//@f
	public String getP(int dof,double x,int num_seg){//@F
		//getP
		double p1=t_distribution_integral(dof,x,num_seg);
		num_seg*=2;
		double p2=t_distribution_integral(dof,x,num_seg);
		while(Math.abs(p2-p1)>=0.00001){
			p1=p2;
			num_seg*=2;
			p2=t_distribution_integral(dof,x,num_seg);
		}
		return ""+p2;
	}//@f
	public double F(int dof,double x){//@F
		//F
		double temp1=gamma((dof+1)/2.0);
		double temp2=gamma(dof/2.0);
		double temp3=Math.pow(dof*Math.PI, 0.5);
		double temp4=Math.pow(((x*x/dof)+1.0), -(1+dof)/2.0);
		return temp1*temp4/temp2/temp3;
	}//@f
	public double gamma(double x){//@F
		//gamma
		double result=1;
		while(x>1){
			x--;
			result*=x;
		}
		if(x==1/2.0){
			result*=Math.pow(Math.PI, 0.5);
		}
		return result;
	}//@f
}//@c
