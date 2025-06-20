package util_p;

import java.util.regex.Pattern;

public class RegexMain {

	public static void main(String[] args) {
		System.out.println("정우성".startsWith("정"));
		System.out.println("이효리".contains("효"));
			
						//                패턴, 검사할문자열
		System.out.println(Pattern.matches("정", "정우성"));
		System.out.println(Pattern.matches("정.*", "정우성"));
		
		 String [] mmArr= {"장동건","건","장서건","장혁","장남건","장3","장빈건","*","***","*******",
	                "장","장군","최장군","박장군","장군님","장장장장장장장","장장","고추장",
	                "미란다커","키커","쌍피","계피","원두커피장군",
	                "장장장","김앤장이다","현빈","원빈","미스터빈","커피빈","커피","원두커피","장희빈",
	                "ㄱㄴㄷ","ㄱㄹㄴ","ㅐㅓㅣㅔㅐ","ㅐㅔㅓㅐㅑㅓ","ㄱㅓㅔㅔㅔㄹㄴ",
	                "하하하","하호허","팉툍하","하학","하햐","가긱공국","짱쩡맨","쑥ㄴ밬","샹쏑쑗",
	                "다","공석호","김희애",
	                "나야비","나비야","농ㅂ왕창","장ㄴ비용솽",
	                "너탈비털아붕니","너비아니","헤르너비아샹쵕",
	                "123-456","1234-5678",
	                "1234-5678-9012","123-5678-9012","12-5678-9012","12-568-9012",
	                "123-678-9012","123-567833-9012","12-58-9012","1a",
	                "abc","abc_def","1234","9846","ab_1234","ab1234",
	                "aaa@aaa.aaa","aaaaaa.aaa@","aaa12aaa_aaa@",
	                "ab56","AABB","aBCd","1","3","1234abc@aaa.aaa",
	                "1234abc@aaa.a","1a2b","a12",
	                "^","^^","12^34abc@aaa.aaa","1a2b^","^a12","123456.^",
	                "\\^","^\\^",".^","\\^^",
	                "1234abc@aaa.aa.va","1234abc@a.aa.a.a.va"};
		 //.  모든한글자
		 //*  앞의 글자와 같음(길이무관)
		 // ".*빈|건"   : 빈으로 끝나는 모든글자 혹은 건
		 // ()  : 묶어서 한개 
		 // (빈|건) : 빈 혹은 건
		 //[빈건] :  빈 혹은 건(대괄호안에 있는 글자를 한개씩나누어 or 연산)
		 //[0-9] : 0123456789 를 or 연산
		 // \\d : 숫자
		 // \\D : 숫자제외 : [^0-9]와 같음
		 // \\w : [0-9a-zA-Z_] 와 같음
		 // 장{3} : 장장장
		 // {3,} : 3글자이상
		// {3,7} : 3~7글자
		// [^0-9] : ^ 는 이후 내용을 제외
		 
		 String [] ppArr = {"장","장군","장.",".빈","..빈",".장.",
				 "장*","장.*",".*빈",".*장.*",
				 ".*빈건",".*(빈건)",".*빈|건",".*(빈|건)", ".*[빈건]",
				 ".*(커피|장군)",".*[커피장군]",
				 "[0-9]*","[a-z]*","[A-Z]*","[0-9a-zA-Z]*","[0-9a-zA-Z._-]*",
				 "\\d","\\d*","\\D*","\\w*",
				 "[0-9a-zA-Z]*@[0-9a-zA-Z.]*",
				 ".{4}","장{3}",".{3,}",".{3,7}",
				 "\\d{3}-[0-9]{3,4}-[0-9]{4}",
				 "[^0-9]*","[0-9^]*","^*","\\^*",
				 "[^^]*",//"[^]*",
				 "\\**","[*]", //"**"
				 "[ㄱ-ㅎ]*","[ㅏ-ㅣ]*","[가-힣]*","[가-힣ㄱ-ㅎㅏ-ㅣ]*",
				 ".*[가-깋ㄱ].*",".*[나-닣ㄴ][바-빟ㅎ][아-잏ㅇ].*",
				 //ㄴㅂㅇ  포함하는 글자
				 // ㅊ원ㅅ  ==> .*ㅊ원ㅅ.*
				 //           .*[차-칳]원[사-싷].*
				 
		 };
		 
		 for (String pp : ppArr) {
			System.out.print(pp+" : ");
			
			for (String mm : mmArr) {
				if(Pattern.matches(pp, mm)) {
					System.out.print(mm+",");
				}
				
			}
			
			System.out.println();
		}

	}

}




/*
사번을 입력하고 근속 10주년 기념일을 출력하세요

 

ex)a20020122_lsh
   

a : 영업부, b : 인사부, c : 두부  d : 부부  (이외의 것은 에러처리)

20020122 (입사일 : 숫자이외의 것은 입력 불가)
lsh (이름 2-4 글자 입력 가능 영문소문자만 가능)

기념일이 토, 일요일 인경우 이전 금요일로 기념일을 옮길것

출력 : 부서명, 이름 약어, 입사일, 근속기념일
 * */


