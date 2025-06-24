package net_p;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

class UDPChatSender extends Thread{
	@Override
	public void run() {
		
		Scanner sc = new Scanner(System.in);
		try {
			
			InetAddress addr = InetAddress.getByName("192.168.0.86");
			
			
			while(true) {
				String msg = sc.nextLine();
				DatagramSocket ds = new DatagramSocket();
				DatagramPacket data = new DatagramPacket(
						msg.getBytes(), 
						msg.getBytes().length, 
						addr, 
						7777);
				
				ds.send(data);
				
				ds.close();
			}
			
			
			//System.out.println("전송완료");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class UDPChatReceiver extends Thread{
	@Override
	public void run() {
		try {
			
			while(true) {
				DatagramSocket ds = new DatagramSocket(7777);
				
				byte [] arr = new byte[1024];
				
				DatagramPacket data = new DatagramPacket(arr, arr.length);
				
				ds.receive(data);
				
				//System.out.println(data.getAddress());
				//System.out.println(new String(arr));
				System.out.println("["+data.getAddress()+"]"+new String(arr));
				ds.close();
			}
			//System.out.println("수신완료");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class UDPChatMain {

	public static void main(String[] args) {

		new UDPChatSender().start();
		new UDPChatReceiver().start();
	}

}
