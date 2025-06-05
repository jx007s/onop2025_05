package inner_p;

class BaseTeam{
	String name;
	int hit, out3;
	
	BaseTeam(String name) {
		this.name = name;
	}

	void ppp() {
		System.out.println(name);
		System.out.println("안타 :"+hit);
		System.out.println("삼진 :"+out3);
	}
	
	class Player{
		String name;
		int hit, out3, ball4;
		String [] ttt = {"안타","삼진", "사사구"};
		
		Player(String name) {
			this.name = name;
		}
		
		void go(int ret) {
			
			System.out.println(BaseTeam.this.name+" "+name+" : "+ttt[ret]);
			switch(ret) {
			case 0:
				hit++;
				BaseTeam.this.hit++;
				break;
			case 1:
				out3++;
				BaseTeam.this.out3++;
				break;
			case 2:
				ball4++;
				break;
			}
			
		}
		
		void ppp() {
			System.out.println(BaseTeam.this.name+" "+name+"-----------");
			System.out.println(ttt[0]+":"+hit);
			System.out.println(ttt[1]+":"+out3);
			System.out.println(ttt[2]+":"+ball4);
		}
	}
}

public class BaseBallMain {

	public static void main(String[] args) {
		BaseTeam t1 = new BaseTeam("NC");
		BaseTeam t2 = new BaseTeam("롯데");
		
		
		BaseTeam.Player[] pps = {
				t1.new Player("박석민"),
				t2.new Player("레이예스"),
				t1.new Player("손아섭"),
				t1.new Player("박민우"),
				t2.new Player("윤동희"),
				t2.new Player("전준우")
		};
		
		pps[0].go(1);
		pps[2].go(0);
		pps[1].go(1);
		pps[4].go(1);
		pps[3].go(2);
		pps[5].go(1);
		pps[0].go(0);
		pps[2].go(0);
		
		for (BaseTeam.Player player : pps) {
			player.ppp();
		}
		t1.ppp();
		t2.ppp();
	}

}


/*
커피 전문점을 구현하세요
       
         하삼동, 상남동
         지역별로 커피전문점이 존재

         별다방 - 창원,진주,김해
         커피콩 - 창원,부산,통영

                       하삼동 상남동
        아메리카노:		2000    2100
        아시아노:			2300    2500
        아프리카노:		2700    2200
        
		각 지점이 커피를 주문받으세요(각 지점에서만 주문가능)

        각 지점별 커피 판매내역과
        총판 커피 판매 내역을 출력하세요

 */