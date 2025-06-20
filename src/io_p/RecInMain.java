package io_p;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class RecInMain {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("fff/rrr.zxc");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			int cnt = ois.readInt();
			
			for (int i = 0; i < cnt; i++) {
				RectData rd = (RectData)ois.readObject();
				System.out.println(rd);
			}
			
			
			ois.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
