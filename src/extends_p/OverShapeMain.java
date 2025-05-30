package extends_p;

class OverRec{
	int w, h, area, border;
	String pname;
	
	OverRec( int w, int h) {
		
		this.pname = "직사각형";
		this.w = w;
		this.h = h;
	}
	
	void calc() {
		area = w * h;
		border = (w+h)*2;
	}
	 void ppp() {
		 calc();
		 System.out.println(pname+"\t"+area+"\t"+border);
	 }
	
}

class OverTriAngle extends OverRec{
	int a;

	public OverTriAngle(int w, int h, int a) {
		super(w, h);
		this.a = a;
		pname = "직각삼각형";
	}
	void calc() {
		area = w * h / 2;
		border = w+h+a;
	}
}

public class OverShapeMain {

	public static void main(String[] args) {
		OverRec sh1 = new OverRec(5, 6);
		OverTriAngle sh2 = new OverTriAngle(5, 6, 8);
		sh1.ppp();
		sh2.ppp();

	}

}
