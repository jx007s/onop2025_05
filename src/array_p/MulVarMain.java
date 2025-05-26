package array_p;

import java.util.Arrays;

public class MulVarMain {

	public static void main(String[] args) {

		int [] arr1 = {11,22,33,44};
		
		int [][] arr2 = {
				{101,102,103},  //4208
				{201,202,203},	//f5c3
				{301,302,303}	//4d57
		};
		
		int [] arr3;
		
		//2차원 배열 : 배열의 원소가 1차원 배열 주소
		// 원소 배열의 길이가 달라도 상관없음
		int [][] arrVar = {
				{123,456,789,876,543},  
				new int[2],
				{324,546,879},
				arr1,		//1차원배열변수대입 (배열의주소를 가져옴) arrVar[3] = arr1
				//arr2    같은 차원 주소만 대입가능
				arr2[1],		// arrVar[4] = arr2[1]
				//arr3	배열변수가 초기화 되지 않음
				arr3 = new int[] {81,27,63}  
				//   1차원배열생성 및 arr3에 주소 대입 및 arr3 변수값(주소)호출
		};
		
		arr1[2] = 3412;
		arrVar[3][1] = 2468;
		arr2[1][0] = 998877;
		arrVar[4][1] = 665544;
		System.out.println("arr1 : "+arr1);
		System.out.println("arr1 : "+Arrays.toString(arr1));
		
		System.out.println("arr2 : "+arr2);
		System.out.println("arr2 : "+Arrays.toString(arr2));
		System.out.println("arr2[0] : "+arr2[0]);
		System.out.println("arr2[0] : "+Arrays.toString(arr2[0]));
		System.out.println("arr2[1] : "+arr2[1]);
		System.out.println("arr2[1] : "+Arrays.toString(arr2[1]));
		System.out.println("arr2[2] : "+arr2[2]);
		System.out.println("arr2[2] : "+Arrays.toString(arr2[2]));
		
		System.out.println("arrVar : "+arrVar);
		System.out.println("arrVar : "+Arrays.toString(arrVar));
		System.out.println("arrVar[0] : "+arrVar[0]);
		System.out.println("arrVar[0] : "+Arrays.toString(arrVar[0]));
		System.out.println("arrVar[1] : "+arrVar[1]);
		System.out.println("arrVar[1] : "+Arrays.toString(arrVar[1]));
		System.out.println("arrVar[2] : "+arrVar[2]);
		System.out.println("arrVar[2] : "+Arrays.toString(arrVar[2]));
		System.out.println("arrVar[3] : "+arrVar[3]);
		System.out.println("arrVar[3] : "+Arrays.toString(arrVar[3]));
		System.out.println("arrVar[4] : "+arrVar[4]);
		System.out.println("arrVar[4] : "+Arrays.toString(arrVar[4]));
		System.out.println("arrVar[5] : "+arrVar[5]);
		System.out.println("arrVar[5] : "+Arrays.toString(arrVar[5]));
		
		System.out.println("arr3 : "+arr3);
		System.out.println("arr3 : "+Arrays.toString(arr3));
	}

}

