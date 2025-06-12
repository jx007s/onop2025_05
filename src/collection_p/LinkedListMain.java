package collection_p;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {
	
	void add1(String name, List list) {
		System.out.println("순차 추가 "+name+" : ");
	}
	
	LinkedListMain(){
		ArrayList arr = new ArrayList();
		LinkedList link = new LinkedList();
		add1("arr",arr);
	}

	public static void main(String[] args) {
		
		new LinkedListMain();

	}

}
