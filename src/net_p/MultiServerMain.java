package net_p;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;

public class MultiServerMain {
	
	
	MultiServerMain() {
		//동시에 clientOuts에 여러개가 삽입되고 삭제되는 것을 막는다. - 스레드 동기화
		Collections.synchronizedList(clientOuts);
		
		try {
			ServerSocket server = new ServerSocket(7777);
			System.out.println("멀티 서버 시작");
			
			//클라이언트 들 받기
			while(true) {
				new MulServerReceiver(server.accept()).start();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	// 클라이언트들의 OutputStream
	ArrayList<DataOutputStream> clientOuts = new ArrayList<DataOutputStream>();
	
	class MulServerReceiver extends Thread{
		String name;
		DataOutputStream dos;
		DataInputStream dis;
		
		MulServerReceiver(Socket socket) {
			try {
				name = "["+socket.getInetAddress()+"]";
				dos = new DataOutputStream(socket.getOutputStream());
				dis = new DataInputStream(socket.getInputStream());
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		@Override
		public void run() {
			try {
				sendToAll(name+"입장");
				clientOuts.add(dos);	//클라이언트들에게 넣기
				sendToAll("접속자 수:"+clientOuts.size());
				
				while(dis!=null) {  //접속이 되어있다면
					sendToAll(dis.readUTF());  // 받아온 내용을 보내기
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			}finally {
				clientOuts.remove(dos);
				sendToAll(name+"퇴장");
				sendToAll("접속자 수:"+clientOuts.size());
			}
		}
	}
	
	
	///모든 클라이언트들에게 보내는 메소드
	void sendToAll(String msg) {
	
		for (DataOutputStream dd : clientOuts) {
			try {
				dd.writeUTF(msg);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	

	public static void main(String[] args) {

		new MultiServerMain();

	}

}
