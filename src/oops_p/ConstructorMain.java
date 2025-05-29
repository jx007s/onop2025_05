package oops_p;

class ClaConst{
	
	//생성자 정의
	//멤버변수 초기화
	//기본 생성자 - 생성자 명시 할 경우 기본생성자 필요한 경우에는 기본생성자도 명시해야 한다.
	ClaConst(){
		System.out.println("기본생성자");
		a = 123;
		sa++;
	}
	
	//생성자 오버로딩
	ClaConst(int b){
		System.out.println("사용자 정의 생성자 1");
		this.b = b;
	}
	
	ClaConst(int aa, int bb, int cc){
		//System.out.println("생성자 돌리기 전");
		//생성자 위임 전에 실행코드 진행 불가
		this(aa+bb+cc); //생성자 위임
		System.out.println("사용자 정의 생성자 2-생성자 위임");
	}

	int a = setA();
	int b = setB();
	static int sa = setSA();
	
	
	//생성자 정의가 아님
	void ClaConst(){
		System.out.println("메소드 임");
	}
	
	
	
	int setA() {
		System.out.println("setA() 실행");
		return 10;
	}
	int setB() {
		System.out.println("setB() 실행");
		return 20;
	}
	
	static int setSA() {
		System.out.println("static setSA() 실행");
		return 100;
	}
	
	void ppp() {
		System.out.println(this+" : "+a+","+b+","+sa);
	}
	
}
public class ConstructorMain {

	public static void main(String[] args) {
		ClaConst cc1 = new  ClaConst();	//생성자 생성시 최초1회만 호출
		cc1.ppp();
		System.out.println("----------------");
		ClaConst cc2 = new  ClaConst(234);
		System.out.println("----------------");
		
		cc2.ppp();
		//cc2.ClaConst(456);  생성자 재호출 불가
		//cc2.new ClaConst(456);
		cc2.ClaConst();  //메소드 호출임 - 혼동하지 않도록 주의
		System.out.println("----------------");
		ClaConst cc3 = new  ClaConst(12,34,56);
	}

}
