package excep_p;

import java.util.Scanner;


class ReThrowsLogin{

	//로그인 처리 만 있음 - try~catch 가 없다.
	void login(){
 
 
    }
}
 


// 예외처리만 있음 - 입력 및 검사 파트가 없음
public class DecOneMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String pid = "qwer", ppw = "1234";
	
		while(true) {
			try {
				
				System.out.print("id : ");
				String uid = sc.nextLine();
				if(!uid.equals(pid)) {
					throw new Exception("ID가 존재하지 않습니다.");					
				}

				System.out.print("pw : ");
				String upw = sc.nextLine();
				if(!upw.equals(ppw)) {
					throw new Exception("암호가 일치하지 않습니다.");
				}
				
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("장동건님 안녕하세요");

	}

}










