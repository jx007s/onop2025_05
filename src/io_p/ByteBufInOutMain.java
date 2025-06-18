package io_p;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteBufInOutMain {

	public static void main(String[] args) {
		byte [] ori = {3,20,127,3,-128,-2,-3,10,-1,50,111};
		
		try {
			
			ByteArrayInputStream bis = new ByteArrayInputStream(ori);
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			
			byte [] buf = new byte[4];
			
			while(bis.available()>0) {
				int len = bis.read(buf);
				System.out.println(Arrays.toString(buf));
				System.out.println(len);
				
				bos.write(buf, 0, len);
			}
			
			byte [] dst = bos.toByteArray();
			System.out.println("dst : "+Arrays.toString(dst));
			
			bis.close();
			bos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
