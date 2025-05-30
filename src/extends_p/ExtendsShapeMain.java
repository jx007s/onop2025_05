package extends_p;

class ExShape{
	String pname;
	int area, border;
	
	void ppp() {
		System.out.println(pname+"\t"+area+"\t"+border);
	}
}
class ExRectangle extends ExShape{
	int w,h;

	ExRectangle(int w, int h) {
		pname = "직사각형";
		this.w = w;
		this.h = h;
		calc();
	}
	void calc() {
		area = w*h;
		border = (w+h)*2;
	}
}

class ExTriAngle extends ExShape{
	int w,h, a;

	ExTriAngle(int w, int h,int a) {
		pname = "직각삼각형";
		this.w = w;
		this.h = h;
		this.a = a;
		calc();
	}
	void calc() {
		area = w*h / 2;
		border = w+h+a;
	}
}

public class ExtendsShapeMain {

	public static void main(String[] args) {
		ExRectangle sh1 = new ExRectangle(5, 6);
		ExTriAngle sh2 = new ExTriAngle(5, 6, 8);
		
		sh1.ppp();
		sh2.ppp();
	}

}

