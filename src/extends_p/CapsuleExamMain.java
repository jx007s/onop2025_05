package extends_p;

class StudDTO{
	private String pname;
	private int kor, eng, mat;
	//private int tot, avg;
	
	
	public StudDTO(String pname) {
		this.pname = pname;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		if(kor <0 || kor > 100) {
			System.out.println("국어 입력 에러");
			return;
		}
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		if(eng <0 || eng > 100) {
			System.out.println("영어 입력 에러");
			return;
		}
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		if(mat <0 || mat > 100) {
			System.out.println("수학 입력 에러");
			return;
		}
		this.mat = mat;
	}
	public String getPname() {
		return pname;
	}
	public int getTot() {
		return kor + eng + mat;
	}
	public int getAvg() {
		return getTot()/3;
	}
	
	void ppp() {
		String ttt = pname+"\t"+kor+"\t"+eng+"\t"+mat;
		ttt+="\t"+getTot()+"\t"+getAvg();
		
		System.out.println(ttt);
	}
}

public class CapsuleExamMain {

	public static void main(String[] args) {
		StudDTO st1 = new StudDTO("황영묵");
		st1.setKor(78);
		st1.setKor(178);
		st1.setEng(81);
		st1.setMat(62);
		System.out.println(st1.getPname());
		System.out.println(st1.getKor());
		System.out.println(st1.getEng());
		System.out.println(st1.getMat());
		System.out.println(st1.getTot());
		System.out.println(st1.getAvg());
		
		st1.ppp();
	}

}

//영화예약 클래스를 생성하여 출력해보세요
//예약시 필수 입력 사항 : id, 성명, 전화번호, 상영시간, 좌석번호
//예약후 변경 가능사항 : 성명, 전화번호
//출력시 모든 항목이 다 있어야 함
