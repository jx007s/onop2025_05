package extends_p;

class DyStud{
	String pname, kind;
	int [] jum;
	int tot, avg;
	
	DyStud(String kind, String pname, int[] jum) {
		super();
		this.kind = kind;
		this.pname = pname;
		this.jum = jum;
		totCalc();
	}
	void totCalc() {
		tot = 0;
		for (int i : jum) {
			tot += i;
		}
	}
	
	void calc() {}
	
	void ppp() {
		calc();
		String ttt = kind+"\t"+pname+"\t"+tot+"\t"+avg;
		System.out.println(ttt);
	}
}
class DyGen extends DyStud{

	DyGen(String pname, int kor, int eng, int mat) {
		super("일반", pname, new int[] {kor, eng, mat});	
	}
	
	
	@Override
	void calc() {

		avg = tot/jum.length;
	}	
}

class DyArt extends DyStud{

	DyArt(String pname, int kor, int eng, int mat) {
		super("예체능", pname, new int[] {kor, eng, mat});	
	}
	
	@Override
	void calc() {
		avg = 0;
		double [] rate = {0.1,0.2,0.7};
		for (int i = 0; i < rate.length; i++) {
			avg += jum[i]*rate[i];
		}
	}	
}


public class DyExamMain {

	public static void main(String[] args) {
		DyStud [] studs = {
			new DyGen("원빈", 37, 68, 91),
			new DyGen("현빈", 97, 68, 31),
			new DyArt("김우빈", 37, 68, 91),
			new DyArt("장희빈", 97, 68, 31),
			new DyGen("커피빈", 67, 68, 61),
			new DyArt("미스터빈", 67, 68, 61)
		};
		
		for (DyStud st : studs) {
			st.ppp();
		}

	}

}


//도형 정보 계산 클래스를 완성하세요
//도형 정보 클래스 : 도형 종류, 넓이, 둘레  -- 정보 출력 메소드 void ppp()

// 계산하는 calc()  메소드를 오버라이딩 하세요
//도형의 종류 : 사각형, 원, 직각삼각형
