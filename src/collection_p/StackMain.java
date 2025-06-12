package collection_p;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackMain {

	public static void main(String[] args) {
		Stack st = new Stack();			// LIFO : 후입선출
		Queue qq = new LinkedList();	// FIFO : 선입선출
		
		st.push(11);
		st.push(22);
		st.push(33);
		
		qq.offer(11);
		qq.offer(22);
		qq.offer(33);
		
		System.out.println("st : "+st);
		System.out.println("qq : "+qq);
		
//		System.out.println("st.empty() : "+st.empty());
//		Object oo = st.pop();
//		System.out.println(oo);
//		System.out.println("st : "+st);

		System.out.println("st ---------");
		while(!st.empty()) {
			System.out.println(st.pop());
		}
		//st.pop();  에러발생
		
//		System.out.println("qq.isEmpty() : "+qq.isEmpty());
//		Object oo = qq.poll();
//		System.out.println(oo);
//		System.out.println("qq : "+qq);
		
		System.out.println("qq ---------");
		while(!qq.isEmpty()) {
			System.out.println(qq.poll());
		}
		
	}

}
