package excep_p;

import java.util.Scanner;

class Log5DTO{
	final String id, pw, pname;

	public Log5DTO(String id, String pw, String pname) {
		this.id = id;
		this.pw = pw;
		this.pname = pname;
	}
}

public class Log5Main {

	public static void main(String[] args) {
		Log5DTO [] mems = {
				new Log5DTO("aa", "1111", "이효리"),
				new Log5DTO("bb", "2222", "삼효리"),
				new Log5DTO("cc", "3333", "사효리"),
				new Log5DTO("dd", "4444", "오효리"),
				new Log5DTO("ee", "5555", "육효리")
		};
		Scanner sc = new Scanner(System.in);
		
		Log5DTO nowDTO = null;
		
		while(true) {
			try {
				
				System.out.print("id : ");
				String uid = sc.nextLine();
				
				for (Log5DTO dto : mems) {
					if(dto.id.equals(uid)) {
						nowDTO = dto;
						break;
					}
				}
				
				if(nowDTO==null) {
					throw new Exception("id 없음요");
				}
				
				System.out.print("pw : ");
				String upw = sc.nextLine();
				
				if(!nowDTO.pw.equals(upw)) {
					throw new Exception("암호 불일치");
				}
				
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println(nowDTO.pname+"님 안녕하세요");
		
		
		
		

	}

}
