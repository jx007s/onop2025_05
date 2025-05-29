package oops_p;

class DragonMoney{
	static int mom = 100;
	
	String pname;
	int myMoney = 0;
	
	void showMeTheMoney(int money) {
		if(pname=="아빠") {
			System.out.println("이사람이!!!");
			return;
		}
		mom -= money;
		myMoney += money;
		System.out.println(pname+":"+money+"("+myMoney+")");
		System.out.println("\t잔액:"+mom);
	}
	
	void missionComplete(int money) {
		if(pname!="아빠") {
			System.out.println("건강하게만 자라다오");
			return;
		}
		mom += money;
		myMoney += money;
		System.out.println(pname+":"+money+"("+myMoney+")");
		System.out.println("\t잔액:"+mom);
	}
	
	
}

public class DragonMoneyMain {

	public static void main(String[] args) {
		DragonMoney son = new DragonMoney();
		DragonMoney daughter = new DragonMoney();
		DragonMoney papa = new DragonMoney();
		
		son.pname = "아들";
		daughter.pname = "딸";
		papa.pname = "아빠";
		
		son.showMeTheMoney(10);
		daughter.showMeTheMoney(12);
		daughter.showMeTheMoney(7);
		papa.missionComplete(100);
		son.showMeTheMoney(6);
		papa.showMeTheMoney(10);
		son.showMeTheMoney(5);
		son.missionComplete(50);
		daughter.missionComplete(50);
		daughter.showMeTheMoney(3);

	}

}


/*

아빠가 돈을 벌어오게 해주세요

-- 아빠가 용돈을 받으려고 할때 : 이사람이!!! -> 실행불가

-- 자식이 돈을 벌어올려고 할때 : 건강하게만 자라다오 -> 실행불가

* */
