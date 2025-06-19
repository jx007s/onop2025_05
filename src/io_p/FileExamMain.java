package io_p;

import java.io.FileReader;
import java.util.ArrayList;

class FileStud{
	private final String name;
	private final ArrayList<Integer> jum;
	private int tot, avg;
	
	FileStud(String ttt) {
		String [] arr = ttt.split(",");
		name = arr[0];
		jum = new ArrayList<Integer>();
		
		for (int i = 1; i < arr.length; i++) {
			jum.add(Integer.parseInt(arr[i]));
		}
		
	}
	private void calc() {
		tot = 0;
		for (Integer i : jum) {
			tot += i;
		}
		avg = tot / jum.size();
	}
	
	@Override
	public String toString() {
		String ttt = name+",";
		for (Integer i : jum) {
			ttt += i+",";
		}
		ttt += tot+","+avg;
		
		return ttt;
	}
	
	
}


public class FileExamMain {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("fff/exam.txt");
			
			String line = "";
			
			int data;
			while((data= fr.read())!=-1) {
				char ch = (char)data;
				
				//System.out.println(ch);
				if(ch=='\n') {
					System.out.println(line);
					line="";
				}else {
					line+=ch;	
				}
			}
			
			fr.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
