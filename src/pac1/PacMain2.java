package pac1;

import pac2.DDD;

/*
 				클래스 내부	 같은패키지	 다른패키지 자손클래스	 	전체
public 	 			O	 		O				O	 			O
protected	 		O	 		O	 			O	 
default(생략)	 	O	 		O	 	 
private 	 		O	

*/


//부모로 다른패키지클래스를 지정함
class DDDChild extends DDD{
	void meth_c() {
		System.out.println("DDDchild meth_c() 시작-----");
		//부모클래스 : 다른패키지인 경우 - public, protected 접근가능
		//  						default(생략), private 접근불가
		System.out.println("a : "+a);
		System.out.println("b : "+b);  
		//System.out.println("c : "+c);
		//System.out.println("d : "+d);
		meth_1();
		meth_2();
		//meth_3();
		//meth_4();
		
		System.out.println("DDDchild meth_c() 끝-----");
	}
}

class Par{
	public String a = "par_public_a";
	protected String b = "par_protected_b";
	String c = "par_c";
	private String d = "par_private_d";
	
	public void meth_1() {
		System.out.println("par_public_meth_1() 실행");
	}
	 protected void meth_2() {
		System.out.println("par_protected_meth_2() 실행");
	}
	void meth_3() {
		System.out.println("par_meth_3() 실행");
	}
	private void meth_4() {
		System.out.println("par_private_meth_4() 실행");
	}
	
	void meth_5() {
		
		//클래스 내부 : public, protected, default, private 모두 접근 가능
		System.out.println("par_meth_5() 시작------");
		System.out.println("a : "+a);
		System.out.println("b : "+b);  
		System.out.println("c : "+c);
		System.out.println("d : "+d);
		meth_1();
		meth_2();
		meth_3();
		meth_4();
		System.out.println("par_meth_5() 끝-----");
	}
}

class Child extends Par{
	void meth_c() {
		//같은패키지 상속인 경우 public, protected, default(생략) 접근가능
		//  	            private 접근불가
		System.out.println("child_meth_5() 시작------");
		System.out.println("a : "+a);
		System.out.println("b : "+b);  
		System.out.println("c : "+c);
		//System.out.println("d : "+d);
		meth_1();
		meth_2();
		meth_3();
		//meth_4();
		System.out.println("par_meth_5() 끝-----");
	}
}



public class PacMain2 {

	public static void main(String[] args) {
		
		DDD p2d = new DDD();
		DDDChild p1dc = new DDDChild();
		Par pp = new Par();
		
		//다른 패키지로 생성된 인스턴스 public 만 접근가능
		System.out.println("p2d : "+p2d.a);
		//System.out.println("p2d : "+p2d.b);
		//System.out.println("p2d : "+p2d.c);
		//System.out.println("p2d : "+p2d.d);
		p2d.meth_1();
		//p2d.meth_2();
		//p2d.meth_3();
		//p2d.meth_4();
		
		System.out.println("p1dc.a : "+p1dc.a);
		//System.out.println("p1dc.b : "+p1dc.b);
		//System.out.println("p1dc.c : "+p1dc.c);
		//System.out.println("p1dc.d : "+p1dc.d);
		p1dc.meth_1();
//		p1dc.meth_2();
//		p1dc.meth_3();
//		p1dc.meth_4();
		p1dc.meth_c();
		
		
		//같은패키지인 경우 public, protected, default(생략) 접근가능
		//              private 접근불가
		System.out.println("pp.a : "+pp.a);
		System.out.println("pp.b : "+pp.b);
		System.out.println("pp.c : "+pp.c);
		//System.out.println("pp.d : "+pp.d);
		pp.meth_1();
		pp.meth_2();
		pp.meth_3();
		//pp.meth_4();
		pp.meth_5();

	}

}
