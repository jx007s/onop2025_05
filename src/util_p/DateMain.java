package util_p;

import java.util.Date;

public class DateMain {

	public static void main(String[] args) {
		System.out.println("날짜생성 >>>");
		Date today = new Date();
		Date dd1 = new Date(2020,3,20);
		Date dd2 = new Date(2020-1900,3-1,20);
		
		System.out.println(today);
		System.out.println(dd1);
		System.out.println(dd2);
		System.out.println(new Date(2020-1900,3-1,20, 14,23));
		System.out.println(new Date(2020-1900,3-1,20, 14,23, 38));
		System.out.println(new Date(2020-1900,45-1,180, 214,523, 3812));
		//Date dd3 = new Date("2025-06-10 11:30:23"); 에러발생
		Date dd4 = new Date("Mar 20 12:13:14 2024");
		System.out.println(dd4);
		//문자열인 경우 자동환산 못함
		//System.out.println(new Date("Mar 200 120:513:714 2024"));
		Date dd5 = new Date(0); // 1970-1-1 0:0:0 UTC 기준
								// 1/1000 씩 1증가
		System.out.println(dd5);
		System.out.println(new Date(1*1000));
		
		
		
		System.out.println("get >>>");
		System.out.println(today.getYear()+1900);
		System.out.println(today.getMonth()+1);
		System.out.println(today.getDate());
		System.out.println(today.getDay());
		/*
		 일 월 화 수 목 금 토
		 0  1 2  3 4  5 6
		 * */
		
		System.out.println(today.getTimezoneOffset());
		System.out.println(today.getHours());
		System.out.println(today.getMinutes());
		System.out.println(today.getSeconds());
		System.out.println(today.getTime());  // 1749523509709
		System.out.println(1749523509709L/1000/60/60/24/365+1970);
		
		
		System.out.println("set >>>");
		today.setYear(1988-1900);
		System.out.println(today);
		today.setMonth(3-1);
		System.out.println(today);
		today.setDate(100);
		System.out.println(today);
		//today.setDay(1); 요일은 없음
		today.setHours(-123);
		System.out.println(today);
		today.setMinutes(30);
		System.out.println(today);
		today.setSeconds(31);
		System.out.println(today);
		today.setTime(0);
		System.out.println(today);
		System.out.println(dd2);
		System.out.println(today);
		System.out.println(today.before(dd2));
		System.out.println(today.after(dd2));
	}

}
