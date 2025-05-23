package array_p;

import java.util.Arrays;

public class MulExamMain {

	public static void main(String[] args) {
		
		int a = 10;
		
		//a = a + 5;
		a += 5;
		System.out.println(a);
		
		String q= "아기상어";
		//q = q + "뚜루루뚜루";
		q += "뚜루루뚜루";
		q += 123+","+456;
		System.out.println(q);
		
		// 입력부
		String [] pname = {"차금우","차은우","차동우","차철우"};
		
		int [][] jum = {
				{77,79,72},	//차금우
				{97,99,92},	//차은우
				{67,69,62},	//차동우
				{87,89,82}	//차철우
		};
		
		//int [] tot = new int[pname.length];
		//int [] avg = new int[pname.length];
		
		int [][] res = {
				new int[pname.length],	//총점 : res[0]
				new int[pname.length] 	//평균 : res[1]
		};
		
		// 연산부
		for (int i = 0; i < jum.length; i++) {
			//tot[i] = jum[i][0]+jum[i][1]+jum[i][2];
			for (int j : jum[i]) {
				//tot[i] += j;
				res[0][i] += j;
			}
			//avg[i] = tot[i] / jum[i].length;
			res[1][i] = res[0][i] / jum[i].length;
		}
		
		
		
		// 출력부
		for (int i = 0; i < jum.length; i++) {
			String tt = pname[i];
			
//			tt += "\t"+jum[i][0];
//			tt += "\t"+jum[i][1];
//			tt += "\t"+jum[i][2];
			
//			for (int j = 0; j < jum[i].length; j++) {
//				tt += "\t"+jum[i][j];
//			}
			
			for (int j : jum[i]) {
				tt += "\t"+j;
			}
			
			//tt += "\t"+tot[i];
			//tt += "\t"+avg[i];
			
			tt += "\t"+res[0][i];
			tt += "\t"+res[1][i];
			
			System.out.println(tt);
		}

	}

}

