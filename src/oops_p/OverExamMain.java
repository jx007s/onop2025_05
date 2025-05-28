package oops_p;

class OverStud{
	String pname, kind;
	int [] jum;
	int tot, avg;
	
	void input(String pname, int kor, int eng, int mat) {
		kind = "일반";
		this.pname = pname;
		jum = new int[]{kor, eng, mat};
	}
	
	void input(String pname, int kor, int eng, int mat, int art) {
		kind = "예체능";
		this.pname = pname;
		jum = new int[]{kor, eng, mat, art};
	}
	
	void calc() {
		tot = 0;
		avg = 0;
		double [] rate = {0.1,0.15,0.2,0.55};
		for (int i=0 ; i<jum.length;i++) {
			tot += jum[i];
			avg += jum[i]*rate[i]; 
		}
		
		if(kind=="일반") {
			avg = tot/jum.length;
		}
		
	}
	
	void ppp() {
		calc();
		
		String ttt = kind  +"\t"+pname +"\t";
		
		for (int i : jum) {
			ttt+=i+"\t";
		}
		
		if(kind=="일반") {
			ttt+="\t";
		}
		
		ttt += tot+"\t"+avg;
		System.out.println(ttt);
	}
}

class OverShape{
	String pname;
	int area, border;
	
	void input(int w, int h) {
		pname = "직사각형";
		area = w * h;
		border = (w + h) * 2;
	}
	
	void input(int r) {
		double PI = 3.141592;
		pname = "원";
		area = (int)(r * r * PI);
		border = (int)(r * 2 * PI);
	}
	
	void ppp() {
		System.out.println(pname+"\t"+area+"\t"+border);
	}
}

public class OverExamMain {

	public static void main(String[] args) {
		OverStud st1 = new OverStud();
		OverStud st2 = new OverStud();
		OverStud st3 = new OverStud();
		OverStud st4 = new OverStud();
		OverStud st5 = new OverStud();
		
		st1.input("조인성", 36, 68, 91);
		st2.input("감우성", 96, 68, 31);
		st3.input("감수성", 66, 68, 61,64);
		st4.input("수용성", 36, 58, 71,94);
		st5.input("남한산성", 96, 78, 51,34);
		
		st1.ppp();
		st2.ppp();
		st3.ppp();
		st4.ppp();
		st5.ppp();
		
		OverShape os = new OverShape();
		os.input(5, 6);
		os.ppp();
		os.input(5);
		os.ppp();
		

	}

}

/*
도형클래스를 제작하고 input() 의 매개변수에 따라 
원, 사각형을 구분하여 
도형종류, 넓이, 둘레길이를  출력하세요

 * */



