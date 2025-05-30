package extends_p;

class OvPar{
	
	OvPar() {
		System.out.println("부모생성자-----------");
	}
	String a = setA(), b=setB();
	final String c = setC();
	static String sa=setSA();
	
	String setA() {
		System.out.println("부모 setA()");
		return "부모a";
	}
	String setB() {
		System.out.println("부모 setB()");
		return "부모b";
	}
	String setC() {
		System.out.println("부모 setC()");
		return "부모c";
	}
	
	static String setSA() {
		System.out.println("static 부모 setSA()");
		return "static부모sa";
	}
	
	void meth_1() {
		System.out.println("부모 meth_1");
	}
	void meth_2() {
		System.out.println("부모 meth_2");
	}
	final void meth_3() {
		System.out.println("final 부모 meth_3");
	}
	static void meth_s1() {
		System.out.println("static 부모 meth_s1");
	}
}

class OvChild extends OvPar{
	//hiding : 부모멤버필드와 자식멤버필드의 중첩선언
	String a = childsetA(); 
	//부모 final 멤버필드도 hiding 가능 - 기존 final 멤버필드와 다른 필드
	String c = childsetC(); 
	static String sa=childsetSA();
	
	String ca = setCA();
	static String sca = setSCA();
	
	String childsetA() {
		System.out.println("자식 childsetA()");
		return "자식a";
	}
	String childsetC() {
		System.out.println("자식 childsetC()");
		return "자식c";
	}
	
	static String childsetSA() {
		System.out.println("static 자식 childsetSA()");
		return "static 자식sa";
	}
	
	String setCA() {
		System.out.println("자식 setCA()");
		return "자식ca";
	}
	
	static String setSCA() {
		System.out.println("static 자식 setSCA()");
		return "static자식sca";
	}
	void meth_c1(){
		System.out.println("자식 meth_c1");
	}
	static void meth_sc1() {
		System.out.println("static 자식 meth_sc1");
	}
	OvChild() {
		System.out.println("자식생성자-----------");
	}
	
	//override : 메소드재정의
	void meth_1() {
		System.out.println("자식 meth_1");
	}
	
	/* final 메소드는 override 불가
	void meth_3() {
		System.out.println("자식 meth_3");
	}*/
	//override : static 메소드재정의 가능
	static void meth_s1() {
		System.out.println("static 자식 meth_s1");
	}
}


public class OverrideMain {

	public static void main(String[] args) {
		OvChild cc = new OvChild();
		System.out.println("------------------");
		System.out.println("a:"+cc.a);
		System.out.println("b:"+cc.b);
		System.out.println("c:"+cc.c);
		cc.c = "아기상어";
		System.out.println("sa:"+cc.sa);
		System.out.println("OvPar.sa:"+OvPar.sa);
		System.out.println("OvChild.sa:"+OvChild.sa);
		System.out.println("ca:"+cc.ca);
		System.out.println("sca:"+cc.sca);
		cc.meth_1();
		cc.meth_2();
		cc.meth_3();
		cc.meth_s1();
		OvPar.meth_s1();
		OvChild.meth_s1();
		cc.meth_c1();
		
		

	}

}

