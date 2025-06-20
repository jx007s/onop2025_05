package io_p;

import java.io.File;
import java.util.Date;

public class FileMain {

	public static void main(String[] args) {
		File ff =  new File("fff/kkk.txt");

		///파일 정보 
		System.out.println("ff:"+ff);
		System.out.println("존재유무:"+ff.exists());
		System.out.println("파일인지:"+ff.isFile());
		System.out.println("폴더인지:"+ff.isDirectory());
		System.out.println("절대주소인지:"+ff.isAbsolute());
		System.out.println("부모폴더:"+ff.getParent());
		System.out.println("이름:"+ff.getName());
		System.out.println("절대경로:"+ff.getAbsolutePath());
		System.out.println("숨김파일인지:"+ff.isHidden());
		System.out.println("읽기가능:"+ff.canRead());
		System.out.println("쓰기가능:"+ff.canWrite());
		System.out.println("파일크기:"+ff.length());
		System.out.println("마지막수정시각:"+new Date(ff.lastModified()) );
	}

}
