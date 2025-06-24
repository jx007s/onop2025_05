package net_p;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class UDPMulticastSenderMain {

	public static void main(String[] args) {
		try {
			MulticastSocket ms = new MulticastSocket();
			String msg = "푸른하늘 은하수는 갤럭시";
			InetAddress addr = InetAddress.getByName("230.0.0.1");
			
			DatagramPacket data = new DatagramPacket(
					msg.getBytes(), 
					msg.getBytes().length, 
					addr, 
					7777);
			
			ms.send(data); 
			ms.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
