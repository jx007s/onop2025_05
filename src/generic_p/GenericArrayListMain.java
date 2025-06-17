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
		ArrayList<? super HandPhone> shArr = new ArrayList();
		ArrayList<? extends HandPhone> ehArr = new ArrayList();
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
	}	
}
