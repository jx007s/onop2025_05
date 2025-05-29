package oops_p;

class ParamAddr{
	void meth(AddrMem am) {
		System.out.println("\t meth am:"+am);
		am.pname="고윤정";
		am.age++;
		am.marriage=!am.marriage;
	}
}

class AddrMem{
	String pname;
	int age;
	boolean marriage;
	
	void ppp() {
		System.out.println(pname+","+age+","+marriage);
	}
}

public class ParamAddrMain {

	public static void main(String[] args) {
		ParamAddr pa = new ParamAddr();
		AddrMem qqq = new AddrMem();
		System.out.println("pa:"+pa);
		System.out.println("메인 qqq:"+qqq);
		qqq.pname = "중윤정";
		qqq.age = 34;
		qqq.marriage=true;
		qqq.ppp();
		pa.meth(qqq);
		System.out.println("메인 qqq:"+qqq);
		qqq.ppp();

	}

}
