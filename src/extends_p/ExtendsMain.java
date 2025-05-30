package extends_p;

class ExPar{
	String a ="부모a";
	
	void meth_1() {
		System.out.println("부모 meth_1() 실행");
	}
}


class Uncle{
	
}
/*
클래스 상속정의
class 부모클래스{
	...
}

class 자식클래스 extends 부모클래스{
	...
}
 * */

class ExChild1 extends ExPar { // , Uncle{  다중상속 불가
	String b ="자식1b";
	
	void meth_2() {
		System.out.println("자식1 meth_2() 실행");
	}
}


class ExChild2 extends ExPar {
	String c ="자식2c";
	
	void meth_3() {
		System.out.println("자식2 meth_3() 실행");
	}
}


public class ExtendsMain {

	public static void main(String[] args) {
		ExPar pp = new ExPar();
		ExChild1 cc1 = new ExChild1();
		ExChild2 cc2 = new ExChild2();
		
		System.out.println("pp :"+pp.a);
		//System.out.println("pp :"+pp.b);  부모인스턴스 자식멤버요소접근불가
		pp.meth_1();
		//pp.meth_2();
		
		//자식인스턴스 부모멤버요소접근가능
		System.out.println("cc1 :"+cc1.a);
		System.out.println("cc1 :"+cc1.b);
		//System.out.println("cc1 :"+cc1.c);  형제멤버요소접근불가
		cc1.meth_1();
		cc1.meth_2();
		//cc1.meth_3();
		
		//자식인스턴스 부모멤버요소접근가능
		System.out.println("cc2 :"+cc2.a);
		//System.out.println("cc2 :"+cc2.b);
		System.out.println("cc2 :"+cc2.c);
		cc2.meth_1();
		//cc2.meth_2();
		cc2.meth_3();

	}

}
