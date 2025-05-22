package array_p;

public class ArrayCutlineMain {

	public static void main(String[] args) {
		int [] arr = {67,98,34,72,86,23,84};
		
		int tot=0;
		
//		if(arr[0]>= 70) {
//			System.out.println(0);
//			tot += arr[0];
//		}
//		if(arr[1]>= 70) {
//			System.out.println(1);
//			tot += arr[1];
//		}
//		if(arr[2]>= 70) {
//			System.out.println(2);
//			tot += arr[2];
//		}
//		if(arr[3]>= 70) {
//			System.out.println(3);
//			tot += arr[3];
//		}
//		if(arr[4]>= 70) {
//			System.out.println(4);
//			tot += arr[4];
//		}
//		if(arr[5]>= 70) {
//			System.out.println(5);
//			tot += arr[5];
//		}
//		if(arr[6]>= 70) {
//			System.out.println(6);
//			tot += arr[6];
//		}
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>= 70) {
				System.out.println(i);
				tot += arr[i];
			}
		}
		
		System.out.println(tot);
		
		//점수 : 87,65,82,46,98,65,72,34,91,79,45,67
		//점수에 대응하는 수우미양가 등급 배열을 구현하세요


		// 87,65,82,46,98,65,72,34,91,79,45,67
		//{우,양,우, 가,수, 양,미, 가,수, 미,가,양 }
		
		/*
		 90 이상 : 수
		 80 이상 : 우
		 70 이상 : 미
		 60 이상 : 양
		 나머지   : 가
		 * */
		
		int [] jum = {87,65,82,46,98,65,72,34,91,79,45,67};
		String [] grade = new String[jum.length];
		
		System.out.println(jum.length);
		System.out.println(grade.length);
		
		String [] grArr = {"가","가","가","가","가","가","양","미","우","수","수"};
		
		for (int i = 0; i < jum.length; i++) {
			//grade[i] = grArr[jum[i]/10];
			int ten = jum[i]/10;  //  7 <-78
			grade[i] = grArr[ten];  // "미" <- grArr[7]
//			if(jum[i]>=90) {
//				grade[i] = "수";
//			}else if(jum[i]>=80) {
//				grade[i] = "우";
//			}else if(jum[i]>=70) {
//				grade[i] = "미";
//			}else if(jum[i]>=60) {
//				grade[i] = "양";
//			}else {
//				grade[i] = "가";
//			}
//			
//			System.out.println(jum[i]+","+grade[i]+","+jum[i]/10+","+grArr[jum[i]/10]);
		}
		
		for (int i = 0; i < grade.length; i++) {
			System.out.println(grade[i]);
		}
		

	}

}
