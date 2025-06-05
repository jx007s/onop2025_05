package inner_p;

class CoffeeShop{
	String name;
	String [] menu = {"아메리카노","아프리카노","아시아노"};
	int [] price;
	int [] cnt = new int[menu.length];
	
	CoffeeShop(String name, int ame, int afr, int asia) {
		this.name = name;
		price = new int[] {ame, afr, asia};
	}
	
	void ppp() {
		System.out.println(name+" >>>");
		int tot = 0;
		for (int i = 0; i < cnt.length; i++) {
			int money = price[i]*cnt[i];
			tot+=money;
			System.out.println(menu[i]+"\t"+price[i]+"\t"+cnt[i]+"\t"+money);
		}
		System.out.println("합계 : "+tot);
	}
	
	class Branch{
		String name;
		int [] cnt = new int[menu.length];
		
		Branch(String name) {
			this.name = name;
		}
		
		void ppp() {
			System.out.println("["+CoffeeShop.this.name+" "+name+"]");
			int tot = 0;
			for (int i = 0; i < cnt.length; i++) {
				int money = price[i]*cnt[i];
				tot+=money;
				System.out.println(menu[i]+"\t"+price[i]+"\t"+cnt[i]+"\t"+money);
			}
			System.out.println("지점 합계 : "+tot);
		}
		
		void order(String mm) {
			int no = -1;
			for (int i = 0; i < menu.length; i++) {
				if(menu[i].equals(mm)) {
					no = i;
					break;
				}
			}
			if(no==-1) {
				System.out.println(mm+" 없는 메뉴 다시해줭");
				return;
			}
			String ttt = CoffeeShop.this.name+" "+name+" : "+mm;
			ttt += "("+price[no]+")";
			System.out.println(ttt);
			cnt[no]++;
			CoffeeShop.this.cnt[no]++;
		}
	}
}

public class CoffeeShopMain {

	public static void main(String[] args) {
		CoffeeShop cs1 = new CoffeeShop("하삼동", 2000, 2300, 2700);
		CoffeeShop cs2 = new CoffeeShop("상남동", 2100, 2500, 2200);
		
		CoffeeShop.Branch [] brs = {
			cs1.new Branch("창원"),
			cs1.new Branch("진주"),
			cs1.new Branch("김해"),
			cs2.new Branch("창원"),
			cs2.new Branch("부산"),
			cs2.new Branch("통영")
		};
		
		brs[0].order("아메리카노");
		brs[1].order("아메리카노");
		brs[3].order("아프리카노");
		brs[2].order("아메리카노");
		brs[3].order("아시아노");
		brs[4].order("유럽이노");
		brs[3].order("아시아노");
		brs[1].order("호주노");
		brs[5].order("아메리카노");
		brs[2].order("아메리카노");
		brs[0].order("아프리카노");
		brs[0].order("아메리카노");
		brs[1].order("아시아노");
		brs[2].order("유럽이노");
		brs[4].order("아시아노");
		brs[5].order("호주노");
		
		for (CoffeeShop.Branch branch : brs) {
			branch.ppp();
		}
		cs1.ppp();
		cs2.ppp();

	}

}
