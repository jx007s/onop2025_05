package io_p;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedMain {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("fff/aaa.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String line=null;
			for (int i = 0; (line=br.readLine())!=null; i++) {
				System.out.println(i+" : "+line);
			}
			
			br.close();
			fr.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}

/*
 fff/member.txt
  
aaa,1111,임꺽정
bbb,2222,홍길동
ccc,3333,일지매
ddd,4444,백동수 
eee,5555,임우정 


id, pw 를 입력받아 로그인을 구현하세요
회원정보는  fff/member.txt 에서 확인
 
id : eee,  pw : 5555

임우정님 안녕하세요

 
 * */

