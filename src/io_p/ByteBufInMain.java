package io_p;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteBufInMain {

	public static void main(String[] args) {

		byte [] ori = {3,20,127,3,-128,-2,-3,10,-1,50,111};
		
		ByteArrayInputStream bis1 = new ByteArrayInputStream(ori);
		ByteArrayInputStream bis2 = new ByteArrayInputStream(ori);
		ByteArrayInputStream bis3 = new ByteArrayInputStream(ori);
		
		byte [] buf = new byte[5];
		byte [] buf3 = new byte[5];
		
		int cnt = 0;
		while(bis1.available()>0) {
			int data = bis1.read();
			System.out.println(data+":"+(byte)data);
			cnt++;
		}
		System.out.println("bis1 : "+cnt);
		
		try {
			System.out.println(Arrays.toString(buf));
			int len = bis2.read(buf);
			System.out.println(Arrays.toString(buf));
			System.out.println(len);
			len = bis2.read(buf);
			System.out.println(Arrays.toString(buf));
			System.out.println(len);
			len = bis2.read(buf);
			System.out.println(Arrays.toString(buf));
			System.out.println(len);
			
			System.out.println("bis3--------");
			System.out.println(Arrays.toString(buf3));
			len = bis3.read(buf3,1,2);
			System.out.println(Arrays.toString(buf3));
			System.out.println(len);
		
		
			bis1.close();
			bis2.close();
			bis3.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
