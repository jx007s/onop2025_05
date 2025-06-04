package excep_p;

public class MulExcepMain {

	public static void main(String[] args) {

		try {
			System.out.println("try 시작");			
			int a = 10/2;
			
			System.out.println("a : "+a);
			
			int [] arr = {11,22,33};
			
			System.out.println("arr : "+arr[5]);
			
			String ttt = "아기상어";
			
			System.out.println("ttt : "+ttt.charAt(6));
						
			System.out.println("try 끝 ");
			
//		} catch (Exception e) { 부모 예외처리부분은 자식보다 밑에 기재되어야 한다.			
//			System.out.println("Exception 예외처리 : "+e.getMessage());
			//   ArithmeticException  > RuntimeException  > Exception
			
		} catch (ArithmeticException e) {
			
			System.out.println("ArithmeticException 예외처리 : "+e.getMessage());
		
		//} catch (ArrayIndexOutOfBoundsException e) {
		} catch (Exception e) {
			
			System.out.println("Exception 예외처리 : "+e.getMessage());
		}
		
		System.out.println("시스템 종료");

	}

}
