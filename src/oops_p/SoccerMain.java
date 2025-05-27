package oops_p;

/* 축구선수를 구현하세요

   포지션, 공격, 패쓰, 이름, 등번호, 수비
*/

class SoccerPlayer{
	String pos = "공격수";
	String name;	//기본값 : null
	int no;			//기본값 : 0
	
	void attack() {
		System.out.println("공격해요");
	}
	
	void pass() {
		//메소드에서 멤버필드 사용가능
		System.out.println(name+" 패쓰해요");
	}
	void defense() {
		System.out.println(no+pos+name+" 수비해요");
	}
	
}


class HandPhone{
	String name,camera = "일반카메라", earPhone="일반이어폰";
	
	void call() {
		System.out.println(name+" "+earPhone+"으로 전화해요");
	}
	void photo() {
		System.out.println(name+" "+camera+" 사진 찍어요");
	}
	void game() {
		System.out.println(name+" 게임해요");
	}
}



public class SoccerMain {

	public static void main(String[] args) {
		SoccerPlayer socP1 = new SoccerPlayer();
		SoccerPlayer socP2 = new SoccerPlayer();
		socP1.name = "안정환";
		//socP1.no = 13;
		//socP2.name = "이영표";
		socP2.pos = "수비수";
		socP2.no = 21;
		
		System.out.println(socP1.name+socP1.no+socP1.pos);
		socP1.attack();
		socP1.pass();
		socP1.defense();
		System.out.println(socP2.name+socP2.no+socP2.pos);
		socP2.attack();
		socP2.pass();
		socP2.defense();
		
		
		HandPhone hp1 = new HandPhone();
		HandPhone hp2 = new HandPhone();
		hp1.name = "갤럭시";
		hp1.camera = "광학카메라";
		hp2.name = "어른폰";
		hp2.earPhone = "블루투스이어폰";
		
		System.out.println("hp1 "+hp1.name+","+hp1.camera+","+hp1.earPhone);
		System.out.println("hp2 "+hp2.name+","+hp2.camera+","+hp2.earPhone);
		
		hp1.call();
		hp1.photo();
		
		hp2.call();
		hp2.game();
	}

}

/*
핸드폰 기본스펙
카메라 : 일반카메라
이어폰 : 일반이어폰
전화하기
사진찍기
게임하기


//핸드폰을 두개 사서 
//핸드폰1 ->카메라 : 광학 카메라
//핸드폰2 ->이어폰 : 블루투스 이어폰 으로 변경하세요

//핸드폰1 ->전화를 하고, 사진을 찍고
//핸드폰2 ->전화를 하고, 게임을 해요
 * */



