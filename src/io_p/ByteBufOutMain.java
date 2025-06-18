package io_p;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteBufOutMain {

	public static void main(String[] args) {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		byte [] buf = {12,34,56,78,90};
		byte [] buf2 = {101,102,103,104,105};

		try {
			
			bos.write(buf);
			
			
			// {101,102,103,104,105}
			//   0   1    2   3  4
			//            2부터 3개
			bos.write(buf2, 2, 3);
			
			byte [] dst = bos.toByteArray();
			System.out.println(Arrays.toString(dst));
			
			
			bos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
