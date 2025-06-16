package collection_p;

import java.util.TreeSet;

class CompareStud implements Comparable{
	int ban, jum;
	String name;
	
	CompareStud(int ban, String name, int jum) {
		
		this.ban = ban;
		this.name = name;
		this.jum = jum;
		//System.out.println("----------");
	}

	@Override
	public String toString() {
		return ban + "\t" + jum + "\t" + name;
	}

	@Override
	public int compareTo(Object o) {
		//System.out.println(this+" : "+o);
		CompareStud you = (CompareStud)o;
		int res = ban - you.ban;
		
		if(res==0) {
			res = you.jum - jum;
		}
		if(res==0) {
			res = name.compareTo(you.name);
		}
		if(res==0) {
			res = 1;
		}
		return res;
	}
	
	
	
}

public class CompareableMain {

	public static void main(String[] args) {
		TreeSet ss = new TreeSet();
		ss.add(new CompareStud(1,"홍길동",67));
		ss.add(new CompareStud(1,"청길동",77));
		ss.add(new CompareStud(2,"백길동",87));
		ss.add(new CompareStud(2,"홍길동",77));
		ss.add(new CompareStud(1,"청길동",97));
		ss.add(new CompareStud(1,"황길동",87));
		ss.add(new CompareStud(2,"홍길동",77));
		ss.add(new CompareStud(2,"황길동",97));
		ss.add(new CompareStud(3,"청길동",87));
		ss.add(new CompareStud(1,"홍길동",67));
		
		for (Object oo : ss) {
			System.out.println(oo);
		}

	}

}



/*
도형 정보를 입력하여 도형의 종류 및 넓이 순서대로 출력하세요
5_6,6,7_8_15,10_20,7
직사각형,원,직각삼각형,작사각형,원

* */
