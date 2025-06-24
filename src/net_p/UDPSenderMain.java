package net_p;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSenderMain {

	public static void main(String[] args) {

		try {
			DatagramSocket ds = new DatagramSocket();
			
			String msg = "오늘점심은 무엇인가요?";
			
			InetAddress addr = InetAddress.getByName("192.168.0.86");
			
			DatagramPacket data = new DatagramPacket(
					msg.getBytes(), 
					msg.getBytes().length, 
					addr, 
					7777);
			
			ds.send(data);
			
			ds.close();
			
			System.out.println("전송완료");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
