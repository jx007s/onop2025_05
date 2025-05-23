package array_p;

import java.util.Arrays;

public class AddrMain {

	public static void main(String[] args) {

		int a = 10;
		int [] arr1 = {11,22,33,44};
		
		int b = a;
		
		int [] arr2 = arr1;							//얕은복사(shallow copy)		
		int [] arr3 = {11,22,33};
		int [] arr4 = {arr1[0],arr1[1],arr1[2]};	//깊은복사(deep copy)
		
		//깊은복사 방법
		int [] arr5 = new int[arr1.length];  // 원본 길이와 같은 배열 생성
		for (int i = 0; i < arr1.length; i++) {  //각 원소 위치에 대입 
			arr5[i] = arr1[i];
		}
		
		int [] arr6 = arr1.clone();	//깊은복사
		
		
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("arr1 : "+arr1+Arrays.toString(arr1));
		System.out.println("arr2 : "+arr2+Arrays.toString(arr2));
		System.out.println("arr3 : "+arr3+Arrays.toString(arr3));
		System.out.println("arr4 : "+arr4+Arrays.toString(arr4));
		System.out.println("arr5 : "+arr5+Arrays.toString(arr5));
		System.out.println("arr6 : "+arr6+Arrays.toString(arr6));
		a = 20;
		arr1[1] = 2345;
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("arr1 : "+arr1+Arrays.toString(arr1));
		System.out.println("arr2 : "+arr2+Arrays.toString(arr2));
		System.out.println("arr3 : "+arr3+Arrays.toString(arr3));
		System.out.println("arr4 : "+arr4+Arrays.toString(arr4));
		System.out.println("arr5 : "+arr5+Arrays.toString(arr5));
		System.out.println("arr6 : "+arr6+Arrays.toString(arr6));
		
	
	}

}
