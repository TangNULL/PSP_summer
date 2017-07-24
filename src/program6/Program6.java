package program6;

import program5.Program5;

public class Program6 {//@C
	//Program6
	Program5 p5=new Program5();
	public String getX(int dof,double x,int num_seg,double d,double P){//@F
		//getX
		double p=Double.parseDouble(p5.getP(dof, x, num_seg));
		boolean Plus=false;
		boolean Sub=false;
		while(Math.abs(p-P)>=0.00000000001){
			if(p-P>=0.00000000001){
				//if p is bigger then real 
				if(Plus==true){
					d=d/2.0;
				}
				x-=d;
				p=Double.parseDouble(p5.getP(dof, x, num_seg));
				Plus=false;
				Sub=true;
			}
			else if(P-p>=0.00000000001){
				//if p is smaller then real p
				if(Sub==true){
					d=d/2.0;
				}
				x+=d;
				p=Double.parseDouble(p5.getP(dof, x, num_seg));
				Sub=false;
				Plus=true;
			}
		}
		return x+"";
	}//@f
}//@c
