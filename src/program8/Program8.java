package program8;

import program1.Program1;
import program3.Program3;
import program6.Program6;

public class Program8 {//@C
	//Program8
	Program3 p3=new Program3();
	Program6 p6=new Program6();
	Program1 p1=new Program1();
	public double[] gaussBeta(double[] W,double[] X,double[] Y,double[] Z){//@F
		//gauss
		double a11=W.length;
		double a12=p3.sum(W);
		double a13=p3.sum(X);
		double a14=p3.sum(Y);
		double a15=p3.sum(Z);
		double a21=p3.sum(W);
		double a22=p3.sum_pow_two(W);
		double a23=p3.sum_xMULy(W, X);
		double a24=p3.sum_xMULy(W, Y);
		double a25=p3.sum_xMULy(W, Z);
		double a31=p3.sum(X);
		double a32=p3.sum_xMULy(W, X);
		double a33=p3.sum_pow_two(X);
		double a34=p3.sum_xMULy(X, Y);
		double a35=p3.sum_xMULy(X, Z);
		double a41=p3.sum(Y);
		double a42=p3.sum_xMULy(W, Y);
		double a43=p3.sum_xMULy(X, Y);
		double a44=p3.sum_pow_two(Y);
		double a45=p3.sum_xMULy(Y, Z);
		double[][] array={{a11,a12,a13,a14,a15},{a21,a22,a23,a24,a25},{a31,a32,a33,a34,a35},{a41,a42,a43,a44,a45}};
		
		int i=0;
		int j=0;
		while(j<array[0].length&&i<array.length){
			int maxi=i;
			for(int k=i;k<array.length;k++){
				if(Math.abs(array[k][j])>Math.abs(array[maxi][j])){
					maxi=k;
				}
			}
			//�ҵ����i
			if(array[maxi][j]!=0){
				if(maxi!=i){
					for(int m=0;m<array[0].length;m++){
						double temp=array[maxi][m];
						array[maxi][m]=array[i][m];
						array[i][m]=temp;
					}
				}
				//swap x maxi
				double p=array[i][j];
				for(int m=j;m<array[0].length;m++){
					array[i][m]=array[i][m]/(p+0.0);
				}
				for(int u=i+1;u<array.length;u++){
					double e=array[u][j];
					for(int k=j;k<array[0].length;k++){
						array[u][k]-=e*array[i][k];
					}
				}
			}
			i++;
			j++;
		}
		double Beta3=array[3][4]/(array[3][3]+0.0);
		double Beta2=array[2][4]-array[2][3]*Beta3;
		double Beta1=array[1][4]-array[1][3]*Beta3-array[1][2]*Beta2;
		double Beta0=array[0][4]-array[0][3]*Beta3-array[0][2]*Beta2-array[0][1]*Beta1;
		double[] result={Beta0,Beta1,Beta2,Beta3};
		return result;
	}//@f
	public double RangeWXYZ(double[] w,double[] x,double[] y,double[] z,double Wk,double Xk,double Yk){//@F
		//RangeWXYZ
		double[] Beta=gaussBeta(w,x,y,z);
		double t=Double.parseDouble(p6.getX(x.length-4, 1.0, 100, 1.0, 0.35));
		double temp=0.0;
		for(int i=0;i<x.length;i++){
			temp+=Math.pow(z[i]-Beta[0]-Beta[1]*w[i]-Beta[2]*x[i]-Beta[3]*y[i], 2);
		}
		double delta=Math.sqrt(1.0/(x.length-4)*temp);
		double seg1=0.0;
		for(int i=0;i<x.length;i++){
			seg1+=Math.pow(w[i]-p1.average(w), 2);
		}
		double temp1=Math.pow(Wk-p1.average(w), 2)/(seg1+0.0);
		double seg2=0.0;
		for(int i=0;i<x.length;i++){
			seg2+=Math.pow(x[i]-p1.average(x), 2);
		}
		double temp2=Math.pow(Xk-p1.average(x), 2)/(seg2+0.0);
		double seg3=0.0;
		for(int i=0;i<x.length;i++){
			seg3+=Math.pow(y[i]-p1.average(y), 2);
		}
		double temp3=Math.pow(Yk-p1.average(y), 2)/(seg3+0.0);
		return t*delta*Math.sqrt(temp1+temp2+temp3+1+(1.0/x.length));
	}//@f
	public double Zk(double[] w,double[] x,double[] y,double[] z,double Wk,double Xk,double Yk){//@F
		//Zk
		double[] Beta=gaussBeta(w,x,y,z);
		return Beta[0]+Wk*Beta[1]+Xk*Beta[2]+Yk*Beta[3];
	}//@f
	public double UPI(double[] w,double[] x,double[] y,double[] z,double Wk,double Xk,double Yk){//@F
		//UPI
		double range=RangeWXYZ(w,x,y,z,Wk,Xk,Yk);
		double Zk=Zk(w,x,y,z,Wk,Xk,Yk);
		return Zk+range;
	}//@f
	public double LPI(double[] w,double[] x,double[] y,double[] z,double Wk,double Xk,double Yk){//@F
		//LPI
		double range=RangeWXYZ(w,x,y,z,Wk,Xk,Yk);
		double Zk=Zk(w,x,y,z,Wk,Xk,Yk);
		return Zk-range;
	}//@f
	public String printP8(double[] w,double[] x,double[] y,double[] z,double Wk,double Xk,double Yk){//@F
		//printP8
		double[] Beta=gaussBeta(w,x,y,z);
		double hour=Zk(w,x,y,z,Wk,Xk,Yk);
		double UPI=UPI(w,x,y,z,Wk,Xk,Yk);
		double LPI=LPI(w,x,y,z,Wk,Xk,Yk);
		return "Beta0 is:"+Beta[0]+System.lineSeparator()+"Beta1 is:"+Beta[1]+System.lineSeparator()+"Beta2 is:"+Beta[2]+System.lineSeparator()+"Beta3 is:"+Beta[3]+System.lineSeparator()+"Projected Hours is:"+hour+System.lineSeparator()+"UPI is:"+UPI+System.lineSeparator()+"LPI is:"+LPI;
	}//@f
}//@c
