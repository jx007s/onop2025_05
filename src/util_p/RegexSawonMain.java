package util_p;

import java.util.Calendar;
import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * ex)a20020122_lsh
a : 영업부, b : 인사부, c : 두부  d : 부부  (이외의 것은 에러처리)

20020122 (입사일 : 숫자이외의 것은 입력 불가)
lsh (이름 2-4 글자 입력 가능 영문소문자만 가능)
기념일이 토, 일요일 인경우 이전 금요일로 기념일을 옮길것
출력 : 부서명, 이름 약어, 입사일, 근속기념일
 * */

public class RegexSawonMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Calendar ddd = Calendar.getInstance();
		
		while(true){
			try {
				System.out.print("사번:");
				String ttt = sc.nextLine();
				//String ttt = "c20020528_las";
				//              0123456789012
				
				if(!Pattern.matches("[a-d]\\d{8}_[a-z]{2,4}", ttt)) {
					throw new Exception();
				}
				
				String buseo = "영업부,인사부,두부,부부".split(",")[ttt.charAt(0)-'a'];
				System.out.println("부서:"+buseo);
				System.out.println("이름:"+ttt.substring(10));
				
				ddd.set(Integer.parseInt(ttt.substring(1,5)), 
						Integer.parseInt(ttt.substring(5,7))-1,
						Integer.parseInt(ttt.substring(7,9)));
				
				System.out.print("입사일:");
				CalendarMain.calToPPP(ddd);
				
				ddd.add(Calendar.YEAR, 10);
				System.out.print("근속일:");
				CalendarMain.calToPPP(ddd);
				
				int wday = ddd.get(Calendar.DAY_OF_WEEK);
				
				int day_mm = 0;
				if(wday==7) {
					 day_mm=-1;
				}else if(wday==1) {
					day_mm=-2;
				}
				ddd.add(Calendar.DATE, day_mm);
				System.out.print("근속기념일:");
				CalendarMain.calToPPP(ddd);
				break;
			} catch (Exception e) {
				System.out.println("다시 입력해 주세요");
			}
		}
		System.out.println("프로그램 종료");

	}

}
