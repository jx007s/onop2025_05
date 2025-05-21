package basic;

public class VarScopeMain {

	public static void main(String[] args) {

		/*
		 //무한반복
		for( ; ; ) {
			System.out.println("for 문 실행");
		}*/
		
		int a = 5;
		
		System.out.println("a : "+a);
		
		for( ;a<10 ;a++ ) {  //외부변수를 반복변수로 사용
			System.out.println("for 문 실행 2 : "+a);
		}
		System.out.println("a : "+a);
		
		/* 반복변수와 외부변수 중첩선언 불가
		for(int a = 1 ;a<10 ;a++ ) {
			System.out.println("for 문 실행 3 : "+a);
		}*/
		
		//외부변수를 반복변수로 사용
		// 반복변수 초기값 대입
		for(a = 100 ;a<200 ; a+=20 ) {
			
			//int a = 1357;  반복변수와 내부변수 중첩불가
			System.out.println("for 문 실행 3 : "+a);
		}
		System.out.println("a : "+a);
		
		
		System.out.println("[[반복변수와 지역변수]]");
		
		for (int i = 0; i < 20; i+=2) {
			
			System.out.println("시작 : "+i);
			int j = 9;  //지역 내부변수는 for 구간 반복할때마다 선언
						//     구간이 끝나면 소멸됨
			            //반복변수는 for문이 종료될때에 소멸됨
			System.out.println("중간 : "+i+" , "+j);
			
			j++;
			
			System.out.println("끝 : "+i+" , "+j);
			
		}
		
		
		//System.out.println("종료 : " + i);
		System.out.println("종료 ");
		
		
		/*
		  클래스 이름 ExamMain
		 번호, 성명, 국어, 영어, 수학, 총점, 평균을 선언하고 출력하세요
		 번호, 성명, 국어, 영어, 수학 정보 입력후 처리
		 
		 2. 평균을 소숫점으로 처리
		 3. 평균을 소숫점 2자리까지 출력
		 
		  출력 형태
		  반 : 2
		  성명 : 홍길동
		  영어 : 88
		  수학 : 78
		  국어 : 67
		  총점 : ?
		  평균 : ?
		*/
	
	}

}
