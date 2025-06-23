package lamda_p;
/*
정수3개를 매개변수로 받고 정수1개를 리턴하는 람다식 가능한 인터페이스를 구현하세요

계산식은 3개를 구현하세요
1. 3개의 합 리턴
2. 3개중 가장 큰수를 리턴
3. 첫번째 두번째 매개변수를 곱하고 3번째 매개변수로 뺀 수 리턴
* */

interface Num3{
	int calc(int a, int b, int c);
}

public class Number3Main {

	public static void main(String[] args) {
		Num3 n3 = (a,b,c)->a+b+c;
		System.out.println(n3.calc(10,20,30));
		
		n3 = (a,b,c)->{
			int ret = a;
			if(ret<b)
				ret = b;
			if(ret<c)
				ret = c;
			
			return ret;
		};
		System.out.println(n3.calc(10,82,30));
		
		n3 = (a,b,c)->a*b-c;
		System.out.println(n3.calc(10,20,30));
	}

}
