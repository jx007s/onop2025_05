package extends_p;

class OverStud{
	
	String kind,pname;
	int [] jum;
	int tot, avg;
	
	// 부모클래스가 사용자 정의 생성자 이면
	// 자식클래스에서 부모생성자호출을 반드시 명시해야 한다.
	OverStud(String pname, int kor, int eng, int mat) {
		kind = "일반";
		this.pname = pname;
		jum = new int[] {kor, eng, mat};
	}
	
	void totCalc() {
		tot = 0;
		for (int i : jum) {
			tot += i;
		}
	}
	
	void avgCalc() {
		System.out.println("일반 avgCalc() 실행");
		avg = tot/jum.length;
	}
	
	void ppp() {
		totCalc();
		avgCalc();  //상속관계 오버라이딩인 경우 오버라이딩 된 메소드로 호출
		System.out.println(kind+"\t"+pname+"\t"+tot+"\t"+avg);
	}
}

class OverArt extends OverStud{
	OverArt(String pname, int kor, int eng, int mat) {
		
		super(pname, kor, eng, mat); //부모생성자 -> 
				//사용자정의생성자인경우 반드시 부모생성자를 명시해야 한다.
		kind = "예체능";
	}
	
	//overriding
	void avgCalc() {
		System.out.println("예체능 avgCalc() 실행");
		avg = 1234;
		avg = 0;
		double [] rate = {0.1, 0.2, 0.7};
		for (int i = 0; i < rate.length; i++) {
			avg += jum[i] * rate[i];
		}
	}
}

public class OverExamMain {

	public static void main(String[] args) {
		OverStud st1 = new OverStud("한가인", 67,78,89);
		OverArt st2 = new OverArt("두가인", 67,78,89);
		//st1.totCalc();
		//st1.avgCalc();
		st1.ppp();
		st2.ppp();

	}
	
	/*
 	클래스를 구현하세요
	
	 
	 	    이름    	넓이                  	둘레
	  부모 : 직사각형  	가로 * 세로        		(가로 + 세로) * 2
	  자식 : 직각삼각형 	가로 * 세로 /2     		가로 + 세로 + 빗변



	* */

}
