package io_p;

import java.io.FileReader;
import java.io.FileWriter;

public class CharCopyMain {

	public static void main(String[] args) {
		try {
			// 파일 복사 : 1 byte 기반 스트림 이용
			// 파일의 문자열내용 보기 : 2 byte 기반 스트림 이용
			//  txt, csv 와 같은 원시문자형태
			
			FileReader fr = new FileReader("fff/face.jpg");
			FileWriter fw = new FileWriter("zzz/mmm.jpg");
			int data;
			while((data=fr.read())!=-1) {
				fw.write(data);
			}
			fw.close();
			fr.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
