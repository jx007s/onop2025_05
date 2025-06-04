package excep_p;

class ClaDec{
	
	void meth_1() {
		System.out.println("meth_1() 시작---");
		try {
			meth_2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("m1 catch : "+e.getMessage());
		}
		System.out.println("meth_1() 끝---");
	}
	
	void meth_2() throws Exception {
		System.out.println("\t meth_2() 시작---");
		try {
			meth_3();  //예외처리 위임 메소드는 try~catch 혹은 재위임으로 처리
		} catch (Exception e) {
			
			//e.printStackTrace();
			System.out.println("\t m2 catch : "+e.getMessage());
			
			//re~throwing : 예외 다시 던지기
			throw e;  //  throws Exception 필요
		}
		System.out.println("\t meth_2() 끝---");
	}
	
	//예외처리 위임 :  throws 예외처리클래스1,예외처리클래스2...
	//이 메소드를 호출하는 구간에서 예외처리해야함
	void meth_3() throws Exception {
		System.out.println("\t\t meth_3() 시작---");
		
		throw new Exception("meth3에서 예외발생");
		
		//System.out.println("\t\t meth_3() 끝---");
	}
}

public class DecMain {

	public static void main(String[] args) {
		ClaDec cd = new ClaDec();
		cd.meth_1();
	}

}
