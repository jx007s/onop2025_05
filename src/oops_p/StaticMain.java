package oops_p;

class ClaStatic{
	int a = 10;
	int b = setB();
	int c = setC();
	int d = setD();
	int e = 50;
	
	int setB() {
		System.out.println("setB() 실행");
		return 20;
	}
	
	int setC() {
		System.out.println("setC() 실행");
		return a+b;
	}
	int setD() {
		System.out.println("setD() 실행");
		return e;
	}
	
	//static 변수
	static int sa = 100;
	static int sb = setSB();
	
	//static 메소드
	static int setSB() {
		System.out.println("static setSB() 실행");
		return 200;
	}
	static void meth_s1() {
		System.out.println("static meth_s1() 실행");
	}
	
	void meth_1() {
		System.out.println("meth_1() 실행");
	}
	
	static void meth_s2() {
		// static 에서 instance 필드 , 메소드 접근불가
		//- 정의 및 호출시 인스턴스 접근자 없이 사용가능해야 함
		//System.out.println("static meth_s2() 시작 -------"+sa+","+sb+","+a+","+b);
		System.out.println("static meth_s2() 시작 -------"+sa+","+sb);
		meth_s3();
		//meth_3();
		System.out.println("static meth_s2() 끝 -------");
	}
	
	void meth_2() {
		System.out.println("meth_2() 시작 -------"+sa+","+sb+","+a+","+b);
		meth_s3();
		meth_3();
		System.out.println("meth_2() 끝 -------");
	}
	
	static void meth_s3() {
		System.out.println("static meth_s3() 실행");
	}
	
	void meth_3() {
		System.out.println("meth_3() 실행");
	}
}

public class StaticMain {
	
	int qwer = 1234;
	static int asdf = 5678;

	public static void main(String[] args) {
		
		//System.out.println(qwer);
		//System.out.println(asdf);
		
		System.out.println("ClaStatic : "+ClaStatic.sa+","+ClaStatic.sb);
		//System.out.println(ClaStatic.a+","+ClaStatic.b+","+ClaStatic.c);
		ClaStatic.meth_s1();
		//ClaStatic.meth_1();
		System.out.println("--------------------");
		ClaStatic cs1 = new ClaStatic();
		System.out.println("--------------------");
		ClaStatic cs2 = new ClaStatic();
		System.out.println("--------------------");
		System.out.println("cs1 : "+cs1.a+","+cs1.b+","+cs1.c);
		System.out.println("cs1 : "+cs1.d+","+cs1.e);
		System.out.println("cs1 : "+cs1.sa+","+cs1.sb);
		System.out.println("cs2 : "+cs2.a+","+cs2.b+","+cs2.c);
		System.out.println("cs2 : "+cs2.d+","+cs2.e);
		System.out.println("cs2 : "+cs2.sa+","+cs2.sb);
		System.out.println("변경후--------------------");
		ClaStatic.sa = 1234;	//공용 - 같은클래스로 생성된 인스턴스 모두 변경
		cs1.a = 135; //각 인스턴스 멤버 필드 변경
		cs2.b = 246;
		cs1.sb = 2468;
		System.out.println("ClaStatic : "+ClaStatic.sa+","+ClaStatic.sb);
		System.out.println("cs1 : "+cs1.a+","+cs1.b+","+cs1.c);
		System.out.println("cs1 : "+cs1.sa+","+cs1.sb);
		System.out.println("cs2 : "+cs2.a+","+cs2.b+","+cs2.c);
		System.out.println("cs2 : "+cs2.sa+","+cs2.sb);
		cs1.meth_s2();
		cs1.meth_2();
	}

}
