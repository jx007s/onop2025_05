package io_p;

import java.io.FileInputStream;
import java.io.FileReader;

public class FileInMain {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("fff/aaa.txt");
			
			while(fis.available()>0) {
				int data = fis.read();
				
				//System.out.println(data+":"+(char)data);
				System.out.print((char)data);
			}
			fis.close();
			
			System.out.println("\n----------------------");
			
			FileReader fr = new FileReader("fff/aaa.txt");
			
			
			//fr.available();  에러 발생
			
			int data ;
			while( (data = fr.read())  != -1    ) { 
				System.out.print((char)data);
			}
			
			fr.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
