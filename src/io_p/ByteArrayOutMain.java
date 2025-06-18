package io_p;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteArrayOutMain {

	public static void main(String[] args) {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		bos.write(123);
		bos.write(128);
		bos.write(129);
		bos.write(130);
		bos.write(254);
		bos.write(255);
		bos.write(256);
		bos.write(10);
		bos.write(20);
		bos.write(30);
		
		byte [] dst = bos.toByteArray();
		System.out.println(Arrays.toString(dst));
		
		try {
			bos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
