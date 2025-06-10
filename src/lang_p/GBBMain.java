package lang_p;

import java.util.Scanner;

public class GBBMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String [] arr = "가위,바위,보".split(",");
		String [][] res = {				//user
					{"비김","패","승"},	//0:가위
					{"승","비김","패"},	//1:바위
					{"패","승","비김"}	//2:보
			//com	0:가위, 1:바위, 2:보
		};
		
		// 선생님 봐줘요--> 이해 안감
		
		while(true) {
			System.out.println("0:종료, 1:가위, 2:바위, 3:보");
			System.out.print("입력 : ");
			
			int user = sc.nextInt();
			if(user==0) {
				break;
			}
			user--;
			
			int com = (int)(Math.random()*3);

			System.out.println("게이머:"+arr[user]);
			System.out.println("컴퓨터:"+arr[com]);
			System.out.println(res[user][com]);
		}
		
		System.out.println("게임종료");

	}

}
