package io_p;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;

// File 폴더의 파일을 각각 종류별로 지정 폴더에 저장하시오
/// 하위 폴더까지 검색하세요
/// 같은 파일명인 경우 중복 처리 하세요

//zxcv/이미지
//zxcv/이미지 : bmp, jpg, gif, png , jpeg
//zxcv/음악 : mp3, wma, wav
//zxcv/문서 :doc, hwp, ppt, xls, pptx, xlsx. docx
//zxcv/기타 : 위의 분류 이외
//확장자의 대소문자 구분하지 않음

public class FileExtMain {
	
	HashMap<String, String> extMap;
	
	FileExtMain() {
		extMap = new HashMap<String, String>();
		for (String tt : "bmp,jpg,gif,png,jpeg".split(",")) {
			extMap.put(tt, "이미지");
		}
		for (String tt : "mp3,wma,wav".split(",")) {
			extMap.put(tt, "음악");
		}
		for (String tt : "doc,hwp,ppt,xls,pptx,xlsx,docxv".split(",")) {
			extMap.put(tt, "문서");
		}
		System.out.println(extMap);
		
		dirGo(new File("File"));
	}
	
	void dirGo(File ff) {
		//System.out.println(ff.getName()+" --------- ");
		File [] arr = ff.listFiles();
		for (File file : arr) {
			if(file.isFile()) {
				int pos =  file.getName().lastIndexOf(".");
				String domain = file.getName().substring(0,pos);
				String ext = file.getName().substring(pos+1);
				String dirName = "기타";
				if(extMap.containsKey(ext.toLowerCase())) {
					dirName=extMap.get(ext.toLowerCase());
				}
				//System.out.println(file.getName()+":"+ext+","+dirName);
				
				dirName = "zxcv/"+dirName;
				if(!new File(dirName).exists()) {
					new File(dirName).mkdirs();
				}
				
				String newName = dirName+"/"+file.getName();
				
				int cnt = 1;
				while(new File(newName).exists()) {
					//System.out.println(newName+"있지요");
					
					newName = dirName+"/"+domain+"_"+cnt+"."+ext;
					cnt++;
				}
				
				try {
					Files.copy(
							file.toPath(), 
							new FileOutputStream(newName));
				
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}else {
				dirGo(file);
			}
		}
	}

	public static void main(String[] args) {
		new FileExtMain();

	}

}
