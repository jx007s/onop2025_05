package inner_p;

class ClaOuter{
	String a = "outer_a";
	private String b = "outer_private_b";
	String c = "outer_c";
	
	void meth_1() {
		System.out.println("outer_meth_1() 실행:"+a+","+b+","+c);
	}
	
	private void meth_2() {
		System.out.println("outer_private_meth_2() 실행");
	}
	void meth_3() {
		System.out.println("outer_meth_3() 실행:"+a+","+b+","+c);
	}
	
	InnMem mmm1 = new InnMem();
	
	void mmm() {
		System.out.println("mmm>>>>> 시작");
		// 이너의 private 접근가능
		System.out.println(mmm1.a+","+mmm1.d+","+mmm1.e);
		mmm1.meth_1();
		mmm1.meth_4();
		mmm1.meth_5();
		System.out.println("mmm>>>>> 끝");
	}
	
	//1. 멤버 Inner 클래스 (멤버 중첩 클래스)
	class InnMem{
		String a = "InnMem_a";
		String d = "InnMem_d";
		private String e = "InnMem_private_e";
		
		void meth_1() {
			System.out.println("InnMem_meth_1() 시작:");
			System.out.println(a+","+b+","+c+","+d);
			System.out.println("InnMem_meth_1() 끝:");
		}
		
		void meth_4() {
			System.out.println("InnMem_meth_4() 시작:");
			// outer클래스.this  :  outer클래스멤버접근자
			ClaOuter.this.meth_1();
			meth_2();
			meth_3();
			System.out.println(a+","+b+","+c+","+d);
			// outer클래스.this  :  outer클래스멤버접근자
			System.out.println(this.a+","+ClaOuter.this.a);
			System.out.println("InnMem_meth_1() 끝:");
		}
		
		private void meth_5() {
			System.out.println("InnMem_private_meth_5() 실행");
		}
	}
}

public class InnerMain {

	public static void main(String[] args) {
		ClaOuter co1 = new ClaOuter();
		ClaOuter co2 = new ClaOuter();
		co2.a = "바깥양반_a";
		co2.c = "바깥양반_c";
		System.out.println("co1 : "+co1.a);
		co1.meth_1();
		System.out.println("co2 : "+co2.a);
		co2.meth_1();
		
		//InnMem im1;  단독 선언 및 생성불가
		//멤버 inner클래스 선언
		// outer클래스명.inner클래스명 변수명;
		ClaOuter.InnMem im11;
		// outer클래스명.inner클래스명 생성불가
		//im11 = new ClaOuter.InnMem();
		
		// 생성 : outer인스턴스변수.new inner클래스생성자()
		im11 = co1.new InnMem();
		ClaOuter.InnMem im12 = co1.new InnMem();
		
		ClaOuter.InnMem im21 = co2.new InnMem();
		
		System.out.println("im11 >>>");
		//outer 멤버변수 접근불가 : im11.c
		//System.out.println(im11.a+","+im11.c+","+im11.d);
		System.out.println(im11.a+","+im11.d);
		im11.meth_1();
		//im11.meth_3();
		im11.meth_4();
		
		System.out.println("im12 >>>");
		System.out.println(im12.a+","+im12.d);
		im12.meth_1();
		im12.meth_4();
		
		
		System.out.println("im21 >>>");
		System.out.println(im21.a+","+im21.d);
		im21.meth_1();
		im21.meth_4();
		co1.mmm();
	}

}
