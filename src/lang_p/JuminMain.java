package lang_p;

public class JuminMain {

	public static void main(String[] args) {
		String jumin = "960320-8234567";
		// 				01234567890123
		
		int pos = jumin.charAt(7)-'0';
		System.out.println(pos);
		System.out.println("성별 : "+"여남".charAt(pos%2)+"자");
		System.out.println("국적 : "+"내외".charAt(pos/5)+"국인");
		
		//1996년03월20일
//		String birth = jumin.substring(0,2)+"년";
//		birth += jumin.substring(2,4)+"월";
//		birth += jumin.substring(4,6)+"일";
		
		/*
		-1	%4	/2	+19
19	1	0	0	0	19
19	2	1	1	0
20	3	2	2	1	20
20	4	3	3	1
-----------------------------------------
19	5	4	0
19	6	5	1
20	7	6	2
20	8	7	3

		 * */
		
		String birth = (pos-1)	%4	/2	+19+"";
		String title = "년월일";
		for (int i = 0; i < title.length(); i++) {
			birth += jumin.substring(i*2,i*2+2)+title.charAt(i);
		}
		
		System.out.println(birth);

	}

}


/*
///사원번호 -- 20020320a2lsh
///ex) 입사일 :20020320, a - 부서명, 2-직급, lsh - 이름

///부서명 : a 인사, b 총무, c 두부, d 부부
///직급 : 0 사장, 1 부장, 2 과장, 3 대리, 4 사원

사원증을 출력하세요
입사일, 부서명, 직급, 이름
 * */


