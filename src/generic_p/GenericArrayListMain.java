package generic_p;

import java.util.ArrayList;

class TV{

	@Override
	public String toString() {
		return "TV";
	} 
}

class Phone{
	@Override
	public String toString() {
		return "Phone";
	}
}

class HandPhone extends Phone{
	@Override
	public String toString() {
		return "HandPhone";
	}
}

class FootPhone extends Phone{
	@Override
	public String toString() {
		return "FootPhone";
	}
}

public class GenericArrayListMain {
	public static void main(String[] args) {
		ArrayList objArr = new ArrayList();
		ArrayList<Phone> ppArr = new ArrayList();
		ArrayList<HandPhone> hhArr = new ArrayList();
		ArrayList<FootPhone> ffArr = new ArrayList();
		ArrayList<? super HandPhone> shArr = new ArrayList();  //ArrayList<HandPhone> 와 같음
		ArrayList<? extends HandPhone> ehArr = new ArrayList();  // 모두 불가 - 의미 없음
		ArrayList<TV> tvArr = new ArrayList();
		
		objArr.add(new TV());
		objArr.add(new Phone());
		objArr.add(new HandPhone());
		objArr.add(new FootPhone());
		
		System.out.println("objArr "+objArr);
		
		//ppArr.add(new TV());  불가
		ppArr.add(new Phone());
		ppArr.add(new HandPhone());	// 자식클래스 가능
		ppArr.add(new FootPhone());	// 자식클래스 가능
		
		System.out.println("ppArr "+ppArr);
		
		//hhArr.add(new TV());
		//hhArr.add(new Phone());
		hhArr.add(new HandPhone());	//자신만 가능 (부모 불가)
		//hhArr.add(new FootPhone());
		System.out.println("hhArr "+hhArr);
		
//		ffArr.add(new TV());
//		ffArr.add(new Phone());
//		ffArr.add(new HandPhone());
		ffArr.add(new FootPhone());//자신만 가능 (부모 불가)
		System.out.println("ffArr "+ffArr);
		
//		shArr.add(new TV());
//		shArr.add(new Phone());
		shArr.add(new HandPhone());//자신만 가능 (부모 불가)
//		shArr.add(new FootPhone());
		
		System.out.println("shArr "+shArr);
		
		objArr.add(new TV());
		objArr.add(new Phone());
		objArr.add(new HandPhone());
		objArr.add(new FootPhone());
		
		System.out.println("shArr "+shArr);
		
//		ehArr.add(new TV());
//		ehArr.add(new Phone());
//		ehArr.add(new HandPhone());
//		ehArr.add(new FootPhone());  모두 불가 - 의미 없음
		
		
		tvArr.add(new TV());
//		tvArr.add(new Phone());
//		tvArr.add(new HandPhone());
//		tvArr.add(new FootPhone());
		
		System.out.println("tvArr "+tvArr);
		
		//// 메소드 호출
		methObj(objArr);
		methObj(ppArr);
		methObj(hhArr);
		methObj(ffArr);
		methObj(shArr);
		methObj(ehArr);
		methObj(tvArr);
		
//		methPP(objArr);		// Generic 이 설정된 메소드에서는 Object ArrayList는 하지 말것
		methPP(ppArr);		//자신 + Object 호출 가능한 것으로 보이나 내부 코드에서 Object ArrayList 에러발생
//		methPP(hhArr);		// 자식 불가
//		methPP(ffArr);
//		methPP(shArr);
//		methPP(ehArr);
//		methPP(tvArr);
		
		//methHH(objArr);
		//methHH(ppArr);
		methHH(hhArr);	// 자신만 가능 , 부모 불가
//		methHH(ffArr);
//		methHH(shArr);
//		methHH(ehArr);
//		methHH(tvArr);
		
		// 자신 + 자식		
//		methHHEx(objArr);
//		methHHEx(ppArr);
		methHHEx(hhArr);	//자신 가능
//		methHHEx(ffArr);
//		methHHEx(shArr);
		methHHEx(ehArr);	//자신 + <? extends 자신> 가능
//		methHHEx(tvArr);
		
		// 자신 + 자식
//		methPPEx(objArr);
		methPPEx(ppArr);    //자신
		methPPEx(hhArr);	// 자식
		methPPEx(ffArr);	// 자식
//		methPPEx(shArr);
		methPPEx(ehArr);	// ? extends 자신
//		methPPEx(tvArr);
		
		
	//	methHHSuper(objArr);
		methHHSuper(ppArr);  // 자신 + 부모 가능
		methHHSuper(hhArr);  // 자신 + 부모 가능
	//	methHHSuper(ffArr);
		methHHSuper(shArr);  // ? super 자신 가능
	//	methHHSuper(ehArr);
	//	methHHSuper(tvArr);
		
	}	
	
	static void methObj(ArrayList arr) { for (Object obj : arr) {	}}
	static void methPP(ArrayList<Phone> arr) { for (Phone obj : arr) {	}}
	static void methHH(ArrayList<HandPhone> arr) { for (HandPhone obj : arr) {	}}
	
	//? extends 부모   ::> 자신과 자식 가능
	static void methHHEx(ArrayList<? extends HandPhone> arr) { for (HandPhone obj : arr) {	}}
	static void methPPEx(ArrayList<? extends Phone> arr) { for (Phone obj : arr) {	}}
	
	static void methHHSuper(ArrayList<? super HandPhone> arr) { 
		//for (HandPhone obj : arr) {	}  에러발생
		for (Object obj : arr) {	}  
	}
}
