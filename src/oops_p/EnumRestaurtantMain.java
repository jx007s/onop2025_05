package oops_p;

enum Resttt{
	
	KC("김치찌개",6000), DJ("된장찌개",5500), MIL("부대찌개",7000);

	String name;
	int price;
	int cnt = 0;
	private Resttt(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	void add(int cnt) {
		
		this.cnt += cnt;
	}
	
	@Override
	public String toString() {
		
		return name+"\t"+price+"\t"+cnt+"\t"+(price*cnt);
	}
}
public class EnumRestaurtantMain {
	
	void order(String menu, int cnt) {
		Resttt rt = Resttt.valueOf(menu);
		rt.add(cnt);
		System.out.println(rt.name+" "+cnt+"개 주문이요 : "+rt.price*cnt);
	}
	
	void order(String menus) {
		String ttt = "";
		int tot = 0;
		for (String mm: menus.split(",")) {
			Resttt rt = Resttt.valueOf(mm);
			rt.add(1);
			ttt += rt.name+",";
			tot += rt.price;
		}
		System.out.println(ttt+" : "+tot);
	}
	
	//정산
	void adjustment() {
		System.out.println("정산 >>>");
		int tot = 0;
		for (Resttt rt : Resttt.values()) {
			System.out.println(rt);
			tot += rt.price*rt.cnt;
		}
		System.out.println("합계 : "+tot);
	}
	
	public EnumRestaurtantMain() {
		order("KC", 2);
		order("DJ", 1);
		order("MIL", 3);
		order("KC,MIL,DJ,DJ");
		order("KC", 2);
		
		
		adjustment();
	}

	public static void main(String[] args) {
		new EnumRestaurtantMain();

	}

}

/*
커피를 주문하세요
    아메리카노:2000
    아시아노:2300
    아프리카노:2700
 
    주문서1 : AMERICANO_2,ASIANO_3,AFRICANO_1
    주문서2 : AFRICANO_2,ASIANO_1
    주문서3 : AFRICANO_2,AMERICANO_1,ASIANO_2
 
    출력
    주문서1 : 아메리카노:2(4000) , 아시아노:3(6900) , 아프리카노:1(2700) , :13600
    주문서2 : 아프리카노:2(5400) , 아시아노:1(2300) , :7700
    주문서3 : 아프리카노:2(5400) , 아메리카노:1(2000) , 아시아노:2(4600) , :12000
    total----------------------
     아메리카노:3(6000)
     아시아노:6(13800)
     아프리카노:5(13500)
    ----------------------
              ?
 * */

