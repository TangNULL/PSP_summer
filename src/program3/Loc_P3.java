package program3;

import java.io.File;

import program2.Program2;

public class Loc_P3 {
	public static void main(String[] args){
		Program2 p2=new Program2();
		File file=new File("D:\\workspace\\programPSP\\src\\program3\\p3txt");
		System.out.println(p2.printP2(file));
	}
}
