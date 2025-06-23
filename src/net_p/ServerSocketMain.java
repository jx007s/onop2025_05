package net_p;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketMain {

	public static void main(String[] args) {
		ServerSocket server = null;
		
		try {
			
			//System.out.println("1. 서버 생성");
			//		    port : 7777
			server = new ServerSocket(7777);
			
	
			while(true) {
			
				//System.out.println("2. 클라이언트 접속 대기");
				Socket client = server.accept();
				
				System.out.println(client.getInetAddress()+" 접속");
				
	
				OutputStream os = client.getOutputStream();
				DataOutputStream dos = new DataOutputStream(os);
				//System.out.println("OutputStream 생성");
				
				dos.writeUTF("여기는 강사랜드");
				
				dos.close();
				os.close();
				//System.out.println("OutputStream 종료");
				
				client.close();
				//System.out.println("client 접속종료");			
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
