package inter_p;

//이미르를 구현하세요
/// 엄마를 만날때 - 밥 줘요, 잔소리좀 
/// 선생님 만날때 - 가르쳐주세요, 잔소리좀
/// 남친을 만날때 - 놀러가자, 게임하자

interface Mom{
	void bob(String time, String menu);
	void sori(String msg);
}
interface Teacher{
	void sori(String msg);
	void learn(String qq);
}
interface Friend{
	void play(String target, String qq);
	void game(String target, String qq);
}

class IMR implements Mom, Teacher, Friend{

	private final String pname;
	
	public IMR(String pname) {
		this.pname = pname;
	}

	@Override
	public void play(String target, String qq) {
		System.out.println(pname+" "+target+"과 "+qq+" 하며 놀아요");
		
	}

	@Override
	public void game(String target, String qq) {
		System.out.println(pname+" "+target+"과 "+qq+" 게임해요");
		
	}

	@Override
	public void learn(String qq) {
		System.out.println(pname+" "+qq+" 질문해요");
	}

	@Override
	public void bob(String time, String menu) {
		System.out.println(pname+" "+time+" "+menu+" 식사해요");
	
	}

	@Override
	public void sori(String msg) {
		System.out.println(pname+" "+msg+" "+" 잔소리좀 ...");
		
	}
	
}
public class IMRMain {

	public static void main(String[] args) {
		IMR imr = new IMR("황삼묵");
		Mom mm = imr;
		Teacher tt = imr;
		Friend ff = imr;
		
		mm.bob("아침", "부대찌개");
		tt.learn("예외처리");
		ff.play("박세웅","축구");
		mm.sori("술");
	}

}
