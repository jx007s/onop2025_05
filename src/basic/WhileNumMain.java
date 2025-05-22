package basic;

import java.util.Scanner;

public class WhileNumMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int total = 0, cnt = 0, two = 0, three = 0;

		System.out.println("숫자를 입력하세요");
		
		while(true) {
			System.out.print("입력(0 입력시 종료) : ");
			int no = sc.nextInt();
			
			if(no==0) {
				break;
			}
			
			total += no;
			cnt++;
			
			if(no%2==0) {
				two++;
			}
			if(no%3==0) {
				three++;
			}
				
			
		}
		
		System.out.println("결과 : "+total+","+cnt+","+total/cnt);
		System.out.println("2의배수 : "+two+", 3의 배수 : "+three);

	}
	
	// 입력받은 숫자중 2의 배수, 3의 배수의 갯수를 출력하세요
	
	// 소수가 어느것인지 출력하세요
	
	

}
