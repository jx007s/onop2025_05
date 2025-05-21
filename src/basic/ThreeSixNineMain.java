package basic;

public class ThreeSixNineMain {

	public static void main(String[] args) {
		// 1 -> 20 반복
		// 3,6,9 글자가 있으면 '짝' 출력
		
		
		// 1 -> 20 반복
		for (int i = 1; i <=20; i++) {
			//초기값  ;   조건   ;  증감
			
			
			// 3,6,9 글자가 있으면 '짝' 출력
			/*
			if(i == 3  || i == 6  || i == 9 ||
			   i == 13 || i == 16 || i == 19) {
				System.out.println("짝");
			}else {
				System.out.println(i);
			}
			
			
			//System.out.println(i+" , "+i%3+" , "+(i%3==0));
			
			if(i%3==0) {
				System.out.println("짝");
			}else {
				System.out.println(i);
			}*/

			int one = i % 10;
			//System.out.println(i+" , "+one+" , "+one%3+" , "+(one%3==0));
			
			if(one%3==0 && one!=0) {
				System.out.println("짝");
			}else {
				System.out.println(i);
			}
		}

	}

}
