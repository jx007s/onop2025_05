package inner_p;

class LocalOuter{
	private String a = "out_a";
	
	void meth_1() {
		System.out.println("out_meth_1() 실행");
	}
	
	private void meth_2() {
		System.out.println("out_private_meth_2() 실행");
	}
	
	//지역 중첩클래스를 메소드 외부에서 선언 생성할 수 없다
	//Loc llo2;
	
	void mm() {
		System.out.println("out_mm() 시작 -----------");
		
		//정의부 다음에 선언 생성가능함
		//Loc llo3;
		
		//3. local inner 클래스 정의
		class Loc{
			String c = "loc_c";
			private String d = "loc_private_d";
			
			void meth_3() {
				System.out.println("loc_meth_3() 실행");
			}
			
			private void meth_4() {
				System.out.println("loc_private_meth_4() 실행");
			}
			
			void meth_tt() {
				System.out.println("\t loc_meth_tt() 시작 -----------");
				System.out.println("\t "+a);
				meth_1();
				meth_2();
				System.out.println("\t loc_meth_tt() 끝 -----------");
			}
		}
		
		Loc llo4 = new Loc();
		
		System.out.println(llo4.c);
		System.out.println(llo4.d);
		
		llo4.meth_3();
		llo4.meth_4();
		llo4.meth_tt();
		System.out.println("out_mm() 끝 ------------");
	}
}

public class LocalMain {

	public static void main(String[] args) {
		LocalOuter lo = new LocalOuter();
		lo.mm();
		
		//지역 중첩클래스를 외부에서 선언 생성할 수 없다
		//LocalOuter.Loc llo;

	}

}
