package net_p;

import java.net.Socket;

public class SingleClientMain {

	public static void main(String[] args) {
		try {
			String serverIP = "192.168.0.86";
			Socket socket = new Socket(serverIP, 7777);
			System.out.println(serverIP + " 연결 성공");
			
			new SingleSender(socket).start();
			new SingleReceiver(socket).start();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
