package collection_p;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.TreeMap;

class TmCom2 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

class TmCom3 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return -1;
	}
	
}

class TmCom4 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// 1의 자리 기준 정렬
		int me = (int)o1;
		int you = (int)o2;
		
		int meOne = me%10;
		int youOne = you%10;
		
		int res = meOne - youOne;
		if(res==0) {
			res = 1;
		}
		return res;
	}
	
}

public class TreeMapMain {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		HashSet ss = new HashSet();
		HashMap hm = new HashMap();
		LinkedHashMap lm = new LinkedHashMap();
		
		//정렬기준 : key  
		// value 와 상관없음
		TreeMap tm1 = new TreeMap();
		TreeMap tm2 = new TreeMap(new TmCom2());
		TreeMap tm3 = new TreeMap(new TmCom3());
		TreeMap tm4 = new TreeMap(new TmCom4());
		
		int [] ori = {45,11,35,11,27,78,27, 78,25,36};
		
		for (int i : ori) {
			arr.add(i);
			ss.add(i);
			hm.put(i, "아이");
			lm.put(i, "아이");
			tm1.put(i, "아이");
			tm2.put(i, "아이");
			tm3.put(i, "아이");
			tm4.put(i, "아이");
		}
		
		System.out.println("arr"+arr);
		System.out.println("ss"+ss);
		System.out.println("hm"+hm);
		System.out.println("lm"+lm);
		
		System.out.println("tm1"+tm1);
		System.out.println("tm2"+tm2);
		System.out.println("tm3"+tm3);
		System.out.println("tm4"+tm4);

	}

}
