package pac1;

/*

클래스명 접근 우선순위

패키지명부터 전부기재: pac1.FFF p1f = new pac1.FFF();
명시적 import : import pac2.FFF
현재 패키지
자동 import : import pac2.*
 * */

import pac2.DDD; //다른패키지 접근시 import 필요
//import pac2.EEE;  public 클래스가 아니어서 불가
import pac2.FFF;
import pac2.*;  //pac2 안에 접근가능한(public) 클래스 요소 import

/*
 	      클래스 내부	 같은패키지	 다른패키지 자손클래스	 	전체
 public 	 O	 		O				O	 			O
 protected	 O	 		O	 			O	 
 default(생략)	 O	 	O	 	 
 private 	 O	
 
 */

class AAA{
	String a = "p1_AAA_a";
	String b = "p1_AAA_b";
	
	void meth_1() {
		System.out.println("p1_AAA_meth_1() 실행");
	}
}

public class PacMain {

	public static void main(String[] args) {
		AAA p1a = new AAA();
		BBB p1b = new BBB();
		CCC p1c = new CCC();
		DDD p2d = new DDD();
		//EEE p2e = new EEE();
		FFF p2f = new FFF();
		GGG p2g = new GGG();
		HHH p2h = new HHH();
		
		//패키지명부터 전부기재
		pac1.FFF p1f = new pac1.FFF();
		
		System.out.println("p1a : "+p1a.a+","+p1a.b);
		p1a.meth_1();
		System.out.println("p1b : "+p1b.a+","+p1b.b);
		p1b.meth_1();
		System.out.println("p1c : "+p1c.a+","+p1c.b);
		p1c.meth_1();
		
		//다른 패키지로 생성된 인스턴스 public 만 접근가능
		System.out.println("p2d : "+p2d.a);
		//System.out.println("p2d : "+p2d.b);
		//System.out.println("p2d : "+p2d.c);
		//System.out.println("p2d : "+p2d.d);
		p2d.meth_1();
		//p2d.meth_2();
		//p2d.meth_3();
		//p2d.meth_4();
		//System.out.println("p2e : "+p2e.a);
		//p2e.meth_1();
		System.out.println("p2f : "+p2f.a);
		p2f.meth_1();
		System.out.println("p2g : "+p2g.a);
		p2g.meth_1();
		System.out.println("p2h : "+p2h.a);
		p2h.meth_1();
		System.out.println("p1f : "+p1f.a);
		p1f.meth_1();
	}

}
