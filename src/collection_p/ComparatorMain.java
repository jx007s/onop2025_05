package collection_p;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

class MyCom implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		System.out.println(o1+" : "+o2);
		
		/*
		  o1 : add로 입력되는 요소
		  o2 : 현재 비교되는 요소(TreeSet에 있는 요소)
		  양수 : o1 이 뒤로
		  0 :   o1 생략
		  음수 : o1 이 앞으로
		 * 
		 * */
		return -1;
	}
}


class MyCom3 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		int me = (int)o1;
		int you = (int)o2;
		//System.out.println(o1+" : "+o2);
		
		return me - you;
	}
}

class MyCom4 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		int me = (int)o1;
		int you = (int)o2;
		//System.out.println(o1+" : "+o2);
		
		return you - me;
	}
}

public class ComparatorMain {

	public static void main(String[] args) {
		int [] data = {44,99,33,11,44,22,66,99,77};

		HashSet hs = new HashSet();
		LinkedHashSet ls = new LinkedHashSet();  //순서대로 위치
		TreeSet ts1 =  new TreeSet();			 //오름차순
		TreeSet ts2 =  new TreeSet(new MyCom());
		TreeSet ts3 =  new TreeSet(new MyCom3());
		TreeSet ts4 =  new TreeSet(new MyCom4());
		
		for (int dd : data) {
			System.out.println("----------------");
			hs.add(dd);
			ls.add(dd);
			ts1.add(dd);
			ts2.add(dd);
			ts3.add(dd);
			ts4.add(dd);
		}
		
		System.out.println("hs "+hs);
		System.out.println("ls "+ls);
		System.out.println("ts1 "+ts1);
		System.out.println("ts2 "+ts2);
		System.out.println("ts3 "+ts3);
		System.out.println("ts4 "+ts4);
	}

}
