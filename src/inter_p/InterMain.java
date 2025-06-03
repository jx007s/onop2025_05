package inter_p;

interface In_1{
	/* 생성자 없음
	In_1(){
		
	}*/
	//public static String a = "In_1_a"; 와 같음
	String a = "In_1_a";
	public static String b = "In_1_b";
	//interface는 public 만 가능 : 생략시 public
	//protected String c = "In_1_c";
	//default String d = "In_1_d";
	//private String e = "In_1_e"; 
	
	//abstract public void meth_1(); 과 같음
	void meth_1();
	
	//메소드 정의부 명시 불가
	//void meth_2() {}
	
	//interface는 public 만 가능 : 생략시 public
	//private void meth_3();
	//protected void meth_4();
	//default void meth_5();
	public void meth_6();
	
	//final 불가
	//final void meth_7();
	//abstract 가 기본값
	abstract void meth_8();
}

//class Cla_1 extends In_1{
class Cla_1 implements In_1{

	@Override
	public void meth_1() {
		System.out.println("Cla_1 meth_1()");
	}

	@Override
	public void meth_6() {
		System.out.println("Cla_1 meth_6()");
	}

	@Override
	public void meth_8() {
		System.out.println("Cla_1 meth_8()");
	}
	
}

public class InterMain {

	public static void main(String[] args) {
		In_1 i1 = new In_1() {
			
			//public 필수
			@Override
			public void meth_1() {
				System.out.println("생성시 재정의  meth_1()");
			}
			@Override
			public void meth_6() {
				System.out.println("생성시 재정의  meth_6()");
			}
			@Override
			public void meth_8() {
				System.out.println("생성시 재정의  meth_8()");
			}
		};
		System.out.println("i1 : "+i1.a+" , "+i1.b);
		//i1.a = "변신"; 상수 이므로 대입불가
		i1.meth_1();
		i1.meth_6();
		i1.meth_8();
		
		Cla_1 c1 = new Cla_1();
		System.out.println("c1 : "+c1.a+" , "+c1.b);
		//c1.a = "변신"; //상수 이므로 대입불가
		c1.meth_1();
		c1.meth_6();
		c1.meth_8();
	}

}
