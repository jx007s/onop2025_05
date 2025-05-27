package oops_p;

class MethodStud{
	int ban, tot, avg;
	String pname;
	int [] jum;
	
	//매개변수, 지역변수 는 멤버필드와 중첩가능
	void input(int ban, String nn, int kor, int eng, int mat) {
		int a = 10;	//지역변수
		//String nn = "장수풍뎅이";  매개변수와 지역변수 중첩불가
		// ban : 지역,매개변수
		// this.ban : 멤버필드
		System.out.println("입력이지롱 : "+ban+","+this.ban+","+a);
		this.ban = ban;
		pname = nn;
		jum = new int[] {kor, eng, mat};
	}
	
	//계산 메소드
	void calc() {
		System.out.println("계산이지롱");
		tot  = 0;	//메소드의 중복호출시 누적처리 되지 않기 위해 필드 초기화
		for (int i : jum) {
			tot += i;
		}
		
		avg = tot / jum.length;
	}
	
	//출력 메소드
	void ppp() {
		String ttt = ban +"\t"+pname;
		
		for (int i : jum) {
			ttt += "\t"+i;
		}
		ttt += "\t"+tot+"\t"+avg;
		System.out.println(ttt);
	}
}

public class MethodExamMain {

	public static void main(String[] args) {
//		MethodStud st1 = new MethodStud();
//		MethodStud st2 = new MethodStud();
		
		//MethodStud [] studs = {st1, st2, new MethodStud()};
		
//		st1.input(2, "한가인", 89,76,81);
//		st2.input(3, "두가인", 59,56,51);
		
//		MethodStud [] studs = {new MethodStud(),new MethodStud(), new MethodStud()};
//		MethodStud [] studs = new MethodStud[]{
//				new MethodStud(),
//				new MethodStud(), 
//				new MethodStud()
//				};
		MethodStud [] studs = new MethodStud[3];
		
//		studs[0] = new MethodStud();
//		studs[1] = new MethodStud();
//		studs[2] = new MethodStud();
		
		for (int i = 0; i < studs.length; i++) {
			studs[i] = new MethodStud();
		}
		
		studs[0].input(2, "한가인", 89,76,81);
		studs[1].input(3, "두가인", 59,56,51);
		studs[2].input(2, "세가인", 99,96,91);
//		
//		st1.calc();
//		st2.calc();
//		
//		st1.ppp();
//		st2.ppp();
		
		
		
		for (int i = 0; i < studs.length; i++) {
			studs[i].calc();
			studs[i].ppp();
		}
		
		System.out.println(">>>>>>>>>>>>>>>");
		
		
	}

}


//직각삼각형 클래스를 완성하세요
//멤버변수 : 넓이(높이* 너비 / 2), 둘레(높이+ 너비+ 빗변), 높이, 너비, 빗변
/// 입력 메소드 - 높이, 너비, 빗변
///  출력메소드 - 도형 이름, 넓이, 둘레








