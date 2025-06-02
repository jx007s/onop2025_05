package extends_p;
class DyShape{
	String pname;
	int area, border;
	
	DyShape(String pname) {
		
		this.pname = pname;
	}
	void asdf() {}
	
	void qwer() {
		 asdf();
		System.out.println(pname+"\t"+area+"\t"+border);
	}
}


class DyRec extends DyShape{
	int w,h;
	
	
	public DyRec(int w, int h) {
		super("직사각형");
		this.w = w;
		this.h = h;
	}

	void asdf() {
		area = w*h;
		border = (w+h)*2;
	}
}

class DyTri extends DyShape{
	int w,h,a;
	
	
	public DyTri(int w, int h, int a) {
		super("직각삼각형");
		this.w = w;
		this.h = h;
		this.a = a;
	}

	void asdf() {
		area = w*h/2;
		border = w+h+a;
	}
}

class DyCircle extends DyShape{
	int r;
	
	
	public DyCircle(int r) {
		super("원");
		this.r = r;
	}

	void asdf() {
		double PI = 3.141592;
		area = (int)(r*r*PI);
		border = (int)(r*2*PI);
	}
}


public class DyShapeMain {

	public static void main(String[] args) {
		DyShape [] arr = {
			new DyRec(5,6),
			new DyTri(5, 6, 8),
			new DyCircle(5)
		};
		
		for (DyShape ds : arr) {
			ds.qwer();
		}
		

	}

}
