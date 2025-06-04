package excep_p;

public class DoubleExcepMain {

	public static void main(String[] args) {
		
		try {
			System.out.println("try 시작");
			int a = 10/0;
			System.out.println("try 끝 : "+a);
		} catch (Exception e) {
			//System.out.println("catch 시작"+a);
			System.out.println("catch 시작");
			
			try {
				System.out.println("catch~try 시작");
				int b = 10/0;
				System.out.println("catch~try 끝 :"+b);
			} catch (Exception qwer) {
				System.out.println("catch~catch 시작");
				
				System.out.println("catch~catch 끝");
			}
			
			System.out.println("catch 끝");
		}

		System.out.println("시스템 종료");
	}

}
/*
//if문 3항연산자, switch 등 조건항을 사용하지 않고 3,6,9게임을 완성하세요  
// 1-> 20
1
2
짝
4
5
짝
7
8
짝
10
11
12
짝
14
15
짝
17
18
짝
20
*/


