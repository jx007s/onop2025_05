package extends_p;

class Grand{
	String g = "할아버지g";
	void meth_g() {
		System.out.println("할아버지 meth_g()");
	}
}

class OvPar extends Grand{
	//할아버지 hiding
	String g = "부모g";
	//할아버지 overriding
	void meth_g() {
		System.out.println("부모 meth_g()");
	}
	
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
	
	//자식 클래스에서 overriding 불가
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
	
	// super : 부모접근자
	// super  : 클래스 정의부에서 사용
	//			인스턴스변수에서 super 접근불가
	String pa = super.a;
	
	void meth_tot(){
		System.out.println("자식 meth_tot 시작 >>>");
		super.meth_1();
		System.out.println("자식 meth_tot 끝 >>>");
	}
	
	String gg = super.g;
	//부모의 부모 멤버 접근불가
	//String gg = super.super.g;
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
		System.out.println("super--------------");
		System.out.println("pa:"+cc.pa);
		//	인스턴스변수에서 super 접근불가
		//System.out.println("super.a:"+cc.super.a);
		cc.meth_tot();
		System.out.println("g:"+cc.g);
		cc.meth_g();
		System.out.println("gg:"+cc.gg);
	}

}

