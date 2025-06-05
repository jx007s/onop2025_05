package lang_p;

import java.util.Objects;

class ObjAAA{
	String a = "아기상어";
	int b = 20;
	
	@Override
	public String toString() {
		return "ObjAAA [a=" + a + ", b=" + b + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(a, b);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjAAA other = (ObjAAA) obj;
		return Objects.equals(a, other.a) && b == other.b;
	}
	
	
	
	/*
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString();
		// return getClass().getName() + "@" + Integer.toHexString(hashCode());
		//return "나여";
		return a+","+b;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		//return (this == obj);
		//return super.equals(obj);
		ObjAAA you = (ObjAAA)obj;
		return a == you.a;
	}
	*/
}

public class ObjectMain {

	public static void main(String[] args) {
		ObjAAA a1 = new ObjAAA();
		ObjAAA a2 = new ObjAAA();
		ObjAAA a3 = a1; 
		ObjAAA a4 = new ObjAAA();
		
		a4.a = "엄마상어";
		
		a1.toString();
		
		Object o1 = a1;	//Object 클래스는 모든 인스턴스들의 부모
						//모든 인스턴스는 Object로 형변환 가능
		
		System.out.println(a1==a2);
		System.out.println(a1==a3);
		System.out.println(a1);		//a1.toString() 호출
		System.out.println(a1.toString());
		System.out.println(a1.getClass());	
		
		Class cc = a1.getClass();
		System.out.println(cc);
		System.out.println(a1.hashCode());
		//    5305068a
		//  1392838282
		System.out.println(cc.toString());
		System.out.println(cc.getName());
		
		
		System.out.println(a2);
		System.out.println(a2.toString());
		System.out.println(a3);
		System.out.println(a3.toString());
		System.out.println(a4);
		System.out.println(a4.toString());
		
		System.out.println(a1.equals(a2));
		System.out.println(a1.equals(a3));
		System.out.println(a1.equals(a4));
	}

}
