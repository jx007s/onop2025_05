package collection_p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMain {

	public static void main(String[] args) {
		Object [] data = {33,11,'a',55,33,11,22,"onop","11","onop"};
		
		ArrayList arr1 = new ArrayList();
		ArrayList arr2 = new ArrayList();
		Set ss1 = new HashSet();
		
		for (Object oo : data) {
			arr1.add(oo);
			ss1.add(oo);
		}
		
		System.out.println("arr1 : "+arr1);
		System.out.println("ss1 : "+ss1);
		
		//Set ss2 = new HashSet(data);
		Set ss3 = new HashSet(ss1);
		Set ss4 = new HashSet(arr1);
		Set ss5 = new HashSet();
		Set ss6 = ss1;
		ss5.addAll(ss1);
		arr2.addAll(arr1);
		
		System.out.println("ss3 : "+ss3);
		System.out.println("ss4 : "+ss4);
		System.out.println("ss5 : "+ss5);
		System.out.println("ss6 : "+ss6);
		System.out.println("arr2 : "+arr2);
		
		System.out.println("ss1==ss3 : "+(ss1==ss3));		
		System.out.println("ss1==ss4 : "+(ss1==ss4));
		System.out.println("ss1==ss5 : "+(ss1==ss5));
		System.out.println("ss1==ss6 : "+(ss1==ss6));
		System.out.println("arr1==arr2 : "+(arr1==arr2));
		
		System.out.println("size() : "+ss1.size());
		//System.out.println("indexOf() : "+ss1.indexOf(11));
		System.out.println("contains(11) : "+ss1.contains(11));
		System.out.println("contains(1234) : "+ss1.contains(1234));
		Set ss7 = new HashSet();
		ss7.add(22);
		ss7.add(33);
		ss7.add(55);
		System.out.println("ss7 : "+ss7);
		System.out.println("containsAll(ss7) : "+ss1.containsAll(ss7));
		ss7.add(66);
		System.out.println("containsAll(ss7) : "+ss1.containsAll(ss7));
		//ss1.get();
		//ss1.set();
		boolean bb = ss1.remove(33);
		System.out.println("remove(33) : "+ss1);
		System.out.println("bb : "+bb);
		bb = ss1.remove(100);
		System.out.println("remove(100) : "+ss1);
		System.out.println("bb : "+bb);
		System.out.println("ss7 : "+ss7);
		ss1.removeAll(ss7);
		System.out.println("removeAll(ss7) : "+ss1);
		Set ss8 = new HashSet();
		ss8.add(100);
		ss8.add(11);
		ss8.add(2000);
		ss8.add('a');
		System.out.println("ss8 : "+ss8);
		ss1.retainAll(ss8);
		System.out.println("retainAll(ss8) : "+ss1);
		
		Object [] data2 = ss1.toArray();
		System.out.println("toArray() : "+data2+Arrays.toString(data2));
		ArrayList arr3 = new ArrayList(ss1);
		System.out.println("ArrayList(ss1) : "+arr3);
		
		System.out.println("기본 for-------");
//		for (int i = 0; i < ss1.size(); i++) {
//			System.out.println(ss1.get(i));
//		}
		System.out.println("향상된 for-------");
		for (Object oo : ss1) {
			System.out.println(oo);
		}
		
		System.out.println("Iterator-------");
		Iterator it = ss1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
