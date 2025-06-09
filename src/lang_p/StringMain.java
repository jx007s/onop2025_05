package lang_p;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringMain {

	public static void main(String[] args) {
		String aa = "아기qw12#$";
		String bb = "아기qw12#$";
		String cc = new String("아기qw12#$");

		System.out.println("aa ---");
		System.out.println(aa);
		System.out.println(aa.toString());
		System.out.println(aa.hashCode());
		System.out.println("bb ---");
		System.out.println(bb);
		System.out.println(bb.toString());
		System.out.println(bb.hashCode());
		System.out.println("아기qw12#$ ---");
		System.out.println("아기qw12#$");
		System.out.println("아기qw12#$".toString());
		System.out.println("아기qw12#$".hashCode());
		System.out.println("cc ---");
		System.out.println(cc);
		System.out.println(cc.toString());
		System.out.println(cc.hashCode());
		System.out.println(aa==bb);
		System.out.println(aa=="아기qw12#$");
		System.out.println(aa==cc);
		System.out.println(aa.equals(bb));
		System.out.println(aa.equals("아기qw12#$"));
		System.out.println(aa.equals(cc));
		
		char [] chArr = {'아','기','q','w','1','2','#','$'};
		//문자배열을 직접 String으로 대입 불가
		//String dd = chArr;
		String ee = new String(chArr);
		System.out.println(ee);
		System.out.println(ee.hashCode());
		
		String f = "선생님은 귀여워요 aBcD eF JavA 만세 12a3a4";
		//          0 123 45 67 8901234567890123 45678901
		System.out.println(f);
		//subString : 문자열 추출
		System.out.println("length() : "+f.length());
		System.out.println("substring(24) : "+f.substring(24));  		//24-->끝
		System.out.println("substring(24, 30) : "+f.substring(24, 30));  	//24-->29
		char ch = f.charAt(7);	// arr[7]
		System.out.println("charAt(7) : "+ch);
		// 현재 문자열 원소를 변경하는 것은 불가
		//f.charAt(7) = 'd';
		System.out.println("indexOf(\"Bc\") : "+f.indexOf("Bc"));
		System.out.println("indexOf(\"zxcv\") : "+f.indexOf("zxcv")); //없으면 -1
		System.out.println("indexOf(\"a\") : "+f.indexOf("a"));
		System.out.println("indexOf(\"a\", 12) : "+f.indexOf("a", 12));
														//찾는값, 시작위치
		System.out.println("indexOf(\"a\", 12,17) : "+f.indexOf("a", 12,17)); 
														//찾는값, 시작위치, 끝위치+1
												// a를 12 -> 16 사이에서 찾음
		System.out.println("lastIndexOf(\"a\") : "+f.lastIndexOf("a"));
		System.out.println("lastIndexOf(\"a\",26) : "+f.lastIndexOf("a",26));
		System.out.println("contains(\"aBc\") : "+f.contains("aBc"));
		System.out.println("contains(\"qwe\") : "+f.contains("qwe"));
		System.out.println("startsWith(\"선생\") : "+f.startsWith("선생"));
		System.out.println("startsWith(\"님은\") : "+f.startsWith("님은"));
		System.out.println("endsWith(\"3a4\") : "+f.endsWith("3a4"));
		System.out.println("endsWith(\"12a3\") : "+f.endsWith("12a3"));
		
		String ttt = "정우성,감우성,행주산성_진주성,안시성.꼭시성";
		String [] arr = ttt.split(",");
		String [] arr1 = ttt.split(",",2);
		
		System.out.println(Arrays.toString(arr)+":"+arr.length);
		System.out.println(Arrays.toString(arr1)+":"+arr1.length);
		//문자열 => 문자열배열
		String [] arr2 = ttt.split("[.]");
		System.out.println(Arrays.toString(arr2)+":"+arr2.length);
		
		StringTokenizer stk = new StringTokenizer(ttt, ",.");
		System.out.println(stk.hasMoreElements());//다음항목이 있는가
		while(stk.hasMoreElements()) {
			System.out.println(stk.nextElement());//항목 꺼내기
		}
		
		String [] arr3 = {"차은우","자전거은우","비행기은우","바이크은우","킥보드은우"};
		//문자열배열 => 문자열
		String qqq = String.join("@", arr3);
		System.out.println(qqq);
		
		//int [] arr4 = {111,22,333,444};
		//String rrr = String.join("@", arr4);
		//내사진.jpg
        //숙제.java
        //aasseedd.파일.최종.진짜.마지막.끝.수정.1.ppt
		String [] ffs = "내사진.jpg,숙제.java,aasseedd.파일.최종.진짜.마지막.끝.수정.1.ppt".split(",");
		
		for (String ff : ffs) {
			String [] bbs = ff.split("[.]");
			System.out.println(Arrays.toString(bbs)+bbs.length);
			System.out.println(bbs[bbs.length-1]);
		}
		
		System.out.println(f.toUpperCase());
		System.out.println(f.toLowerCase());
		
		//"aBcd Efg HIJk lMn opQR" -> Abcd Efg Hijk Lmn Opqr  로 변경해 주세요
	}

}
