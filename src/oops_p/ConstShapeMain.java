package oops_p;

class ConstShape{
	String pname;
	int area, border;
	
	ConstShape(int w, int h) {
		pname = "사각형";
		area = w*h;
		border = (w + h) *2;
	}
	
	ConstShape(int w, int h, int a) {
		pname = "직각삼각형";
		area = w*h / 2;
		border = w + h + a;
	}
	
	void ppp() {
		System.out.println(pname+"\t"+area+"\t"+border);
	}
}
public class ConstShapeMain {

	public static void main(String[] args) {
		ConstShape [] shapes = {
				new ConstShape(5,6),
				new ConstShape(5,6,8),
				new ConstShape(10,10),
				new ConstShape(15,8,20),
				new ConstShape(10,7,15)
		};
		
		for (ConstShape sh : shapes) {
			sh.ppp();
		}

	}

}
