package lang_p;

import java.util.Scanner;

public class MJBMain {
	Scanner sc = new Scanner(System.in);
	String [][] title = {
			"바위,가위,보".split(","),
			"묵,찌,빠".split(",")
	};
	String [][] res = {				//user
			
				{"비김","공격","수비"},	//0:바위
				{"수비","비김","공격"},	//1:가위
				{"공격","수비","비김"}	//2:보
		//com	0:바위, 1:가위, 2:보
			
		
	};
	
	//nowNo : 가위바위보 인지 묵찌바 인지 설정
	int nowNo = 0, user, com ;
	String winLose = "";
	boolean  endChk = false;
	
	void pan() {
		
		String ttt = "0:종료";
		for (int i = 0; i < title[nowNo].length; i++) {
			ttt += ","+(i+1)+":"+title[nowNo][i];
		}
		System.out.println(ttt);
		System.out.print("입력 : ");
		
		user = sc.nextInt();
		if(user==0) {
			endChk=true;
			return;
		}
		user--;
		
		com = (int)(Math.random()*3);

		System.out.println("게이머:"+title[nowNo][user]);
		System.out.println("컴퓨터:"+title[nowNo][com]);
		
	}
	
	void resChk() {
		if(nowNo == 0) {
			System.out.println(res[user][com]);
			if(!res[user][com].equals("비김")) {
				winLose=res[user][com];
				nowNo = 1;	//묵찌빠로 변경	
			}
		}
		//가위바위보 끝내고 묵찌빠로 넘어가기
		
		else {
			//묵찌빠는 비기면 끝
			if(res[user][com].equals("비김")) {
				if(winLose.equals("공격")) {
					System.out.println("승");
				}else {
					System.out.println("패");
				}
				endChk = true;	
			}else {
				System.out.println(res[user][com]);
				winLose=res[user][com];
			}
		}
		
	}
	
	MJBMain(){
		
		System.out.println(String.join("", title[1])+" 시작");
		while(true) {
			pan(); //패를 선택하는 메소드
			if(endChk) {
				break;
			}
			resChk();//패 선택에 따른 결과 처리 메소드
			if(endChk) {
				break;
			}
			
		}
		System.out.println(String.join("", title[1])+" 종료");
	}

	public static void main(String[] args) {
		
		new MJBMain();

	}

}
