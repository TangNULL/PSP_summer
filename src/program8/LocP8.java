package program8;

import java.io.File;

import program2.Program2;

public class LocP8 {
	public static void main(String[] args){
		Program2 p2=new Program2();
		File file=new File("E:\\workspace\\programPSP\\src\\program8\\p8txt");
		System.out.println(p2.printP2(file));
	}
}
