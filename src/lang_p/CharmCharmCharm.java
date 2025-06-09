package lang_p;

import java.util.Scanner;

public class CharmCharmCharm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("추억의 게임 참참참");
		String [] arr = " ,왼쪽,가운데,오른쪽".split(",");
		while(true) {
			System.out.println("0:종료, 1:왼쪽, 2:가운데, 3:오른쪽");
			System.out.print("입력 : ");
			
			int user = sc.nextInt();
			if(user==0) {
				break;
			}
			
			int com = (int)(Math.random()*3)+1;
			String res = "패";
			if(user==com) {
				res = "승";
			}
			System.out.println("게이머:"+arr[user]);
			System.out.println("컴퓨터:"+arr[com]);
			System.out.println(res);
		}
		
		System.out.println("게임종료");
		
		//가위 바위 보 게임을 만드세요

	}

}
