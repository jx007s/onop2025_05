package extends_p;

abstract class AbsPlayer{
	String pname;
	String now;
	
	AbsPlayer(String pname) {
	
		this.pname = pname;
	}
	abstract void play(String title);
	abstract void suspend();
	abstract void stop();
}

class AbsMp3 extends AbsPlayer{

	AbsMp3() {
		super("mp3");
	}

	@Override
	void play(String title) {
		System.out.println(pname+" "+title+" 노래시작 해요");
		now = title;
	}

	@Override
	void suspend() {
		System.out.println(pname+"  일시중지 해요");
		
	}

	@Override
	void stop() {
		System.out.println(pname+" "+now+" 노래 끝났어요");
	}
	
}

class AbsGame extends AbsPlayer{

	AbsGame() {
		super("게임기");
	}

	@Override
	void play(String title) {
		System.out.println(pname+" "+title+" 게임해요");
		now = title;
	}

	@Override
	void suspend() {
		System.out.println(pname+"  게임 일시정지 해요");
		
	}

	@Override
	void stop() {
		System.out.println(pname+" "+now+" 게임 멈춰요");
	}
	
}

class AbsTV extends AbsPlayer{

	AbsTV() {
		super("tv");
	}

	@Override
	void play(String title) {
		System.out.println(pname+" "+title+" 시청해요");
		now = title;
	}

	@Override
	void suspend() {
		System.out.println(pname+" 시청 중단해요");
		
	}

	@Override
	void stop() {
		System.out.println(pname+" "+now+" 끝났어요");
	}
	
}

public class AbsPlayerMain {

	public static void main(String[] args) {
		AbsPlayer mp3 = new AbsMp3();
		AbsPlayer game = new AbsGame();
		AbsPlayer tv = new AbsTV();

		mp3.play("멸공의횃불");
		mp3.suspend();
		mp3.stop();
		
		tv.play("전설의고향");
		tv.suspend();
		tv.stop();
		
		game.play("보글보글");
		game.suspend();
		game.stop();
	}

}
