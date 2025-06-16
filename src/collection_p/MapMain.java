package collection_p;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapMain {

	public static void main(String[] args) {
		HashMap mm = new HashMap();
		// 키 중복 불가,  순서없음
		
		//mm.add("고래","포유류");
		mm.put("고래","포유류");
		mm.put("상어","어류");
		mm.put("악어","파충류");
		mm.put("오타니","이도류");
		mm.put("상어","뚜루루뚜루");  //key 중복 : 대입 - 에러발생하지 않고 값을 변경
		mm.put("사자","포유류");	  //value 중복 가능
		mm.put(100,123.456);
		mm.put(true, 'a');
		
		System.out.println(mm);
		
		System.out.println(mm.get("고래"));  // key 에 해당하는 value 호출
		System.out.println(mm.get("문어"));	// key 가 없으면 null
		System.out.println(mm.get("이도류"));	// value 는 key가 아님
		
		Object oo = mm.remove("상어");  // map 에서 삭제 후 삭제된 value를 리턴
		System.out.println(mm);
		System.out.println(oo);
		oo = mm.remove("고등어"); // key 가 없으면 null 리턴 (삭제는 없음)
		System.out.println(mm);
		System.out.println(oo);
		
		System.out.println(mm.size());
		System.out.println(mm.containsKey("오타니"));
		System.out.println(mm.containsKey("사타니"));
		System.out.println(mm.containsValue("포유류"));
		System.out.println(mm.containsValue("어류어겐"));
		
		HashMap mm1 = new HashMap();
		mm1.put("김원중", "롯데");
		mm1.put("구자욱", "삼성");
		mm1.put("손아섭", "NC");
		
		System.out.println(mm1);
		mm.putAll(mm1);
		System.out.println(mm);
		
		HashMap mm2 = new HashMap();
		mm2.put("이동국", "전북");
		mm2.put("안정환", "몰라");
		mm2.put("이천수", "인천");
		
		
		HashMap mm3 = mm2;
		HashMap mm4 = new HashMap(mm3);
		HashMap mm5 = (HashMap)mm2.clone();
		
		mm2.put("안정환","뭉쳐야찬다");
		
		System.out.println(mm2);
		System.out.println(mm3);
		System.out.println(mm4);
		System.out.println(mm5);
		
		System.out.println(mm2==mm3);
		System.out.println(mm2==mm4);
		System.out.println(mm2==mm5);
		
		System.out.println(mm);
		
		/* for 문 직접사용 불가
		for (Object oo : mm) {
			
		}*/
		
		Set ss = mm.entrySet();   // key, value 묶어서 1개의 Map.Entry로 만들어 Set으로 변환
		
		/*
		 100=123.456 ==> Map.Entry 
		 손아섭=NC
		 악어=파충류
		 ...
         true=a 
         
         
         ss = [Map.Entry , Map.Entry , Map.Entry , Map.Entry ...]
         
         
         Map.Entry
         100=123.456
         getKey() : 100
         getValue() : 123.456
		 * */
		
		System.out.println(ss);
		for (Object obj : ss) {
			//System.out.println(obj);
			
			Map.Entry me = (Map.Entry)obj; 
			System.out.println(me.getKey()+" : "+me.getValue());
		}
		
		Set kk = mm.keySet();
		System.out.println(kk);
		for (Object obj : kk) {
			
			System.out.println(obj+" : "+mm.get(obj));
		}
		
		Collection vv = mm.values();
		
		System.out.println(vv);
		for (Object obj : vv) {
			
			System.out.println(obj);
		}
		
		
		System.out.println(mm);
		//Iterator it = mm.iterator();  map 에서 직접 Iterator를 가져올수 없다.
		Iterator it = mm.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry me =  (Map.Entry)it.next();
			//System.out.println(it.next());
			
			System.out.println(me.getKey()+" : "+me.getValue());
			
			if(me.getValue().equals("포유류")) {
				it.remove();
			}
		}
		
		System.out.println(mm);
	}

}
