package inter_p;

interface Counter{
	void hello();
	void cash(int table, int money);
}

interface Hall{
	void hello();
	void serving(int table, String menu);
}

interface Kitchen{
	void wash(int cnt);
}

class Alba implements Counter, Hall, Kitchen{
	
	final private String pname;
	private int hhCnt=0, cashCnt=0, servCnt=0, washCnt=0;
	
	Alba(String pname) {
		
		this.pname = pname;
	}

	@Override
	public void hello() {
		System.out.println(pname+" 인사해요");
		hhCnt++;
	}

	@Override
	public void cash(int table, int money) {
		System.out.println(pname+" "+table+"테이블 "+money+" 계산해요");
		cashCnt++;
	}
	
	@Override
	public void serving(int table, String menu) {
		System.out.println(pname+" "+table+"테이블 "+menu+" 서빙해요");
		servCnt++;
	}

	@Override
	public void wash(int cnt) {
		System.out.println(pname+" 그릇 "+cnt+"개 설거지해요");
		washCnt++;
	}

	void ppp() {
		System.out.println(pname+":"+hhCnt+","+cashCnt+","+servCnt+","+washCnt);
	}
}

public class AlbaMain {

	public static void main(String[] args) {
		Counter cc;
		Hall hh;
		Kitchen kk;
		
//		Alba aa1 = new Alba("조보아");
//		Alba aa2 = new Alba("정인선");
//		Alba aa3 = new Alba("전지현");
//		Alba aa4 = new Alba("김태희");
		
		Alba [] abs = {
			 new Alba("조보아"),
			new Alba("정인선"),
			new Alba("전지현"),
			new Alba("김태희")
				
		};
		
		cc = abs[0];
		hh = abs[1];
		kk = abs[2];
		
		cc.hello();
		hh.hello();
		hh.serving(1, "김치찌개");
		kk.wash(5);
		hh = abs[3];
		hh.serving(2, "참치찌개");
		cc.cash(2, 8000);
		
		for (Alba ab : abs) {
			ab.ppp();
		}
	}

}


//이미르를 구현하세요
/// 엄마를 만날때 - 밥 줘요, 잔소리좀 
/// 선생님 만날때 - 가르쳐주세요, 잔소리좀
/// 남친을 만날때 - 놀러가자, 게임하자
