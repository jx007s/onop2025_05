package io_p;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyMain {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("fff/face.jpg");
			FileOutputStream fos = new FileOutputStream("zzz/wife.jpg");
			
			byte [] buf = new byte[fis.available()];
			
			fis.read(buf);
			fos.write(buf);
			
			fos.close();
			fis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
