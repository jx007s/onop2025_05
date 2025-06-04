package excep_p;

//import java.lang.ArithmeticException;  생략가능

public class ExcepMain {

	public static void main(String[] args) {
		
		try {
			
			System.out.println("try 시작");  	// ---------	1
			
			int a = 10/0;  //에러발생 지점 --> catch 로 진입  -- 	2
							//예외발생 안함                 ---	2
			
			System.out.println("try 끝 : "+a); // try 정상 종료 --	3 
			
		}catch(ArithmeticException e) {   // catch 진입-------	3  
			
			System.out.println("catch 구간 : "+e.getMessage());
		}
		
		System.out.println("시스템 종료");  // ----------------	4
	}

}
