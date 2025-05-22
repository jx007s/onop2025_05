package array_p;

public class ArrayMain {

	public static void main(String[] args) {
		
		
		int a = 10;  //변수 선언 및 초기화
		int [] arr1 = {11,22,33,444};	//배열변수 선언 및 초기화(생성 및 원소 대입)
		//int [] arr1 = new int[]{11,22,33,444};
		//arr1 :  {11,22,33,44} 의 배열을 생성하고 위치한 주소를 변수값으로 대입
		
		//{11,22,33,444}
		// 0  1  2   3

		//변수 호출 : 변수 공간 안에 있는 값을 복사하여 사용
		System.out.println("a : "+a);		
		System.out.println("arr1 : "+arr1);
		
		//원소 호출
		//System.out.println("arr1[2] : "+arr1[-1]);
		System.out.println("arr1[0] : "+arr1[0]);
		System.out.println("arr1[1] : "+arr1[1]);
		System.out.println("arr1[2] : "+arr1[2]);
		arr1[2] = 3030;
		System.out.println("arr1[2] : "+arr1[2]);
		System.out.println("arr1[3] : "+arr1[3]);
		//System.out.println("arr1[4] : "+arr1[4]);
		System.out.println("arr1.length : "+arr1.length);
		
		a = 20;
		//arr1 = {77,88,99,100};  배열변수를 선언시에만 배열생성후 원소대입함
		//     배열변수에 대입하여 배열자동 생성 불가
		
		int [] arr2 = new int[3];  // 원소값 0 으로 원소 3개인 배열 생성
									//int [] arr2 = {0,0,0};
							
		System.out.println("arr2 : "+arr2);
		System.out.println("arr2.length : "+arr2.length);
		System.out.println("arr2[0] : "+arr2[0]);
		System.out.println("arr2[1] : "+arr2[1]);
		System.out.println("arr2[2] : "+arr2[2]);
		
		arr1 = new int[5];
		System.out.println("arr1 : "+arr1);
		System.out.println("arr1[0] : "+arr1[0]);
		System.out.println("arr1[1] : "+arr1[1]);
		System.out.println("arr1[2] : "+arr1[2]);
		System.out.println("arr1[3] : "+arr1[3]);
		System.out.println("arr1[4] : "+arr1[4]);
		
		// 배열 변수 선언 및 배열 생성과 초기화
		//int [] arr3 = new int[3] {123,456,789}; 에러
		int [] arr3 = new int[] {123,456,789};
		System.out.println("arr3 : "+arr3);
		System.out.println("arr3.length : "+arr3.length);
		System.out.println("arr3[0] : "+arr3[0]);
		System.out.println("arr3[1] : "+arr3[1]);
		System.out.println("arr3[2] : "+arr3[2]);
		
		arr1 = new int[] {98,76,54,32};
		System.out.println("arr1 : "+arr1);
		System.out.println("arr1[0] : "+arr1[0]);
		System.out.println("arr1[1] : "+arr1[1]);
		System.out.println("arr1[2] : "+arr1[2]);
		System.out.println("arr1[3] : "+arr1[3]);
	}

}
