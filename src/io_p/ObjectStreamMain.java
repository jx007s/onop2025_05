package io_p;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

class AAA{
	String name;
	int age;
	boolean marriage;
	
	AAA(String name, int age, boolean marriage) {

		this.name = name;
		this.age = age;
		this.marriage = marriage;
	}

	@Override
	public String toString() {
		return "AAA [name=" + name + ", age=" + age + ", marriage=" + marriage + "]";
	}
	
}


// 직렬화된 클래스
class BBB implements Serializable{
	String name;
	int age;
	boolean marriage;
	
	BBB(String name, int age, boolean marriage) {

		this.name = name;
		this.age = age;
		this.marriage = marriage;
	}

	@Override
	public String toString() {
		return "BBB [name=" + name + ", age=" + age + ", marriage=" + marriage + "]";
	}
	
}


public class ObjectStreamMain {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("fff/qaqa.qwe");
			DataOutputStream dos = new DataOutputStream(fos);
			
			dos.writeInt(11);
			dos.writeUTF("아기상어");
			//dos.writeObject(new ArrayList());  Obejct를 보낼 수 없다
			dos.close();
			fos.close();
			
			ArrayList arr = new ArrayList();
			arr.add(135);
			arr.add("아기상어");
			arr.add(new int[] {11,22,33,44});
			arr.add(true);
			
			System.out.println(arr);
			
			fos = new FileOutputStream("fff/qwer.qwe");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeBoolean(true);
			oos.writeByte(123);
			oos.writeShort(300);
			oos.writeInt(1234567);
			oos.writeLong(123456789012L);
			oos.writeFloat(123.456F);
			oos.writeDouble(987.654);
			oos.writeUTF("아기상어 뚜루루뚜루");
			oos.writeObject(arr);  //object 쓰기 가능
			
			//Serializable(직렬화)이 되지않은 객체
			//oos.writeObject(  new AAA("페이커",30,false)   );
			
			
			//Serializable(직렬화) 된 객체
			oos.writeObject(  new BBB("콩진호",22,true)   );
			
			oos.close();
			fos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

/*
직사각형 클래스를 정의하고 직렬화 하여 파일에 데이터를 저장하세요
파일 : fff/rrr.zxc

직사각형 클래스
가로,세로 -> 넓이, 둘레

직사각형 3개

저장된 파일로 부터 직사각형의 정보를 출력하세요
 
 
 * */


