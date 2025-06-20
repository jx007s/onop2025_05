package io_p;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;
import java.util.TreeSet;

class RectData implements Serializable, Comparable<RectData>{
	
	int area, border;

	RectData(int w, int h) {
		
		this.area = w * h;
		this.border = (w + h);
	}

	@Override
	public String toString() {
		return "넓이 : " + area + ", 둘레 : " + border;
	}

	@Override
	public int compareTo(RectData you) {
		int res = you.area - area;
		if(res==0) {
			res = you.border - border;
		}
		if(res==0) {
			res = 1;
		}
		return res;
	}
	
	
}

public class RecOutMain {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("fff/rrr.zxc");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			TreeSet<RectData> ss = new TreeSet<RectData>();
			Scanner sc = new Scanner(System.in);
			
			while(true) {
				System.out.print("세로 :");
				
				int w = sc.nextInt();
				if(w<=0) {
					break;
				}
				
				System.out.print("가로 :");
				
				int h = sc.nextInt();
				
				ss.add(new RectData(w, h));
				
			}
			
			
			
			oos.writeInt(ss.size());
			
			for (RectData rd : ss) {
				oos.writeObject(rd);
			}
			
			
			
			oos.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
