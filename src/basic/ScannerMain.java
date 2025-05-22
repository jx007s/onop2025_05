package basic;

import java.util.Scanner;

public class ScannerMain {
	
	public static void main(String[] args) {
		
		int a = 10;
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("이름:");
//		String pname = sc.nextLine();
//		System.out.println(pname);
//		
//		System.out.print("시력:");
//		float ff = sc.nextFloat();
//		System.out.println(ff);
//		
//		System.out.print("키:");
//		double dd = sc.nextDouble();
//		System.out.println(dd);
		
//		System.out.print("나이:");
//		int age = sc.nextInt();
//		System.out.println(age);
		
		
		System.out.print("이름:");
		String pname = sc.nextLine();
		System.out.println(pname);
		
		System.out.print("별명:");
		String nick = sc.next();
		System.out.println(nick);
		
		System.out.print("주소:");
		String addr = sc.next();
		System.out.println(addr);

	}

}
