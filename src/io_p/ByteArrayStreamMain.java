package io_p;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteArrayStreamMain {

	public static void main(String[] args) {
		byte [] ori = {3,20,127,3,-128,-2,-3,10,-1,50,111};
		
		System.out.println(Arrays.toString(ori));
		System.out.println(ori.length);

		//1. stream 생성
		ByteArrayInputStream bis = new ByteArrayInputStream(ori);
		System.out.println("bis 선언 및 생성");
//		System.out.println("남은갯수 : "+bis.available());
//		int i = bis.read();
//		System.out.println(i);
//		System.out.println("남은갯수 : "+bis.available());
//		i = bis.read();
//		System.out.println(i);
//		System.out.println("남은갯수 : "+bis.available());
//		i = bis.read();
//		System.out.println(i);
//		System.out.println("남은갯수 : "+bis.available());
//		i = bis.read();
//		System.out.println(i);
//		System.out.println("남은갯수 : "+bis.available());
//		i = bis.read();
//		System.out.println(i);
//		System.out.println("남은갯수 : "+bis.available());
//		i = bis.read();
//		System.out.println(i);
//		System.out.println("남은갯수 : "+bis.available());
//		i = bis.read();
//		System.out.println(i);
//		System.out.println("남은갯수 : "+bis.available());
//		i = bis.read();
//		System.out.println(i);
//		System.out.println("남은갯수 : "+bis.available());
//		i = bis.read();
//		System.out.println(i);
//		System.out.println("남은갯수 : "+bis.available());
//		i = bis.read();
//		System.out.println(i);
//		System.out.println("남은갯수 : "+bis.available());
//		i = bis.read();
//		System.out.println(i);
//		System.out.println("남은갯수 : "+bis.available());
//		i = bis.read();		//리턴이 -1 인 경우 없다라는 뜻
//		System.out.println(i);
//		System.out.println("남은갯수 : "+bis.available());
		
		/*
		 byte							int
		 0000 0000 		0		0		0000 0000 0000 0000 0000 0000 0000 0000
		 0000 0001 		1		1		0000 0000 0000 0000 0000 0000 0000 0001
		 0000 0010 		2		2		0000 0000 0000 0000 0000 0000 0000 0010
		 0000 0011 		3		3		0000 0000 0000 0000 0000 0000 0000 0011
		 ...
		 0111 1110		126		126		0000 0000 0000 0000 0000 0000 0111 1110
		 0111 1111		127		127		0000 0000 0000 0000 0000 0000 0111 1111
		 1000 0000 		-128	128		0000 0000 0000 0000 0000 0000 1000 0000
		 1000 0001 		-127	129		0000 0000 0000 0000 0000 0000 1000 0001
		 1000 0010 		-126	130		0000 0000 0000 0000 0000 0000 1000 0010
		 1111 1101		-3		253		0000 0000 0000 0000 0000 0000 1111 1101
		 1111 1110		-2		254		0000 0000 0000 0000 0000 0000 1111 1110
		 1111 1111		-1		255		0000 0000 0000 0000 0000 0000 1111 1111
	   1 0000 0000 		0		256		0000 0000 0000 0000 0000 0001 0000 0000

		 * */
		
		while(bis.available()>0) {
			int data = bis.read();
			System.out.println(data+":"+(byte)data);
		}
		
		
		try {
			bis.close();
			System.out.println("bis 닫기");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
