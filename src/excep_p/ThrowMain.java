package excep_p;

public class ThrowMain {

	public static void main(String[] args) {

		try {
			System.out.println("try 시작");
			
			// 예외처리 인스턴스 생성
			// detailMessage = "에러양" 생성자에서 대입
			Exception my = new Exception("에러양");
			
			throw my;	//예외처리 던지기
			
			//System.out.println("try 끝");  throw 이후 실행구문 불가
		} catch (Exception e) {
			System.out.println("catch : "+e.getMessage());
		}

	}

}
