package basic;

/*
클래스 이름 ExamMain
번호, 성명, 국어, 영어, 수학, 총점, 평균을 선언하고 출력하세요
번호, 성명, 국어, 영어, 수학 정보 입력후 처리

2. 평균을 소숫점으로 처리
3. 평균을 소숫점 2자리까지 출력

*/

public class ExamMain {

	public static void main(String[] args) {
		final int ban = 2, kor=88,eng = 78,mat = 67;
		final String name = "정우성";
		final int tot = kor + eng + mat;
		//double tot2 = tot;
		final double avg = (double)tot / 3;

		System.out.println("반 : "+ban);
		System.out.println("성명 :"+name);
		System.out.println("영어 :"+kor);
		System.out.println("수학 :"+eng);
		System.out.println("국어 :"+mat);
		//System.out.println("총점 :"+(double)tot);
		System.out.println("총점 :"+tot);
		System.out.println("평균 :"+avg);
		
		double pos = 100;
		
		double avg100 = avg *pos;
		System.out.println("평균 :"+avg100);
		int avgInt = (int)avg100;
		System.out.println("평균 :"+avgInt);
		double avgDouble = (double)avgInt;
		System.out.println("평균 :"+avgDouble);
		double avg2 = avgDouble/pos;
		System.out.println("평균 :"+avg2);
		
		double avg3 = (double)(int)(avg *pos)/pos;
		System.out.println("평균3 :"+avg3);
		//	77.66666666666667
		//	7766.666666666667
		//	7766
		//	7766.0
		//	77.66

	}

}
