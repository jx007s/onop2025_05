package collection_p;

import java.util.ArrayList;

import java.util.TreeSet;

class ComparableShape implements Comparable{
	
	String name;
	int area;
	ArrayList line = new ArrayList();
	
	@Override
	public String toString() {
		return name + "\t" + area;
	}

	ComparableShape(String qwer){
		
		for (String tt : qwer.split("_")) {
			line.add(Integer.parseInt(tt));
		}
		//System.out.println(qwer+line);
		
		name = ",원,직사각형,직각삼각형".split(",")[line.size()];
		
		//넓이 계산
		areaCalc();
	}
	
	void areaCalc() {
		switch(name) {
			case "원":
				area = (int)((int)line.get(0) * (int)line.get(0)*Math.PI);
				break;
			case "직사각형":
				area = (int)line.get(0) * (int)line.get(1);
				break;
			case "직각삼각형":
				area = (int)line.get(0) * (int)line.get(1) / 2;
				break;
		}
	}

	@Override
	public int compareTo(Object o) {
		
		ComparableShape you = (ComparableShape)o;
		int res = name.compareTo(you.name);
		if(res==0) {
			res = you.area - area;
		}
		if(res==0) {
			res = 1;
		}
		return res;
	}
	
}
// P@$$W0rd
public class ComparableShapeMain {

	public static void main(String[] args) {
		TreeSet ss = new TreeSet();
		for (String ttt : "5_6,6,7_8_15,6,10_20,7".split(",")) {
			//System.out.println(ttt);
			ss.add(new ComparableShape(ttt));
			
		}
		
		for (Object obj : ss) {
			System.out.println(obj);
		}

	}

}
