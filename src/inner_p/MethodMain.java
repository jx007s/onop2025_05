package inner_p;
class ClaData{
	
}

class ClaMeth{
	void meth_1() {
		int a;		//지역변수
		ClaData b;	//지역변수(인스턴스변수)
		
		class AAA{	//지역클래스 정의
			
		}
		interface BBB{	//지역인터페이스 정의
			
		}
		
		/* 메소드내에서 메소드정의 불가
		void meth_2() {
			
		}*/
		//abstract void meth_3(); 추상메소드선언불가
		
	}
}

public class MethodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
