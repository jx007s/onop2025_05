package net_p;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;


//보내기 스레드
class MulClientSender extends Thread{
	Socket socket;
	DataOutputStream dos;
	String name;
	
	MulClientSender(Socket socket) {
		
		this.socket = socket;
		try {
			//name = "["+InetAddress.getLocalHost().getHostAddress()+"]";
			dos = new DataOutputStream(socket.getOutputStream());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("너의이름은:");
			name = "["+sc.nextLine()+"]";
			dos.writeUTF(name);  // 최초 : 이름보내기
			
			while(dos!=null) {
				String str = sc.nextLine();
				dos.writeUTF(name+str);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				dos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
}


//받기 스레드
class MulClientReceiver extends Thread{
	DataInputStream dis;
	
	MulClientReceiver(Socket socket) {
		try {
			dis = new DataInputStream(socket.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		try {
			while(dis!=null) {
				System.out.println(dis.readUTF());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				dis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


public class MultiClientMain {

	public static void main(String[] args) {
		try {
			String serverIP = "192.168.0.86";
			Socket socket = new Socket(serverIP, 7777);
			System.out.println(serverIP + " 연결 성공");
			
			new MulClientSender(socket).start();
			new MulClientReceiver(socket).start();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
