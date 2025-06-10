package util_p;

import java.util.Calendar;

public class CalendarMain {

	public static void main(String[] args) {
		//Calendar today = new Calendar();
		Calendar today = Calendar.getInstance();
		System.out.println(today);
		//32400000
		System.out.println(32400000/1000/60/60);
		System.out.println(today.get(0));
		System.out.println(today.get(1));
		System.out.println(today.get(Calendar.YEAR));
		System.out.println( today.get(Calendar.MONTH)+1  );
		System.out.println( today.get(Calendar.DATE)  );
		System.out.println( today.get(Calendar.DAY_OF_MONTH)  );
		System.out.println( today.get(Calendar.DAY_OF_YEAR)  );
		System.out.println( today.get(Calendar.DAY_OF_WEEK)  );
		/*
		 		 일 월 화 수 목 금 토
		calendar 1  2  3 4 5  6 7
		date	 0  1  2 3 4  5 6 
		 * */
		System.out.println( today.get(Calendar.WEEK_OF_YEAR)  );
		System.out.println( today.get(Calendar.WEEK_OF_MONTH)  );
		
		System.out.println( today.get(Calendar.AM_PM)  ); // 0: 오전, 1:오후
		System.out.println( today.get(Calendar.HOUR)  );
		System.out.println( today.get(Calendar.HOUR_OF_DAY)  );
		System.out.println( today.get(Calendar.MINUTE)  );
		System.out.println( today.get(Calendar.SECOND)  );
		System.out.println( today.get(Calendar.MILLISECOND)  );
		
	//// 출력 방식 2025 년 6 월 10일 (화요일) 15:17:56.789
		calToPPP(today);
	}
	
	static void calToPPP(Calendar cc) {
		String ttt = cc.get(Calendar.YEAR)+"년 ";
		ttt += cc.get(Calendar.MONTH)+1+"월 ";
		ttt += cc.get(Calendar.DATE)+"일 (";
		ttt += " 일월화수목금토".charAt(cc.get(Calendar.DAY_OF_WEEK))+"요일) ";
		ttt += cc.get(Calendar.HOUR_OF_DAY)+":";
		ttt += cc.get(Calendar.MINUTE)+":";
		ttt += cc.get(Calendar.SECOND)+".";
		ttt += cc.get(Calendar.MILLISECOND);
		
		System.out.println(ttt);
	}
	

}
