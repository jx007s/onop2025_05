package extends_p;

class ExStud{
	String kind, pname;
	int tot, avg;
	int [] jum;
	
	void totCalc() {
		tot = 0;
		for (int i : jum) {
			tot += i;
		}
	}
	
	void ppp() {
		System.out.println(kind+"\t"+pname+"\t"+tot+"\t"+avg);
	}
}


class ExGen extends ExStud{
	
	ExGen(String pname, int kor, int eng, int mat) {
		kind = "일반";
		this.pname = pname;
		jum = new int[] {kor, eng, mat};
		totCalc();
		avgCalc();
	}
	
	void avgCalc() {
		avg = tot/jum.length;
	}
}


class ExArt extends ExStud{
	
	ExArt(String pname, int kor, int eng, int mat, int art) {
		kind = "예체능";
		this.pname = pname;
		jum = new int[] {kor, eng, mat, art};
		totCalc();
		avgCalc();
	}
	
	void avgCalc() {
		double [] rate = {0.1,0.15,0.2,0.55};
		avg = 0;
		for (int i = 0; i < rate.length; i++) {
			avg += jum[i] * rate[i];
		}
	}
}

public class ExtendsExamMain {

	public static void main(String[] args) {
		ExGen st1 = new ExGen("정우성", 38,69,91);
		ExArt st2 = new ExArt("정좌성",36,57,71,92);
		ExGen st3 = new ExGen("정남성", 98,69,31);
		ExArt st4 = new ExArt("정중성",96,77,51,32);
		st1.ppp();
		st2.ppp();
		st3.ppp();
		st4.ppp();

	}

}



/*
도형 클래스를 구현하세요
부모 : 도형 -- 이름, 넓이, 둘레
 
 	자식 :    	넓이                  	둘레
  직사각형  	가로 * 세로        		(가로 + 세로) * 2
  직각삼각형 	가로 * 세로 /2     		가로 + 세로 + 빗변



* */
