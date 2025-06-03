package pac2;
/*
				클래스 내부	 같은패키지	 다른패키지 자손클래스	 	전체
public 	 			O	 		O				O	 			O
protected	 		O	 		O	 			O	 
default(생략)	 	O	 		O	 	 
private 	 		O	

*/
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
