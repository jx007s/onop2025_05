package inter_p;
interface In_2{
	String a = "In_2_a";
	String b = "In_2_b";
	
	void meth_1();
	void meth_2();
}

interface In_3{
	String a = "In_3_a";
	String c = "In_3_c";
	
	void meth_1();
	void meth_3();
}

interface In_4{
	String d = "In_4_d";
	String c = "In_4_c";
	
	void meth_4();
	void meth_3();
}

//인터페이스 다중 상속 가능
interface InChild extends In_3,In_4{
	String e = "InChild_e";
	
	void meth_5();
}

class Par{
	public void meth_2() {
		System.out.println("Par meth_2()");
	}
	
	public void meth_5() {
		System.out.println("Par meth_5()");
	}
}



//다중 인터페이스 구현
//상속과 구현 동시 가능
// In_2, In_3, In_4, InChild
class ClaM extends Par implements In_2, InChild{

	@Override
	public void meth_1() {
		System.out.println("ClaM meth_1()");
	}

	@Override
	public void meth_3() {
		System.out.println("ClaM meth_3()");
	}
	
	@Override
	public void meth_4() {
		System.out.println("ClaM meth_4()");
	}
	
	
	
}
public class MInterMain {

	public static void main(String[] args) {
		ClaM cm = new ClaM();
		System.out.println("cm : "+cm.b);
		//System.out.println("cm : "+cm.a);  a 가 중첩되어 에러발생
		cm.meth_1();
		cm.meth_2();
		cm.meth_3();
		
		In_2 i2 = cm;
		System.out.println("i2 : "+i2.a+","+i2.b);
		//System.out.println("i2 : "+i2.c);  In_3의 멤버필드 
		i2.meth_1();
		i2.meth_2();
		//i2.meth_3();
		
		In_3 i3 = cm;
		System.out.println("i3 : "+i3.a+","+i3.c);
		//System.out.println("i3 : "+i3.b);  //In_2의 멤버필드 
		i3.meth_1();
		//i3.meth_2();
		i3.meth_3();
		
		In_4 i4 = cm;
		System.out.println("i4 : "+i4.c+","+i4.d);
		i4.meth_3();
		i4.meth_4();
		
		InChild ic = cm;
		System.out.println("ic : "+ic.d+","+ic.e);
		ic.meth_3();
		ic.meth_4();
		ic.meth_5();
		
	}

}
