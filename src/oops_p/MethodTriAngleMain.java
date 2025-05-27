package oops_p;

//멤버변수 : 넓이(높이* 너비 / 2), 둘레(높이+ 너비+ 빗변), 높이, 너비, 빗변
/// 입력 메소드 - 높이, 너비, 빗변
///  출력메소드 - 도형 이름, 넓이, 둘레
class MethodTriAngle{
	String pname;
	int area, border, width,height, line;
	
	void input(int width,int height, int line) {
		this.width = width;
		this.height = height;
		this.line = line;
		
		pname = "직각삼각형";
		
		calc();	//메소드호출
		ppp();
	}
	
	void calc() {
		area =  width * height / 2;
		border =  width + height + line;
	}
	
	void ppp() {
		System.out.println(pname+" : "+area+" , "+border);
	}
}

public class MethodTriAngleMain {

	public static void main(String[] args) {
		MethodTriAngle ta1 = new MethodTriAngle();
		ta1.input(5, 6, 8);
		//ta1.calc();
		//ta1.ppp();

	}

}
