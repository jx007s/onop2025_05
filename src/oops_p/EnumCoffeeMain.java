package oops_p;

enum EnumCoffee{
	AMERICANO("아메리카노",2000),ASIANO("아시아노",2300),AFRICANO("아프리카노",2700);
	
	String name;
	int price;
	int cnt=0;
	private EnumCoffee(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	int add(int cnt) {
		this.cnt += cnt;
		return price*cnt;
	}
	
	@Override
	public String toString() {
		
		return name+":"+cnt+"("+(price*cnt)+")";
	}
}

public class EnumCoffeeMain {
	
	void order(String ttt) {
		// String ttt = "AFRICANO_2,AMERICANO_1,ASIANO_2";
		
		int tot = 0;
		String str = "";
		
		//{"AFRICANO_2","AMERICANO_1","ASIANO_2"}  
		
		for (String ord : ttt.split(",")) {
			String [] arr = ord.split("_");
			//System.out.println(arr[0]);
			//System.out.println(arr[1]);
			
			EnumCoffee coffee = EnumCoffee.valueOf(arr[0]);
			int money = coffee.add(Integer.parseInt(arr[1]));
			str += coffee.name+":"+arr[1]+"("+money+") , ";
			tot += money;
			
		}
		System.out.println(str+":"+tot);
	}
	
	//정산
		void adjustment() {
			System.out.println("total----------------------");
			int tot = 0;
			for (EnumCoffee rt : EnumCoffee.values()) {
				System.out.println(rt);
				tot += rt.price*rt.cnt;
			}
			System.out.println("----------------------");
			System.out.println("합계 : "+tot);
		}
	
	EnumCoffeeMain(){
		order("AMERICANO_2,ASIANO_3,AFRICANO_1");
		order("AFRICANO_2,ASIANO_1");
		order("AFRICANO_2,AMERICANO_1,ASIANO_2");
		order("AFRICANO_3","AMERICANO_4","ASIANO_2");
		order("AMERICANO_2","ASIANO_1");
		adjustment();
	}

	public static void main(String[] args) {
		
		new EnumCoffeeMain();

	}

}
