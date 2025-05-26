package oops_p;

import java.util.Arrays;

/* 1. 정의 (클래스 정의) -- 설계도면 
 * 정의만 해서는 코드진행에 영향을 미치지 않음
class 클래스명{



}

*/
//클래스명 : Asdf
class Asdf{

	//멤버변수 (필드) 선언
	int a = 10;
	String b = "아기상어";
	int [] c = {999,888,777};
	
	//메소드 정의
	void meth_1() {
		System.out.println("Asdf.meth_1() 실행");
	}
	
}

public class InstanceMain {

	public static void main(String[] args) {
		int a = 10;
		int [] arr = new int[]{11,22,33};
		
		Asdf zxc;			//2. 선언 - 인스턴스변수 선언
		zxc = new Asdf();	//3. 생성 - 인스턴스 생성 -> 인스턴스주소 인스턴스변수에 대입	
		
		Asdf qwe = new Asdf();
		
		System.out.println("a : "+a);
		System.out.println("arr : "+arr);
		System.out.println("zxc : "+zxc);
		System.out.println("qwe : "+qwe);
		
		zxc.a = 20;
		qwe.b = "엄마상어";
		zxc.c[1] = 876;
		qwe.c[2] = 714;
		
		//4. 호출  - 인스턴스변수.필드 호출
		System.out.println("zxc : "+zxc.a+","+zxc.b+","+zxc.c+Arrays.toString(zxc.c));	
		zxc.meth_1();	//인스턴스변수.메소드 호출
		
		System.out.println("qwe : "+qwe.a+","+qwe.b+","+qwe.c+Arrays.toString(qwe.c));	
		qwe.meth_1();
	}

}
