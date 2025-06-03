package extends_p;

class CapMember{
	
	private int age;
	private boolean marriage;
	private int [] jum = {81,72,63};
	
	//캡슐화 - 멤버변수를 모두 은닉(private)하고 메소드로 접근(public) 하는 것
	// 변수 (메모리공간)의 직접접근을 제한 하기 위해 private 사용
	//메소드 - 접근허용을 위해서는 public 사용
	private String pname;
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPname() {
		return pname;
	} 
	
	
}


public class CapsuleMain {

	public static void main(String[] args) {
		CapMember cm = new CapMember();
		//cm.pname = "홍길동"; 멤버필드 직접접근 불가
		cm.setPname("청길동");			   //메소드로 대입
		System.out.println(cm.getPname()); //메소드로 호출

	}

}
