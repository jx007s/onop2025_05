package excep_p;

import java.util.Scanner;


class ReThrowsLogin{
	final Scanner sc = new Scanner(System.in);
	final String pid, ppw, pname;
	
	ReThrowsLogin(String pid, String ppw, String pname) {
		
		this.pid = pid;
		this.ppw = ppw;
		this.pname = pname;
	}




	void login() throws Exception{
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
		System.out.println(pname+"님 안녕하세요");
    }
}
 


// 예외처리만 있음 - 입력 및 검사 파트가 없음
public class DecOneMain {

	public static void main(String[] args) {

		ReThrowsLogin rt = new ReThrowsLogin("zxcv","5678","장남건");
	
		while(true) {
			try {
				
				rt.login();
				
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		

	}

}










