package collection_p;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetMain {

	public static void main(String[] args) {
		int [] data = {11,55,22,33,77,44,55,11,66,33,99,77,22,88,99};

		HashSet hs = new HashSet();
		LinkedHashSet ls = new LinkedHashSet();  //순서대로 위치
		TreeSet ts =  new TreeSet();			 //오름차순
		
		for (int dd : data) {
			hs.add(dd);
			ls.add(dd);
			ts.add(dd);
		}
		System.out.println("data : "+Arrays.toString(data));
		System.out.println("hs : "+hs);
		System.out.println("ls : "+ls);
		System.out.println("ts : "+ts);
	}

}
