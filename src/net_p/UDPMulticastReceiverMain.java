package net_p;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class UDPMulticastReceiverMain {

	public static void main(String[] args) {

		try {
			MulticastSocket ms = new MulticastSocket(7777);
			InetAddress addr = InetAddress.getByName("230.0.0.2");
			ms.joinGroup(addr);
			
			byte [] arr = new byte[1024];
			DatagramPacket data = new DatagramPacket(arr, arr.length);
			
			ms.receive(data);
			
			System.out.println(data.getAddress());
			System.out.println(new String(arr));
			
			
			ms.leaveGroup(addr);
			ms.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
