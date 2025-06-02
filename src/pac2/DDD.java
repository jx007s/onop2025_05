package pac2;

public class DDD {
	public String a = "p2_DDD_public_a";
	protected String b = "p2_DDD_protected_b";
	String c = "p2_DDD_c";
	private String d = "p2_DDD_private_d";
	
	public void meth_1() {
		System.out.println("p2_DDD_public_meth_1() 실행");
	}
	 protected void meth_2() {
		System.out.println("p2_DDD_protected_meth_2() 실행");
	}
	void meth_3() {
		System.out.println("p2_DDD_meth_3() 실행");
	}
	private void meth_4() {
		System.out.println("p2_DDD_private_meth_4() 실행");
	}
	
}

class EEE{
	public String a = "p2_EEE_public_a";
	public void meth_1() {
		System.out.println("p2_EEE_public_meth_1() 실행");
	}
}
