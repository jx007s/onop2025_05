package oops_p;

///학생클래스를 정의, 선언, 생성, 호출 하여 학생정보를 출력하세요
//--- 학번, 이름, 반, 전화번호,  점수 [국어, 영어, 수학], 총점, 평균

//클래스의 정의
class ClaStud{
	int no, ban, tot, avg;
	String pname, tel;
	int [] jum;
	
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
		String ttt = ban +"\t"+no+"\t"+pname+"\t"+tel;
		
		for (int i : jum) {
			ttt += "\t"+i;
		}
		ttt += "\t"+tot+"\t"+avg;
		System.out.println(ttt);
	}
}

public class ClaExamMain {

	public static void main(String[] args) {
		// 선언 = 생성
		ClaStud st1 = new ClaStud();
		ClaStud st2 = new ClaStud();
		
		//각 필드 대입
		st1.ban = 3;
		st1.no = 17;
		st1.pname = "이효리";
		st1.tel = "010-1234-5678";
		st1.jum = new int[]{89,81,71};
		
		st2.ban = 2;
		st2.no = 12;
		st2.pname = "삼효리";
		st2.tel = "010-1111-1111";
		st2.jum = new int[]{56,78,90};
		
		//계산
		st1.calc();
		st2.calc();
		
		st1.ppp();
		st2.ppp();

	}

}
