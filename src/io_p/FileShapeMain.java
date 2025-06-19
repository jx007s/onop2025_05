package io_p;

import java.io.FileReader;
import java.io.FileWriter;

class FileShape{
	private final String name;
	private int area, border;
	
	FileShape(String ttt) {
		String [] arr = ttt.trim().split(",");
		name = "원,직사각형,직각삼각형".split(",")[arr.length-1];
		
		switch(name) {
		case "원":
			calc(Integer.parseInt(arr[0]));
			break;
		case "직사각형":
			calc(Integer.parseInt(arr[0]),
					Integer.parseInt(arr[1]));
			break;
		case "직각삼각형":
			calc(Integer.parseInt(arr[0]),
					Integer.parseInt(arr[1]),
					Integer.parseInt(arr[2]));
			break;
		}
	}
	
	private void calc(int r) {
		area = (int)(r * r * Math.PI);
		border = (int)(r * 2 * Math.PI);
		//System.out.println("원");
	}
	private void calc(int w, int h) {
		area = w * h;
		border = (w + h) *2;
		//System.out.println("직사각형");
	}
	private void calc(int w, int h, int a) {
		area = w * h / 2;
		border = w + h + a;
		//System.out.println("직각삼각형");
	}

	@Override
	public String toString() {
		return name + "\t" + area + "," + border;
	}
	
	
}

public class FileShapeMain {

	public static void main(String[] args) {

		try {
			
			String ttt="";
			FileReader fr = new FileReader("fff/shape.txt");
			
			int data;
			while((data=fr.read())!=-1) {
				ttt += (char)data;
			}
			
			fr.close();
			
			//System.out.println(ttt); 뭐지 뭐야????
			String res = "";
			for (String str : ttt.split("\n")) {
				res += new FileShape(str).toString()+"\n";
			}
			
			//System.out.println(res);
			
			FileWriter fw = new FileWriter("zzz/shapeRes.txt");
			fw.write(res);
			fw.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
