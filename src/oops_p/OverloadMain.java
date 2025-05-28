package oops_p;

class OverAAA{
	void meth(int a, String b) {
		System.out.println("원본 : "+a+","+b);
	}
	/*
	void meth(int a, String b) {
		System.out.println("중복 에러발생 : "+a+","+b);
	}*/
	
	/* overloading 
	 동일 클래스에서
	 메소드의 이름이 같으나 매개변수가 달라 다른 메소드로 인지하는 것(에러 발생하지 않는다)
	 */
	void meth(int a, String b, int c) {
		System.out.println("갯수가 다른경우 : "+a+","+b+","+c);
	}
	
	void meth(String a, String b) {
		System.out.println("자료형이 다른경우 1 : "+a+","+b);
	}
	void meth(String b, int a) {
		System.out.println("자료형이 다른경우 2 : "+a+","+b);
	}
	/*
	overloading 이 아닌 경우
	void meth(int a, String c) {
		System.out.println("매개변수 이름 변경은 의미없음 : "+a+","+c);
	}
	
	
	int meth(int a, String b) {
		System.out.println("리턴형도 의미없음 : "+a+","+b);
		return 1234;
	}
	*/
}
class OverBBB{
	void meth(int a, String b) {
		System.out.println("다른 클래스 : "+a+","+b);
	}
}

public class OverloadMain {

	public static void main(String[] args) {
		OverAAA oa = new OverAAA();
		OverBBB ob = new OverBBB();
		oa.meth(10, "장수풍뎅이");
		ob.meth(20, "사슴벌레");
		
		oa.meth(30, "잠자리",40);
		oa.meth("메뚜기","벼멸구");
		oa.meth("하늘소",50);

	}

}
