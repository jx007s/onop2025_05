package collection_p;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArrayListMain {

	public static void main(String[] args) {
		
		List arr1 = new ArrayList();
		System.out.println("arr1 : "+arr1);
		
		System.out.println("[CRUD] >>> ");
		// Create, Read, Update, Delete
		// add     get    set     remove
		
		arr1.add(10);
		arr1.add(5);
		arr1.add(30);
		arr1.add(10);
		arr1.add(20);
		
		
		System.out.println("add : "+arr1);
		arr1.add("그는 훌륭한 키보드였습니다");
		arr1.add(123.456);
		arr1.add(true);
		arr1.add(new int[] {11,22,33});
		arr1.add(new Date());
		arr1.add(new ArrayList());
		System.out.println("add : "+arr1);
		arr1.add(2,"아기상어");
		System.out.println("중간삽입 : "+arr1);
		Object oo = arr1.get(0);	//원소호출
		System.out.println("get(0) : "+oo);
		arr1.set(4, "efg");		//원소대입
		System.out.println("set : "+arr1);
		
		//remove(int) : 원소번호
		//remove(Object) : 원소값
		arr1.remove(5);			// 원소값 5을 지우는 것이 아닌 5번째 원소 삭제
		// 원본 [10, 5, 아기상어, 30, efg, 20, 그는 훌륭한 키보드였습니다,...]
		//       0  1    2      3    4   5
		// 삭제후 [10, 5, 아기상어, 30, efg, 그는 훌륭한 키보드였습니다,...]
		//       5번째인 20 삭제
		System.out.println("remove(5) : "+arr1);
		arr1.remove("아기상어");	//원소값 "아기상어" 삭제			
		System.out.println("remove(\"아기상어\") : "+arr1);
		arr1.remove((Object)5);
		System.out.println("remove((Object)5) : "+arr1);
		arr1.add(2, "장수");
		arr1.add(5, "장수");
		arr1.add(7, "장수");
		System.out.println("장수 추가 : "+arr1);
		boolean bb = arr1.remove("장수");  //중복된 경우 앞에서 부터 순서대로 삭제
		System.out.println("remove(\"장수\") : "+arr1);
		System.out.println("bb : "+bb);
		bb = arr1.remove("장수");
		System.out.println("remove(\"장수\") : "+arr1);
		System.out.println("bb : "+bb);
		bb = arr1.remove("장수");
		System.out.println("remove(\"장수\") : "+arr1);
		System.out.println("bb : "+bb);
		bb = arr1.remove("장수");
		System.out.println("remove(\"장수\") : "+arr1);
		System.out.println("bb : "+bb);	//false 인 경우 삭제 내용이 없다는 의미
		oo = arr1.remove(4);	// index (int) 로 삭제시 리턴은 Object
		System.out.println("remove(4) : "+arr1);
		System.out.println("oo : "+oo);
		//oo = arr1.remove(100);   존재하지 않는 index 를 삭제하면 에러발생
		//System.out.println("remove(100) : "+arr1);
		//System.out.println("oo : "+oo);
		
		System.out.println("[검색] >>> ");
		arr1.add("efg");
		arr1.add("ttt");
		System.out.println(arr1);
		System.out.println("contains(\"efg\") : "+arr1.contains("efg"));
		System.out.println("contains(\"asdf\") : "+arr1.contains("asdf"));
		System.out.println("indexOf(\"efg\") : "+arr1.indexOf("efg"));
		System.out.println("indexOf(\"asdf\") : "+arr1.indexOf("asdf"));  //없으면 -1
		//System.out.println("indexOf(\"efg\", 1) : "+arr1.indexOf("efg", 1));  없음
		System.out.println("lastIndexOf(\"efg\") : "+arr1.lastIndexOf("efg"));
	}

}

