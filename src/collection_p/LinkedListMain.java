package collection_p;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {
	
	void add1(String name, List list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			list.add(4567);
		}
		long time = System.currentTimeMillis()-start;
		System.out.println("순차 추가 "+name+" : "+time);
	}
	
	void add2(String name, List list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++) {
			list.add(100,4567);
		}
		long time = System.currentTimeMillis()-start;
		System.out.println("비순차 추가 "+name+" : "+time);
	}
	
	void remove_2(String name, List list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			list.remove(100);
		}
		long time = System.currentTimeMillis()-start;
		System.out.println("비순차 삭제 "+name+" : "+time);
	}
	
	void remove_1(String name, List list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			list.removeLast();
		}
		long time = System.currentTimeMillis()-start;
		System.out.println("순차 삭제 "+name+" : "+time);
	}
	
	LinkedListMain(){
		ArrayList arr = new ArrayList();
		LinkedList link = new LinkedList();
		add1("arr",arr);
		add1("link",link);
		add2("arr",arr);
		add2("link",link);
		
		 System.out.println("----------------------");
		 
		//// 비순차 삭제    10000
        remove_2("arr",arr);
        remove_2("link",link);
        
        ///  순차 삭제    1000000
        remove_1("arr",arr);
        remove_1("link",link); 
	}

	public static void main(String[] args) {
		
		new LinkedListMain();

	}

}
