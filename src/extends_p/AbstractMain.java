package extends_p;

//추상클래스로 정의 - 추상메소드가 1개이상 선언된 경우 추상클래스로 정의해야 한다.
abstract class AbsPar{
	int a = 10;
	void meth_1() {
		System.out.println("부모 meth_1()");
	}
	void meth_2() {}
	//void meth_3();
	
	abstract void meth_4(); //추상메소드 선언 - 자식클래스에서 재정의
	
	//static, final, 멤버변수 모두 abstract 불가
	//abstract static void meth_s1();
	//abstract final void meth_5();
	//abstract int c = 20;
	// 추상메소드 에 정의부를 명시할 수 없다
	//abstract void meth_6() {}

}

//부모가 추상클래스인 경우 추상메소드를 반드시 재정의해야 한다.
class AbsChild extends AbsPar{

	@Override
	void meth_4() {
		System.out.println("자식에서 재정의 meth_4()");
	}

}


public class AbstractMain {

	public static void main(String[] args) {
		AbsChild cc = new AbsChild();
		System.out.println(cc.a);
		cc.meth_1();
		cc.meth_2();
		cc.meth_4();
		
		AbsPar pc = new AbsChild();
		//AbsPar pp1 = new AbsPar();  추상메소드가 재정의 되지 않아 에러
		
		//인스턴스 생성시 추상메소드 재정의
		AbsPar pp2 = new AbsPar() {
			//hiding
			int a = 1234;
			
			@Override
			void meth_4() {
				//a : 1234
				System.out.println("생성시 재정의 meth_4():"+a);
			}
			
			//일반메소드 재정의
			void meth_2() {
				System.out.println("생성시 재정의 meth_2() 시작----");
				meth_5();
				System.out.println("생성시 재정의 meth_2() 끝----");
			}
			
			void meth_5() {
				System.out.println("생성시 정의 meth_5()");
			}
		}; 
		System.out.println(pp2.a);
		pp2.meth_1();
		pp2.meth_2();
		pp2.meth_4();
		//pp2.meth_5();
	}

}

/// 부모 - 플레이어를 만드세요
//플레이어에 반드시 있어야 하는 기능: 재생, 일시정지, 종료

/// 자식 - MP3, 게임기, TV
/// 부가적 기능은 알아서 넣으세요


