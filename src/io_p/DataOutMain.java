package io_p;


import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutMain {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("zzz/ddff.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			// 기본 스트림을 이용하여 보내기
			
			dos.writeBoolean(true);
			dos.writeByte(123);
			dos.writeShort(300);
			dos.writeInt(1234567);
			dos.writeLong(123456789012L);
			dos.writeFloat(123.456F);
			dos.writeDouble(987.654);
			dos.writeUTF("아기상어 뚜루루뚜루");
			
			dos.close();
			fos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
