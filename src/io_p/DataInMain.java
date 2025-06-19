package io_p;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInMain {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("zzz/ddff.txt");
			DataInputStream dis = new DataInputStream(fis);
			
//			dos.writeBoolean(true);
//			dos.writeByte(123);
//			dos.writeShort(300);
//			dos.writeInt(1234567);
//			dos.writeLong(123456789012L);
//			dos.writeFloat(123.456F);
//			dos.writeDouble(987.654);
//			dos.writeUTF("아기상어 뚜루루뚜루");
			
			System.out.println(dis.readBoolean());
			System.out.println(dis.readByte());
			//System.out.println(dis.readShort());
			System.out.println(dis.readInt());
			System.out.println(dis.readLong());
			System.out.println(dis.readFloat());
			
			System.out.println(dis.readShort());
			
			System.out.println(dis.readDouble());
			System.out.println(dis.readUTF());
			
			
			dis.close();
			fis.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
