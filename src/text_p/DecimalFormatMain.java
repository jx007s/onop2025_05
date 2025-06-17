package text_p;

import java.text.DecimalFormat;


public class DecimalFormatMain {

	public static void main(String[] args) throws Exception {
		double dd = Double.parseDouble("78123.456");
		
		System.out.println(dd);
		
		//dd = Double.parseDouble("78,123.456");
		
		DecimalFormat df = new DecimalFormat();
		dd = (double)df.parse("78,123.456");
		System.out.println(dd);
		
		df = new DecimalFormat("#,##0.00");
		dd = (double)df.parse("78,123.4567");
		System.out.println(dd);
		String tt = df.format(9741.258);
		System.out.println(tt);
		
		double [] ddArr = {
				123456,-123456,
				123.45678, -123.45678,
				.9876,-.9876,
				.4321,-.4321,0
		};
		
		String [] ppArr = {
				"0" , "#", "00000", "#####",
				"####0000",//"#0#0#0#0",//"0000####"
				".00",".##",".000000",".######",
				"#,##","0,00", "#,##0.00",
				"#@##","#?##","0@00",
				"#,##0원","#,##0$","원#,##0","$#,##0",
				"-#,##0", "#,##0-", // - 음수표시와 관계없음
				"0%", "0.00%", "#,##0.00%",
				"양수#,##0.00;음수000000000",
				// 양수 ; 음수  --> 숫자패턴은 양수의 것으로 음수도 사용
				//                숫자패턴 이전의 글자를 구분으로 사용
				//양수#,##0.00;음수000000000 
				//        ↓↓
				//양수#,##0.00;음수#,##0.00
				"▲0.00;▼"
		};
		
		for (String pp : ppArr) {
			System.out.println(pp+" >>>");
			df = new DecimalFormat(pp);
			
			for (double d : ddArr) {
				System.out.println("   "+d+" : "+df.format(d));
			}
		}
		/*
		 0  : 자리수 표현, 값이 없으면 0으로 처리 
		 #  : 자리수 표현, 값이 없으면 생략
		 . : 소숫점 자리
		 , : 천단위 구분기호
		 @, ? : 정수끝자리 
		 
		 
		  {67,78,89,98,76,54,78,77,90,56};
 
	    ////점수가 70점 이상이면 ▲, 미만이면 ▼ 로 표시해 주세요
	 
	    ///if, switch, 3항연산자등 조건문 사용하지 말것
		 
		 * */
		
		
	}

}
