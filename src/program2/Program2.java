package program2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
public class Program2 {//@C
	//Program2
	String name_of_class=null;
	public String getClassName(File file){//@F
		//getClassName
		LOC_of_class(file);
		return name_of_class;
	}//@f
	public int LOC_of_class(File file){//@F
		//LOC_of_class
		int result=0;
		try {
			FileReader reader=new FileReader(file);
			BufferedReader buffer=new BufferedReader(reader);
			String line=null;
			boolean nextLine=false;
			while((line=buffer.readLine())!=null){
				if(nextLine==true){
					String[] x=line.split("/");
					name_of_class=x[x.length-1];
					nextLine=false;
				}
				if(line.contains("{")||line.contains("}")||line.contains(";")||line.contains("/")){
					result++;
				}
				if(line.contains("@")){
					int index=line.indexOf("@");
					if(line.charAt(index+1)=='C'){
						nextLine=true;
						result=1;
					}
					else if(line.charAt(index+1)=='c'){
						break;
					}
				}
			}
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return result;
	}//@f
	public HashMap<String,Integer> LOC_of_method(File file){//@F
		//LOC_of_method
		HashMap<String,Integer> myMap=new HashMap<String,Integer>();
		int result=0;
		boolean nextLine=false;
		String name_of_method=null;;
		try {
			FileReader reader=new FileReader(file);
			BufferedReader buffer=new BufferedReader(reader);
			String line=null;
			while((line=buffer.readLine())!=null){
				if(nextLine==true){
					String[] x=line.split("/");
					name_of_method=x[x.length-1];
					nextLine=false;
				}
				if(line.contains("{")||line.contains("}")||line.contains(";")||line.contains("/")){
					result++;
				}
				if(line.contains("@")){
					int index=line.indexOf("@");
					if(line.charAt(index+1)=='F'){
						nextLine=true;
						result=1;
					}
					else if(line.charAt(index+1)=='f'){
						myMap.put(name_of_method, result);
					}
				}
			}
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return myMap;
	}//@f
	public String printP2(File myfile){//@F
		//print
		HashMap<String,Integer> myMap=LOC_of_method(myfile);
		StringBuffer str=new StringBuffer();
		str.append("class:"+System.lineSeparator());
		str.append("LOC_of_"+getClassName(myfile)+":"+LOC_of_class(myfile)+System.lineSeparator());
		str.append("method:");
	    for(java.util.Map.Entry<String, Integer> entry:myMap.entrySet()){
	    	str.append(System.lineSeparator()+"LOC_of_"+entry.getKey()+":"+entry.getValue());
	    }
	    return str.toString(); 
	}//@f
}//@c
