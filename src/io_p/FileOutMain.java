package io_p;

import java.io.FileOutputStream;

public class FileOutMain {

	public static void main(String[] args) {
		try {
			
			FileOutputStream fos = new FileOutputStream("zzz/bbb.txt", false);
			// 생략 or false : 새로쓰기
			//     true     : 추가 - append
			
			String msg = "해도돼요?\n";
			fos.write(msg.getBytes());
			
			fos.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
