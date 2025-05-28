package oops_p;

class McAAA{
	
	/*
	 멤버필드 : 메소드에서 공용으로 접근 
	 지역변수 : 메소드내에서만 접근(다른메소드에서 접근불가)
	 매개변수, 리턴 : 지역변수와 같으나 다른메소드 호출, 리턴시 상호작용으로 사용
	 * */
	
	int zz = 9;  
	String xx = "김수한무";
	
	int meth_1(int a, int b) {
		System.out.println("meth_1() 시작 : "+a+","+b+","+zz+","+xx);
		b+=meth_2(b);
		a++;
		b++;
		zz*=10;
		xx+="삼천갑자";
		System.out.println("meth_1() 끝 : "+a+","+b+","+zz+","+xx);
		return b;
	}
	int meth_2(int d) {
		//다른 메소드의 매개, 지역변수 접근 불가
		//System.out.println("\t meth_2() 시작"+a+","+b);
		int c= 300;
		System.out.println("\t meth_2() 시작:"+c+","+d+","+zz+","+xx);
		d+=meth_3(d);
		c++;
		d++;
		zz*=10;
		xx+="두루미";
		System.out.println("\t meth_2() 끝:"+c+","+d+","+zz+","+xx);
		
		return d;
	}
	
	int meth_3(int f) {
		//다른 메소드의 매개, 지역변수 접근 불가
		//System.out.println("\t\t meth_3() 시작"+c+","+d);
		System.out.println("\t\t meth_3() 시작:"+f+","+zz+","+xx);
		f+=3000;
		zz*=10;
		xx+="거북이와";
		System.out.println("\t\t meth_3() 끝:"+f+","+zz+","+xx);
		
		return f;
	}
}

public class MethodCallMain {

	public static void main(String[] args) {
		int aa = 10, bb = 20;
		System.out.println("메인 시작 : "+aa+","+bb);
		McAAA mca = new McAAA();
		System.out.println("메인 mca : "+mca.zz+","+mca.xx);
		bb += mca.meth_1(aa,bb);
		
		mca.zz*=10;
		mca.xx+="동박삭";
		System.out.println("메인 mca : "+mca.zz+","+mca.xx);
		System.out.println("메인 끝 : "+aa+","+bb);

	}

}
