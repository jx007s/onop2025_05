package array_p;

public class ArrCutFilterMain {

	public static void main(String[] args) {
		int [] jum = {87,65,82,46,98,65,72,34,91,79,45,67};
		
		for (int i = 0; i < jum.length; i++) {
			System.out.println(jum[i]);
		}
		System.out.println("-----------------");
		
		//향상된 for문 : 배열의 원소를 순차대로 가져온다
		
		int cnt = 0;
		for(int j : jum) {
			if(j>=70) {
				System.out.println(j);
				cnt++;
			}
		}
		
		System.out.println(cnt);
		int [] suc = new int[cnt];
		int pos = 0;
		System.out.println("-----------------");
		for(int j : jum) {
			if(j>=70) {
				System.out.println(j);
				suc[pos] = j;
				pos++;
			}
		}
		
		System.out.println("suc-----------------");
		for (int i : suc) {
			System.out.println(i);
		}

	}

}
