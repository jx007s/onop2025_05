package collection_p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
		
		//Object oo = remove(int) : 원소번호
		//boolean bb = +remove(Object) : 원소값
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
		oo = arr1.removeFirst();
		System.out.println("removeFirst() : "+arr1);
		System.out.println("oo : "+oo);
		oo = arr1.removeLast();
		System.out.println("removeLast() : "+arr1);
		System.out.println("oo : "+oo);
		
		System.out.println("[검색] >>> ");
		arr1.add("efg");
		arr1.add("ttt");
		arr1.add("yuio");
		System.out.println(arr1);
		System.out.println("contains(\"efg\") : "+arr1.contains("efg"));
		System.out.println("contains(\"asdf\") : "+arr1.contains("asdf"));
		System.out.println("indexOf(\"efg\") : "+arr1.indexOf("efg"));
		System.out.println("indexOf(\"asdf\") : "+arr1.indexOf("asdf"));  //없으면 -1
		//System.out.println("indexOf(\"efg\", 1) : "+arr1.indexOf("efg", 1));  없음
		System.out.println("lastIndexOf(\"efg\") : "+arr1.lastIndexOf("efg"));
		System.out.println("getFirst() : "+arr1.getFirst());
		System.out.println("getLast() : "+arr1.getLast());
		System.out.println("size() : "+arr1.size());
		
		System.out.println("[추출] >>> ");
		System.out.println("arr1 : "+arr1);
		Object [] ooArr = arr1.toArray();
		System.out.println("toArray() : "+ooArr+Arrays.toString(ooArr));
		System.out.println(ooArr[0]);
		System.out.println(arr1.get(0));
		List arr2 = arr1.subList(2, 6);		//shallow copy
		List arr3 = new ArrayList(arr2);	//새로 생성
		System.out.println("subList(2, 6) : "+arr2);
		System.out.println("arr3 : "+arr3);
		
		arr2.add(1357);	//부분집합에서 추가
		arr1.set(5,"쭈꾸미가먹고싶어요");	//원본에서 변경
		System.out.println("arr1 : "+arr1);	//원본도 추가, 변경
		System.out.println("arr2 : "+arr2);	//자신 추가, 변경
		System.out.println("arr3 : "+arr3);	// 새로 생성된 list는 영향 없음
		
		System.out.println("원본추가 후");
		//arr1.add(2,"프테라노돈");	//원본에서 추가시 subList 커넥션이 끊어짐
		arr1.add("브라키오사우루스");	//원본에서 추가 위치가 subList와 달라도 subList 커넥션이 끊어짐 
		System.out.println("arr1 : "+arr1);	//원본 추가
		//System.out.println("arr2 : "+arr2);	//에러발생
		System.out.println("arr3 : "+arr3);	// 새로 생성된 list는 영향 없음
		
		System.out.println("[All] >>> ");
		List arr4 = new ArrayList();
		arr4.add(100);
		arr4.add(200);
		arr4.add(300);
		arr4.add(400);
		arr4.add(500);
		List arr5 = new ArrayList();
		arr5.add(400);
		arr5.add(500);
		arr5.add(600);
		System.out.println("arr4:"+arr4);
		System.out.println("arr5:"+arr5);
		System.out.println("containsAll(arr5) : "+arr4.containsAll(arr5));
		arr4.add(600);
		System.out.println("containsAll(arr5) : "+arr4.containsAll(arr5));
		arr4.removeAll(arr5);
		System.out.println("removeAll(arr5):"+arr4);
		List arr6 = new ArrayList();
		arr6.add(100);
		arr6.add(300);
		arr6.add(500);
		System.out.println("arr4:"+arr4);
		System.out.println("arr6:"+arr6);
		arr4.retainAll(arr6);		//arr6 에 있는것만 남기고 삭제
		System.out.println("retainAll(arr6):"+arr4);
		System.out.println("arr6:"+arr6);
		System.out.println("isEmpty():"+arr6.isEmpty());
		arr6.clear();
		System.out.println("clear():"+arr6);
		System.out.println("isEmpty():"+arr6.isEmpty());
		
		System.out.println("[Collections] >>> ");
		arr4.add(100);
		arr4.add(400);
		arr4.add(700);
		arr4.add(100);
		arr4.add(900);
		arr4.add(100);
		System.out.println("arr4:"+arr4);
		Collections.replaceAll(arr4, 100, "백");
		System.out.println("replaceAll(arr4, 100, \"백\"):"+arr4);
		Collections.reverse(arr4);
		System.out.println("reverse(arr4):"+arr4);
		Collections.swap(arr4, 1, 4);
		System.out.println("swap(arr4, 1, 4):"+arr4);
		Collections.shuffle(arr4);
		System.out.println("shuffle(arr4):"+arr4);
		//Collections.sort(arr4);   비교가능한 원소만 있어야 함
		ArrayList arr7 = new ArrayList();
		arr7.add(100);
		arr7.add(12);
		arr7.add(34);
		arr7.add(9);
		arr7.add(12);
		arr7.add(34);
		arr7.add(56);
		arr7.add(88);
		System.out.println("arr7:"+arr7);
		Collections.sort(arr7);
		System.out.println("sort(arr7):"+arr7);
		
		System.out.println("[copy] >>> ");
		
		ArrayList arr8 = arr7;						//shallow copy
		ArrayList arr9 = new ArrayList( arr7);		//deep copy
		ArrayList arr10 = (ArrayList)arr7.clone(); 	//deep copy
		
		//hashCode() 로 확인 불가
		System.out.println("arr7:"+arr7.hashCode()+arr7);
		System.out.println("arr8:"+arr8.hashCode()+arr8);
		System.out.println("arr9:"+arr9.hashCode()+arr9);
		System.out.println("arr10:"+arr10.hashCode()+arr10);
		System.out.println("arr7==arr8:"+(arr7==arr8));
		System.out.println("arr7==arr9:"+(arr7==arr9));
		System.out.println("arr7==arr10:"+(arr7==arr10));
		arr7.set(1, 1234);
		System.out.println("arr7:"+arr7.hashCode()+arr7);
		System.out.println("arr8:"+arr8.hashCode()+arr8);
		System.out.println("arr9:"+arr9.hashCode()+arr9);
		System.out.println("arr10:"+arr10.hashCode()+arr10);
	}

}

