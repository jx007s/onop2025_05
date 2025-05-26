package array_p;

public class MulVarExamMain {

	public static void main(String[] args) {
		
		// 입력부
		String [] pname = {
				"현빈",
				"원빈",
				"김우빈",
				"장희빈",
				"커피빈",
				"미스터빈",
				"텅빈"
				};
		
		
		int [][] jum = {
				{77,78,72,74},
				{77,78,72},
				{37,58,72,94},
				{97,78,52,34},
				{37,68,92},
				{97,68,32},
				{67,68,62,64}
		};
		
		int [][] res = new int[pname.length][2];
		/*
		 {//총점,평균
		 	{0,	0},
		 	{0, 0},
		 	{0, 0},
		 	{0, 0},
		 	{0, 0},
		 	{0, 0},
		 	{0, 0}
		 }
		 * */
					//    국어  영어  수학   예체능
		double [] rate = {0.1, 0.15, 0.2, 0.55};
		
		//                  res.length
		for (int i = 0; i < res.length; i++) {
			int [] me = res[i];   //각 사람의   int [] me = {0,0}
			int [] meJum = jum[i];
			//me[0] = 77;
			//res[i][0] = 77;
			for (int j =0 ; j<meJum.length ; j++) {
				me[0]+=meJum[j];
				me[1]+=meJum[j] * rate[j];
				
			}
			
			if(meJum.length == 3) {
				me[1] = me[0]/meJum.length;
			}
			
		}
		
		
		
		//출력부
		
		for (int i = 0; i < pname.length; i++) {
			String ttt = pname[i];
			
			for (int j : jum[i]) {
				ttt += "\t"+j;
			}
			
			if(jum[i].length == 3) {
				ttt += "\t";
			}
			
			for (int j : res[i]) {
				ttt += "\t"+j;
			}
			
			
			System.out.println(ttt);
		}

	}

}


/*

  
   {5},
   {5,6},
   {5,6,8},
   {10,4},
   {8},
   {10,6,13}

  
  도형의 넓이와 둘레를 출력하세요
  
 도형명		선분 	 		넓이	 					둘레
 원	 		반지름	 		반지름*반지름*pi 	 		반지름*2*pi
 직사각형	 	가로, 세로 	 	가로*세로	 				(가로+세로)*2
 직각삼각형	밑변, 높이, 빗변	밑변*높이/2	 			밑변+높이+빗변

 * */





