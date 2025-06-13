package collection_p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorMain {

	public static void main(String[] args) {
		ArrayList arr1 = new ArrayList();
		ArrayList arr2 = new ArrayList();
		
		for (int i : new int[] {11,22,33,44,55,66,77}) {
			arr1.add(i);
			arr2.add(i);
		}
		
		System.out.println("arr1 : "+arr1);
		System.out.println("arr2 : "+arr2);
		
		System.out.println("for-------------------");
		for (Object oo : arr1) {
			System.out.println(oo);
		}
		
		System.out.println("Iterator-------------------");
		Iterator it = arr2.iterator();
//		System.out.println(it.hasNext());
//		Object o2 = it.next();
//		System.out.println(o2);
		while(it.hasNext()) {
			System.out.println(it.next());
		}
//		System.out.println("후진 ---------");
//		while(it.hasPrevious()) {
//			System.out.println(it.previous());
//		}
		
		System.out.println("Iterator-------------------");
		ListIterator lit = arr2.listIterator();
		
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
		System.out.println("후진 ---------");
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
		System.out.println("for 삭제-------------------");
		for (Object oo : arr1) {
			int i = (int)oo;
			if(i==33) {
				//arr1.remove(oo);  에러발생
			}
			System.out.println(i);
		}
		
		System.out.println("Iterator 삭제-------------------");
		Iterator it2 = arr2.iterator();

		while(it2.hasNext()) {
			int i =(int)it2.next();
			
			if(i==33) {
				//arr2.remove((Object)i);  에러발생
				it2.remove();  //반복문에서 삭제
			}
			
			System.out.println(i);
		}
		System.out.println("arr1 : "+arr1);
		System.out.println("arr2 : "+arr2);
	}

}


//{34,56,12,43,90,89,654,43,21234,675,45};

//1. 모든 원소를 arrayList에 넣어 출력하세요
//2, 3의 배수를 제외한 arrayList로 변환하세요


