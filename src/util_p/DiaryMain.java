package util_p;

import java.util.Date;

public class DiaryMain {

	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today);
		/*
		 이번달의 마지막 날
		 지금이 토요일
		 1일의 요일번호
		 * */

		today.setMonth(today.getMonth()+1); //1달 추가
		today.setDate(0);  //lastDay 기준 이전달 마지막 날
		int last = today.getDate();
		
		
		today.setDate(1);
		int first = today.getDay();		//첫째날 요일 가져오기
		for (int i = 0; i <first; i++) {	//첫째날 요일 앞에 빈칸 출력
			System.out.print("\t");
		}
		
		
		for (int i = 1; i <=last; i++) {
			today.setDate(i);
			//System.out.println(today);
			System.out.print(i+"\t");
			
			if(today.getDay()==6) {  //토요일이면 줄바꾸기
				System.out.println();
			}
		}

	}

}
