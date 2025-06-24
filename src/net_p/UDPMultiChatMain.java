package net_p;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Scanner;

public class UDPMultiChatMain {
	
	String ip = "230.0.0.1";
	int port = 7777;
	
	class UDPMultiChatSender extends Thread{
		@Override
		public void run() {
			
			Scanner sc = new Scanner(System.in);
			try {
				while(true) {
					MulticastSocket ms = new MulticastSocket();
					InetAddress addr = InetAddress.getByName(ip);
					String msg = sc.nextLine();
					
					DatagramPacket data = new DatagramPacket(
							msg.getBytes(),
							msg.getBytes().length, 
							addr, 
							port);
					
					ms.send(data);
					
					ms.close();
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		
		}
	}
	
	class UDPMultiChatReceiver extends Thread{
		@Override
		public void run() {
			try {
				
				InetAddress addr = InetAddress.getByName(ip);
				
				while(true) {
					MulticastSocket ms = new MulticastSocket(port);
					
					ms.joinGroup(addr);
					
					byte [] arr = new byte[1024];
					
					DatagramPacket data = new DatagramPacket(arr, arr.length);
					
					ms.receive(data);
					
					System.out.println("["+data.getAddress()+"]"+new String(arr));
					
					ms.leaveGroup(addr);
					ms.close();
				}
				
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	UDPMultiChatMain() {
		new UDPMultiChatSender().start();
		new UDPMultiChatReceiver().start();
	}

	public static void main(String[] args) {
		new UDPMultiChatMain();

	}

}
