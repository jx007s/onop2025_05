package extends_p;
//영화예약 클래스를 생성하여 출력해보세요
//예약시 필수 입력 사항 : id, 성명, 전화번호, 상영시간, 좌석번호
//예약후 변경 가능사항 : 성명, 전화번호
//출력시 모든 항목이 다 있어야 함
class CapMovie{
	//final 초기화 : 멤버필드 선언시 초기화
	//             생성자에서 초기화
	//             위 두가지를 하나의 필드에 모두 적용하면 에러
	
	private final String id, time;  
	private final int seat;
	private String pname, tel;
	
	public CapMovie(String id, String pname, String tel, String time, int seat) {
		
		this.id = id;
		this.pname = pname;
		this.tel = tel;
		this.time = time;
		this.seat = seat;
	}

	
	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public String getId() {
		return id;
	}


	public String getTime() {
		return time;
	}


	public int getSeat() {
		return seat;
	}


	void ppp() {
		
		System.out.println(id+"\t"+pname+"\t"+tel+"\t"+time+"\t"+seat);
	}
	
	
}

public class CapsuleMovieMain {

	public static void main(String[] args) {
		CapMovie cm = new CapMovie("asdf", "황일묵", "010-1111-1111", "2", 17);
		cm.setPname("황이묵");
		cm.setTel("010-2222-2222");
		cm.ppp();
		System.out.println("아이디 : "+cm.getId());
		System.out.println("이름 : "+cm.getPname());
		System.out.println("전화번호 : "+cm.getTel());
		System.out.println("상영시간 : "+cm.getTime());
		System.out.println("좌석번호 : "+cm.getSeat());

	}

}
