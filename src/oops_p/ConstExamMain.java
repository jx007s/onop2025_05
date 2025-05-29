package oops_p;
class ConstStud{
	String kind, pname;
	int [] jum;
	int tot, avg;
	
	ConstStud(String kind, String pname, int[] jum) {
		this.kind = kind;
		this.pname = pname;
		this.jum = jum;
		
		totCalc();
	}
	
	ConstStud(String pname, int kor, int eng, int mat) {
		this("일반",pname,new int[] {kor, eng, mat});
		avg = tot/jum.length;
		//ppp();
	}
	
	ConstStud(String pname, int kor, int eng, int mat, int art) {
		this("예체능",pname,new int[] {kor, eng, mat, art});
		artCalc();
		//ppp();
	}
	
	void totCalc() {
		tot = 0;
		for (int i : jum) {
			tot += i;
		}
	}
	
	void artCalc() {
		avg = 0;
		double [] rate = {0.1,0.15,0.2,0.55};
		for (int i = 0; i < rate.length; i++) {
			avg += rate[i] * jum[i];
		}
	}
	
	
	
	void ppp() {
		String ttt = kind +"\t"+pname;
		for (int i : jum) {
			ttt += "\t"+i; 
		}
		if(kind=="일반") {
			ttt += "\t";
		}
		ttt+= "\t"+ tot+"\t"+avg;
		System.out.println(ttt);
	}
	
	/*
	ConstStud(String pname, int [] jum){
		this.pname = pname;
		this.jum = jum;
	}*/
	
}
public class ConstExamMain {

	public static void main(String[] args) {
		//ConstStud cs = new ConstStud("일반", "현빈", new int[] {78,89,90});
		//cs.ppp();
//		ConstStud cs1 = new ConstStud("현빈",78,89,90);
//		ConstStud cs2 = new ConstStud("원빈",78,89,90,71);
//		cs1.ppp();
//		cs2.ppp();
		
	//	new ConstStud("현빈",78,89,90);
	//	new ConstStud("원빈",78,89,90,71);
		
		ConstStud [] studs = {
			new ConstStud("현빈",78,89,90),
			new ConstStud("원빈",78,89,90,71),
			new ConstStud("김우빈",38,69,90),
			new ConstStud("장희빈",38,59,70,91),
			new ConstStud("커피빈",98,69,30),
			new ConstStud("미스터빈",98,79,50,31),
		};
		
		for (ConstStud st : studs) {
			st.ppp();
		}
	}

}


/*

///////// 

도형 클래스를 구현하세요

생성자 매개변수 갯수로 도형을 구분할 것

도형 : 사각형, 직각삼각형

출력 : 도형(사각형, 직각삼격형)의 넓이, 둘레

-----------------------------------------

사각형의 넓이 : 30, 둘레 : 22

직각삼각형의 넓이 : ?, 둘레: ?

* */





