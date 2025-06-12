package collection_p;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayNumMain {

	public static void main(String[] args) {
		//56,78,92,45,78,25,77,94,77,56,83,85,56,45,72  --> 수우미양가 구간으로 나누어서 점수를 정렬하세요
		//각 구간은 내림차순(높은 점수가 앞에 위치) 하세요
		int [] arr = {56,78,92,45,78,25,100,77,94,77,56,83,85,56,45,72};
		
		ArrayList res = new ArrayList();
		for (int i = 0; i <5; i++) {
			res.add(new ArrayList());  //가양미우수 각각의 ArrayList 구간 생성하여 추가
		}
		
		for (int i : arr) {
			int ten = i / 10;
			
			int gg = ten - 5;
			
			if(gg<0) {
				gg = 0;
			}if(gg==5) {
				gg = 4;
			}
			((ArrayList)res.get(gg)).add(i);
			System.out.println(i+","+ten+","+gg);
		}
		
		char [] title = "가양미우수".toCharArray();
		
		//((ArrayList)res.get(0)).add(27);
		
		
		for (int i = 0; i < title.length; i++) {
			ArrayList me= (ArrayList)res.get(i);
			Collections.sort(me);
			Collections.reverse(me);
			
			System.out.println(title[i]+me.toString());
		}
		
	}

}

//23,45,46,50,10,25,32,8,120,11,67,89,22,43,61,29  
//2의 배수, 3의 배수, 5의 배수로 나누어 ArrayList 로 정리하세요

