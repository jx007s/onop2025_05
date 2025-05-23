package array_p;
/*

	메뉴
	아메리카노		2000
	아프리카노		2300
	아시아노		2400
	
	주문 - 아시아노,아프리카노,아메리카노,아프리카노,아시아노,아메리카노,아프리카노,아프리카노,아시아노
	
	각 메뉴별 주문 갯수와 판매금액을 배열로 처리하세요
* */
public class CoffeeOrderMain {

	public static void main(String[] args) {
		
		// 입력부
		String [] menu = {"아메리카노","아프리카노","아시아노"};
		int [] price =   {  2000,      2300,    2400};
		int [] cnt = new int[menu.length];
		
		String [] order = {"아시아노","아프리카노","아메리카노","아프리카노","아시아노","아메리카노","아프리카노","아프리카노","아시아노"};

		// 연산부
		for (int m = 0; m < menu.length; m++) {
			for (String tt : order) {
				//System.out.println(tt);
				if(menu[m]==tt) {
					cnt[m]++;
				}
			}
			
		}
		
		//출력부
		for (int m = 0; m < menu.length; m++) {
			String zx = m+":"+menu[m]+","+cnt[m]+","+price[m]+","+cnt[m]*price[m];
			System.out.println(zx);
		}
		
	}

}
