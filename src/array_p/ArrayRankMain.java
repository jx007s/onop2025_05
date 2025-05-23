package array_p;

public class ArrayRankMain {

	public static void main(String[] args) {
		
		
		// 1. 입력부 - 변수, 값을 지정
		String [] pname = {"장동건","장서건","장남건","장중건","북두신건"};
		int [] jum = 	  {  77,     62,    93,     56,     88};
		int [] rank =     {  1,       1,     1,      1,      1};
		
		
		//2. 연산부
		for (int me = 0; me < pname.length; me++) {
			System.out.println(me+":"+jum[me]);
			
			for (int you : jum) {
				
				if(jum[me] <you) {  //내점수보다 비교점수가 높다면
					rank[me]++;  //등수를 내린다
				}
				System.out.println(jum[me] +" : "+you+"=>"+rank[me]);
			}
		}
		
		
		//3. 출력부
		
		for (int i = 0; i < pname.length; i++) {
			String ttt = pname[i]+"\t"+jum[i]+"\t"+rank[i];
			System.out.println(ttt);
		}

	}

}

/*

	메뉴
	아메리카노		2000
	아프리카노		2300
	아시아노		2400

	주문 - 아시아노,아프리카노,아메리카노,아프리카노,아시아노,아메리카노,아프리카노,아프리카노,아시아노

	각 메뉴별 주문 갯수와 판매금액을 배열로 처리하세요
 * */


