package excep_p;

import java.util.Scanner;

public class ThrowExamMain {

	public static void main(String[] args) {
		
		
		String aaa = "qwer";
		//  aaa == "qwer" 대신 aaa.equals("qwer")
		System.out.println(  !aaa.equals("qwer")  );

		Scanner sc = new Scanner(System.in);
		int jum = 0;
		while(true) {
			try {
				System.out.print("점수입력 : ");
				
				jum = sc.nextInt();
				if(jum<0 || jum >100) {
					throw new Exception("범위에러");
				}
				break;	//while 탈출
			} catch (Exception e) {
				
				System.out.println("에러발생 : "+e.getMessage());
				if(e.getMessage()!="범위에러") {
					sc.next(); //문자열 입력시 enter 소진
				}
				
			}
		}
		
		System.out.println("프로그램 종료");

	}

}

/*
id : asdf, pw : 1234 , 로그인 성공시 : 장동건님 안녕하세요
 
 
5명의 정보로 로그인을 구현하세요

로그인 성공시 이름으로 출력하세요
aa, 1111, 이효리
bb, 2222, 삼효리
cc, 3333, 사효리
dd, 4444, 오효리
ee, 5555, 육효리
 * */


