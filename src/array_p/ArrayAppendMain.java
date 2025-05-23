package array_p;

import java.util.Arrays;

public class ArrayAppendMain {

	public static void main(String[] args) {
		
		// 44를 뒤에 추가
		int [] arr = {11,22,33};
		
		System.out.println("바뀌기 전 : "+arr+Arrays.toString(arr));
		
		//int [] buf = {arr[0],arr[1],arr[2],44};
		int [] buf = new int[arr.length+1];  //원본배열의 길이+1 로 배열 생성
		
		for (int i = 0; i < arr.length; i++) {
			buf[i] = arr[i];
		}
		
		//buf[3] = 44;
		buf[arr.length] = 44;
		
		arr = buf;
		
		System.out.println("바뀐 후 : "+arr+Arrays.toString(arr));
		
		buf = new int[arr.length-1];
		System.out.println("buf : "+buf+Arrays.toString(buf));
		for (int i = 0; i < buf.length; i++) {
			buf[i] = arr[i];
		}
		arr = buf;
		System.out.println("바뀐 후 : "+arr+Arrays.toString(arr));
	}

}
