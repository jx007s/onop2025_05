package collection_p;

import java.util.ArrayList;

enum Array235{
	res2, res3, res5;
	
	ArrayList data = new ArrayList();
}


public class Array235Main {

	public Array235Main() {
		int [] arr = {23,45,46,50,10,25,32,8,120,11,67,89,22,43,61,29};  
		//2의 배수, 3의 배수, 5의 배수로 나누어 ArrayList 로 정리하세요
//		ArrayList res2 = new ArrayList();
//		ArrayList res3 = new ArrayList();
//		ArrayList res5 = new ArrayList();
		
		int [] divs = {2,3,5};
		for (int i : arr) {
			System.out.println(i);
			
			for (int d : divs) {
				//System.out.println(d);
				if(i%d==0) {
					Array235.valueOf("res"+d).data.add(i);
				}
			}
			
//			if(i%2==0) {
//				res2.add(i);
//			}
//			if(i%3==0) {
//				res3.add(i);
//			}
//			if(i%5==0) {
//				res5.add(i);
//			}
		}
		
//		System.out.println(res2);
//		System.out.println(res3);
//		System.out.println(res5);
		
		for (Array235 rr : Array235.values()) {
			System.out.println(rr.data);
		}
	}
	public static void main(String[] args) {
		
		new Array235Main();
	}

}
