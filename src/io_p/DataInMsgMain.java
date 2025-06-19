package io_p;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInMsgMain {

	public static void main(String[] args) {
		
		while(true) {
			fileReadGo();
			
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	static int size = 0;
	
	static void fileReadGo() {
		
		System.out.println("-----------------------------");
		try {
			FileInputStream fis = new FileInputStream("zzz/data_msg.txt");
			DataInputStream dis = new DataInputStream(fis);
			
			if(size!=fis.available()) {
				
				size = fis.available();
				
				while(fis.available()>0) {
					System.out.println(dis.readUTF());
				}
			}
			

			dis.close();
			fis.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	

}
