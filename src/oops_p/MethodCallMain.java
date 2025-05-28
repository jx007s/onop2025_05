package oops_p;

class McAAA{
	int meth_1(int a, int b) {
		System.out.println("meth_1() 시작 : "+a+","+b);
		b+=meth_2(a);
		a++;
		b++;
		System.out.println("meth_1() 끝 : "+a+","+b);
		return b;
	}
	int meth_2(int f) {
		//다른 메소드의 매개, 지역변수 접근 불가
		//System.out.println("\t meth_2() 시작"+a+","+b);
		int c= 300, d = 400;
		System.out.println("\t meth_2() 시작:"+c+","+d);
		d+=meth_3();
		c++;
		d++;
		System.out.println("\t meth_2() 끝:"+c+","+d);
		
		return d;
	}
	
	int meth_3() {
		//다른 메소드의 매개, 지역변수 접근 불가
		//System.out.println("\t\t meth_3() 시작"+c+","+d);
		System.out.println("\t\t meth_3() 시작");
		
		System.out.println("\t\t meth_3() 끝");
		
		return 3000;
	}
}

public class MethodCallMain {

	public static void main(String[] args) {
		int aa = 10, bb = 20;
		System.out.println("메인 시작 : "+aa+","+bb);
		McAAA mca = new McAAA();
		bb += mca.meth_1(aa,bb);
		System.out.println("메인 끝 : "+aa+","+bb);

	}

}
