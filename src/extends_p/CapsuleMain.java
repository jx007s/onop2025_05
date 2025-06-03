package extends_p;

class CapMember{
	
	private int age = 27;
	private boolean marriage;
	private int [] jum = {81,72,63};
	private int [] nums = {81,72,63};
	
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
	public boolean isMarriage() {
		return marriage;
	}
	public void setMarriage(boolean marriage) {
		this.marriage = marriage;
	}
	public int[] getJum() {
		return jum;
	}
//	public void setJum(int[] jum) {
//		this.jum = jum;
//	}
	public int getAge() {
		return age;
	}
	
	public int getNums(int no) {
		if(no>=nums.length) {
			System.out.println("거 너무하는거 아니오");
			return 0;
		}
		return nums[no];
	}
}


public class CapsuleMain {

	public static void main(String[] args) {
		CapMember cm = new CapMember();
		//cm.pname = "홍길동"; 멤버필드 직접접근 불가
		cm.setPname("청길동");			   //메소드로 대입
		System.out.println(cm.getPname()); //메소드로 호출
		//cm.setAge(19);
		System.out.println(cm.getAge());
		cm.setMarriage(true);
		//System.out.println(cm.getMarriage());
		System.out.println(cm.isMarriage());
		//cm.setJum(new int[] {11,22,33});
		
		cm.getJum()[1] = 2345;
		System.out.println(cm.getJum()[0]);
		System.out.println(cm.getJum()[1]);
		System.out.println(cm.getJum()[2]);
		System.out.println(cm.getNums(0));
		System.out.println(cm.getNums(1));
		System.out.println(cm.getNums(2));
		System.out.println(cm.getNums(3));
	}

}
