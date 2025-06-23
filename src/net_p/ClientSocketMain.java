package net_p;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class ClientSocketMain {

	public static void main(String[] args) {

		try {
			String serverIP = "192.168.0.42";
										// 서버IP,  포트번호
			Socket socket = new Socket(serverIP, 7777);
			
			System.out.println(serverIP+" 서버접속 성공");
			

			InputStream is = socket.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			//System.out.println("InputStream 생성");
			
			String rec = dis.readUTF();
			System.out.println("받음 : "+rec);
			

			dis.close();
			is.close();
			//System.out.println("InputStream 종료");
			
		
			socket.close();
			//System.out.println("socket 종료");
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
