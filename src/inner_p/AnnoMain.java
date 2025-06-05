package inner_p;

class AnnoOut{
	String a = "out_a";
	private String b = "out_private_b";
	
	void meth_1() {
		System.out.println("out_meth_1() 실행");
	}
	private void meth_2() {
		System.out.println("out_private_meth_2() 실행");
	}
}

public class AnnoMain {

	public static void main(String[] args) {
		AnnoOut ao1 = new AnnoOut();
		
						//4. anonymous inner class :: 클래스정의명이 없음
		AnnoOut ao2 = new AnnoOut() {
			String a = "재정의_a";
			private String b = "재정의_private_b";
			
			void meth_1() {
				System.out.println("생성시재정의_meth_1() 시작---");
				System.out.println(a+","+b);
				//System.out.println(AnnoOut.this.a+","+AnnoOut.this.b);
				//private 접근 불가
				//System.out.println(super.a+","+super.b);
				System.out.println(super.a);
				meth_2();
				meth_3();
				super.meth_1();
				//private 접근 불가
				//super.meth_2();
				System.out.println("생성시재정의_meth_1() 끝---");
			}
			void meth_2() {
				System.out.println("생성시재정의_meth_2() 실행");
			}
			void meth_3() {
				System.out.println("생성시재정의_meth_3() 실행");
			}
		};
		
		System.out.println("ao1:"+ao1.a);
		System.out.println("ao2:"+ao2.a);
		ao1.meth_1();
		//ao1.meth_2();
		
		ao2.meth_1();
		//ao2.meth_2();
		//ao2.meth_3();

	}

}
