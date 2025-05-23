package array_p;

import java.util.Arrays;

public class ArraySortMain {

	public static void main(String[] args) {
		int a = 10, b= 20;
		
		System.out.println(a+" , "+b);
		int buf = a;
		a = b;
		b = buf;
		System.out.println(a+" , "+b);
		
		int [] arr = {72,56,99,64,88};
		
		System.out.println("정렬 전 : "+Arrays.toString(arr));
		
		for (int me = 0; me < arr.length; me++) {
			System.out.println(">>> "+me);
			for (int you = me+1; you < arr.length; you++) {
				
				if(arr[me]>arr[you]) {
					buf = arr[me];
					arr[me] = arr[you];
					arr[you] = buf;
				}
				
				System.out.println(you+":"+arr[me]+":"+arr[you]);
			}
			System.out.println("\n"+Arrays.toString(arr));
		}
		System.out.println("정렬 후 : "+Arrays.toString(arr));
		
		// 오름차순 정렬 
		
		
		// 99, 88, 56, 64,  72,
	}

}
