package lamda_p;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionMain {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for (int i : new int[] {11,22,34,56,78,99,13,46,82}) {
			arr.add(i);
		}
		System.out.println(arr);
		// forEach의 매개변수로 람다식 Consumer 인터페이스를 대입
		arr.forEach(i->System.out.println(i*100));
		
		// Predicate
		arr.removeIf(i-> i%11==0);
		System.out.println(arr);
		
		arr.replaceAll(i->i*100);
		System.out.println(arr);
		
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("체리주빌레", 100);
		map.put("아몬드봉봉", 120);
		map.put("민트초코", 90);
		map.put("레인보우샤벳트", 110);
		map.put("슈팅스타", 80);
		
		System.out.println(map);
		
		//BiConsumer
		map.forEach((k,v)->System.out.println(k+":"+(double)v/100));

	}

}

/*
13,45,67,88,92,14,52,54,93,26,38,11,75

2 , 3의 배수를 삭제해 주세요
  
솟수를 삭제해 주세요 (Prime Number)

*  */




