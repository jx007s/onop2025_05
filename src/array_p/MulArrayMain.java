package array_p;

public class MulArrayMain {

	public static void main(String[] args) {
		String [][] arr = {									//1차원
				{"0_0",		"0_1",		"0_2",		"0_3"},	//arr[0]
				{"1_0",		"1_1",		"1_2",		"1_3"},	//arr[1]
				{"2_0",		"2_1",		"2_2",		"2_3"}	//arr[2]
//1차원안원소     arr[?][0]  arr[?][1]  arr[?][2]  arr[?][3]
		};
		
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		//System.out.println(arr[3]);
		System.out.println(arr.length);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[1][2]);
		System.out.println(arr[1][3]);
		System.out.println(arr[1].length);

	}

}

