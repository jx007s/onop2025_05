package io_p;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ObjectInMain {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("fff/qwer.qwe");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			System.out.println(ois.readBoolean());
			System.out.println(ois.readByte());
			System.out.println(ois.readShort());
			System.out.println(ois.readInt());
			System.out.println(ois.readLong());
			System.out.println(ois.readFloat());
			System.out.println(ois.readDouble());
			System.out.println(ois.readUTF());
			
			// Object로 받은 객체를 형변환하여 사용 가능
			ArrayList arr= (ArrayList)ois.readObject();
			System.out.println(arr);
			for (Object obj : arr) {
				System.out.println(obj);
			}
			
			BBB b1 =  (BBB)ois.readObject();
			System.out.println(b1);
			System.out.println(b1.name);
			System.out.println(b1.age);
			System.out.println(b1.marriage);
			
			ois.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
