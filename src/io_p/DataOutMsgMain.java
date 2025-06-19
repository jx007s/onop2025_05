package io_p;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class DataOutMsgMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("입력:");
			
			String msg = sc.nextLine().trim();
			
			if(msg.equals("")) {
				break;
			}
			
			fileWriteGo(msg);
		}
		
		System.out.println("시스템 종료");
		

	}
	static void fileWriteGo(String ttt) {
		try {
			FileOutputStream fos = new FileOutputStream("zzz/data_msg.txt", true);
			DataOutputStream dos = new DataOutputStream(fos);
			// 기본 스트림을 이용하여 보내기
			dos.writeUTF(ttt);
			
			dos.close();
			fos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}

}
