package io_p;

import java.io.FileReader;
import java.io.FileWriter;
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
			jum.add(Integer.parseInt(arr[i].trim()));
		}
		calc();
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
			
			
			// 1. 입력부
			ArrayList<FileStud> studs = new ArrayList<FileStud>();
			
			FileReader fr = new FileReader("fff/exam.txt");
			
			String line = "";
			
			int data;
			while((data= fr.read())!=-1) {
				char ch = (char)data;
				
				//System.out.println(ch);
				if(ch=='\n') {
					studs.add(new FileStud(line)) ;
					//System.out.println(line);
					
					line="";
				}else {
					line+=ch;	
				}
			}
			
			fr.close();
			
			//2. 데이터 확인
//			for (FileStud st : studs) {
//				System.out.println(st);
//			}
			
			// 3. 출력부
			
			FileWriter fw = new FileWriter("zzz/examRes.txt");
			
			for (FileStud st : studs) {
				fw.write(st.toString()+"\n");
			}
			
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
/*
원본파일 : fff/shape.txt
5,6
5
5,6,8
10
10,20
13,17,22

 
결과파일 : zzz/shapeRes.txt

직사각형 	넓이, 둘레
원 		넓이, 둘레
직각삼각형	넓이, 둘레
직사각형 	넓이, 둘레
원 		넓이, 둘레
직각삼각형	넓이, 둘레  

 * */

