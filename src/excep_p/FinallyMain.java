package excep_p;

public class FinallyMain {

	public static void main(String[] args) {
		System.out.println("메인 스레드 시작");
		
		try {
			System.out.println(">>>try 시작");
			int a = 10/0;
			System.out.println(">>>try 끝");
		} catch (Exception e) {
			System.out.println("---catch 실행");
			return;		//메인쓰레드를 종료 함
		} finally {
			System.out.println("finally 실행"); //try~catch 이후 마지막에 실행
		}
		
		
		System.out.println("메인 스레드 끝");  //return 으로 인해 실행 안함

	}

}
