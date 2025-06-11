package oops_p;

import java.util.Arrays;

public class SpreadMain {
	
	void meth(int a, int b) {
		System.out.println("매개변수 2개 : "+a+","+b);
	}
	
	void meth(int a, int b, int c) {
		System.out.println("매개변수 3개 : "+a+","+b+","+c);
	}
	
	//가변 매개변수 : int...arr
	void meth(int...arr) {
		// int [] arr;
		// 원소들을 배열로 변환하여 매개변수로 대입
		// 배열을 매개변수로 대입하는 것도 가능
		System.out.println("가변 매개변수 : "+arr+Arrays.toString(arr));
	}
	
	/* 배열을 매개변수로 받는 메소드와 가변매개변수는 같은 메소드 (같이 메소드 정의 불가)
	void meth(int [] arr) {
		
	}*/
	
	//배열만 매개변수로 받음
	//가변 매개변수로 대입불가
	void meth_a(int [] arr) {
		System.out.println("meth_a : "+arr+Arrays.toString(arr));
	}
	
	public SpreadMain() {
		
		meth(10,20);
		meth(10,20,30);
		meth(10);				// int [] arr = {10};
		meth();					// int [] arr = {};
		meth(10,20,30,40,50);	// int [] arr = {10,20,30,40,50};
		meth(new int[] {111,222,333});// int [] arr = new int[] {111,222,333};
		
		meth_a(new int[] {135,268,789,457});
		//meth_a(13,24,46,68);  가변 매개변수로 대입불가
	}

	public static void main(String[] args) {
		
		new SpreadMain();

	}

}
