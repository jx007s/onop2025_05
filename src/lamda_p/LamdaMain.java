package lamda_p;


/*
  
 람다식 :  
 추상메소드가 1개인 인터페이스의
 선언 생성시 추상메소드를 간략히 재정의 하는 방식
  
 * */

//추상메소드가 1개인 인터페이스
interface AAA{
	void meth(int a, int b);
}

//매개변수, 리턴이 있는 추상메소드
interface BBB{
	int meth(int a, int b);
}

interface CCC{
	int meth_1(int a, int b);
	int meth_2(int a, int b);
	
}

public class LamdaMain {

	public static void main(String[] args) {
		new Thread() {
			public void run() {
				System.out.println("생성시 재정의 run");
			}
		}.start();
		
		
		new Thread(
				new Runnable() {
					
					@Override
					public void run() {
						System.out.println("인터페이스 Runnable 재정의 run");
						
					}
				}
		).start();
		
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("r1 run");
			}
		};
		
		//인터페이스 선언 및 람다식 생성
		Runnable r2 = ()->System.out.println("람다식 r2 run");
		
		
		new Thread(r2).start();
		
		new Thread(()->System.out.println("생성시 람다식  run")).start();
		
		
		AAA a1 = new AAA() {

			@Override
			public void meth(int a, int b) {
				System.out.println(a+b);
			}
		};
		a1.meth(10, 20);
		
		// 추상메소드 1개인 인터페이스는 람다식으로 메소드 재정의 가능
		AAA a2 = (a,b)->{System.out.println("람다식 재정의:"+a+","+b);};
		
		a2.meth(10, 20);
		
		BBB b1 = (c,d)->c+d;   // return c+d;
		
		int rr = b1.meth(10, 20);
		System.out.println(rr);
		
		b1 = (c,d)->{  //수식이 복잡한 경우 {} 안에 수식 및 코드 진행 하고 return 한다.
			int res = 0;
			
			for (int i = c; i <= d; i++) {
				res+= i;
				System.out.println(i+":"+res);
			}
			
			return res;
		};  
		
		rr = b1.meth(10, 20);
		System.out.println(rr);
		
		CCC c1 = new CCC() {
			
			@Override
			public int meth_2(int a, int b) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int meth_1(int a, int b) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		// 추상메소드 2개인 경우 람다식 불가
		//CCC c2 = (a,b)->{System.out.println("람다식 재정의:"+a+","+b);};

	}

}
/*
 정수3개를 매개변수로 받고 정수1개를 리턴하는 람다식 가능한 인터페이스를 구현하세요
 
 계산식은 3개를 구현하세요
 1. 3개의 합 리턴
 2. 3개중 가장 큰수를 리턴
 3. 첫번째 두번째 매개변수를 곱하고 3번째 매개변수로 뺀 수 리턴
 * */







