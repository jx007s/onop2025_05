package inner_p;

class StaOuter{
	String a = "oo_a";
	static String sa = "oo_스태틱_sa";
	
	void m_1() {
		System.out.println("oo_m_1() 실행");
	}
	
	static void m_s1() {
		System.out.println("oo_스태틱_m_s1() 실행");
	}
	
	InnSta mySta1 = new InnSta();
	
	void m_m1() {
		System.out.println("[[[m_m1]]] 시작-----");
		System.out.println(mySta1.c+","+mySta1.sc);
		mySta1.m_2();
		mySta1.m_s2();
		System.out.println(InnSta.sc);
		InnSta.m_s2();
		System.out.println("[[[m_m1]]] 끝-----");
	}
	
	static void m_sm1() {
		System.out.println("[[[m_sm1]]] 시작-----");
		// static 형태만 접근 가능
		//System.out.println(mySta1.c+","+mySta1.sc);
		//mySta1.m_2();
		//mySta1.m_s2();
		System.out.println(InnSta.sc);
		InnSta.m_s2();
		System.out.println("[[[m_m1]]] 끝-----");
	}
	
	
	//2. static inner 클래스
	static class InnSta{
		String c = "ii_c";
		static String sc = "ii_스태틱_sc";
		
		void m_2() {
			System.out.println("ii_m_2() 시작 ----");
			// outer : static 만 접근가능
			// 자신 : 모두 접근가능
			//System.out.println(a+","+sa+","+c+","+sc);
			System.out.println(sa+","+c+","+sc);
			//m_1();
			m_s1();
			m_3();
			m_s4();
			System.out.println("ii_m_2() 끝 ----");
		}
		
		static void m_s2() {
			System.out.println("ii_스태틱_m_s2() 시작------");
			
			//outer와 자신의 static 만 접근 가능
			//System.out.println(sa+","+c+","+sc);
			System.out.println(sa+","+sc);
			//m_1();
			m_s1();
			//m_3();
			m_s4();
			System.out.println("ii_스태틱_m_s2() 끝------");
		}
		
		void m_3() {
			System.out.println("ii_m_3() 실행");
		}
		
		static void m_s4() {
			System.out.println("ii_스태틱_m_s4() 실행");
		}
	}
}


public class StaticMain {

	public static void main(String[] args) {
		StaOuter so1 = new StaOuter();
		StaOuter so2 = new StaOuter();
		
		so1.a = "바깥_a";
		so1.sa = "바깥_스태틱_sa";
		
		System.out.println("so1 : "+so1.a+","+so1.sa);
		System.out.println("so2 : "+so2.a+","+so2.sa);
		
		// 단독 선언 생성 불가
		//InnSta is1;
		
		// new outer클래스명.staticinner클래스명()
		StaOuter.InnSta is1 = new StaOuter.InnSta();
		StaOuter.InnSta is2 = new StaOuter.InnSta();
		//StaOuter.InnSta is11 = so1.new InnSta();
		
		is1.c = "일번c";
		is1.sc = "일번sc";
		System.out.println("is1 :"+is1.c+","+is1.sc);
		is1.m_2();
		is1.m_s2();
		
		System.out.println("is2 :"+is2.c+","+is2.sc);
		is2.m_2();
		is2.m_s2();
		
		System.out.println("StaOuter.InnSta :"+StaOuter.InnSta.sc);
		StaOuter.InnSta.m_s2();
		
		so1.m_m1();
		StaOuter.m_sm1();
	}

}
