package extends_p;

class DyPar{
	String a = "부모a", b ="부모b";
	void meth_1() {
		System.out.println("부모 meth_1() : "+a+","+b);
	}
	void meth_2() {
		System.out.println("부모 meth_2() : "+a+","+b);
	}
}
class DyChild extends DyPar{
	String a = "자식a", c ="자식c";
	void meth_1() {
		System.out.println("자식 meth_1() : "+a+","+b+","+c);
	}
	void meth_3() {
		System.out.println("자식 meth_3() : "+a+","+b+","+c);
	}
}

public class DynamicMain {

	public static void main(String[] args) {
		DyPar pp = new DyPar();
		DyPar pc = new DyChild();
		//DyChild cp = new DyPar();
		DyChild cc = new DyChild();
		
		System.out.println("pp:"+pp.a+","+pp.b);
		//System.out.println("pp:"+pp.a+","+pp.b+","+pp.c);
		pp.meth_1();
		pp.meth_2();
		System.out.println("pc:"+pc.a+","+pc.b);
		//System.out.println("pc:"+pc.a+","+pc.b+","+pc.c);
		pc.meth_1();
		pc.meth_2();
		//pc.meth_3();
		
		cc.a = "자식a2";
		cc.b = "부모b2";
		cc.c = "자식c2";
		System.out.println("cc:"+cc.a+","+cc.b+","+cc.c);
		cc.meth_1();
		cc.meth_2();
		cc.meth_3();
		
		DyPar pcc = cc;
		//System.out.println("pcc:"+pcc.a+","+pcc.b+","+pcc.c);
		System.out.println("pcc:"+pcc.a+","+pcc.b);
		pcc.meth_1();
		pcc.meth_2();
		//pcc.meth_3();
		
		DyChild cpcc = (DyChild)pcc;
		System.out.println("cpcc:"+cpcc.a+","+cpcc.b+","+cpcc.c);
		cpcc.meth_1();
		cpcc.meth_2();
		cpcc.meth_3();
		
		//DyChild cpp = (DyChild)pp;
		System.out.println(pcc instanceof DyChild);
		System.out.println(pcc instanceof DyPar);
		System.out.println(pp instanceof DyChild);
		System.out.println(pp instanceof DyPar);
	}

}
