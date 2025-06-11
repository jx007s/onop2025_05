package oops_p;


//enum 정의 : 클래스 정의와 비슷
enum AAA{
	//새미콜론 없음
	aa,bb,cc,dd	;	//열거 상수 (배열과 비슷) - 변경 불가
//  0   1  2  3
}

enum BBB{
	//인스턴스생성하여 열거상수로 설정
	// 생성시 생성자에 맞춰 생성
	LEE("이승환",61,true), PARK("박지성",46,true), KIM("김갑수",34, false);		//새미콜론 필수
	
	String name;
	int age;
	boolean marriage;
	
	BBB(String name, int age, boolean marriage) {
		
		this.name = name;
		this.age = age;
		this.marriage = marriage;
	}

	@Override
	public String toString() {
		return "BBB [" + name + ", " + age + "," + marriage + "]";
	}
	
	void meth(int a) {
		System.out.println(name+" meth 실행 : "+age+","+a);
	}
	
}

public class EnumMain {

	public static void main(String[] args) {
		//System.out.println("AAA : "+AAA);
		System.out.println("AAA : "+AAA.aa);
		System.out.println("AAA : "+AAA.bb);
		System.out.println("AAA : "+AAA.cc);
		System.out.println("AAA : "+AAA.dd);
		
		AAA a1;	//enum 변수 선언
		a1 = AAA.bb;
		
		System.out.println(a1);
		System.out.println(a1+"qwer");//a1.toString()+"qwer"
		//String ttt = a1;  문자열로 직접대입불가
		System.out.println(a1.name());
		String ttt = a1.name(); // 열거상수 이름을 문자열로 리턴
		System.out.println(a1.ordinal());  //인덱스번호
		
		a1 = AAA.valueOf("cc");	//문자열로 열거상수 대입
		System.out.println(a1);
		System.out.println("--------------");
		AAA [] arr = AAA.values(); //열거항목을 배열로 호출
		for (AAA ee : arr) {
			System.out.println(ee);
		}
		System.out.println("순서비교--------------");
		// 음수 : 앞에 , 0 : 같음 , 양수 : 뒤에
		System.out.println(AAA.bb.compareTo(AAA.dd));
		System.out.println(AAA.bb.compareTo(AAA.cc));
		System.out.println(AAA.bb.compareTo(AAA.bb));
		System.out.println(AAA.bb.compareTo(AAA.aa));
		
		BBB b1 = BBB.PARK;
		//BBB b2 = new BBB("송혜교",45,false);  인스턴스 생성하여 대입불가
		System.out.println(b1);
		System.out.println(b1.name);
		System.out.println(b1.age);
		System.out.println(b1.marriage);
		b1.name = "박찬호";	//열거상수의 멤버필드 변경 가능
		b1.age = 54;
		System.out.println(b1);
		b1.meth(123);
		System.out.println(BBB.KIM);
		System.out.println(BBB.KIM.name);
		System.out.println(BBB.KIM.age);
		System.out.println(BBB.KIM.marriage);
		BBB.KIM.name = "김범수";	//열거상수의 멤버필드 변경 가능
		BBB.KIM.age = 20;
		System.out.println(BBB.KIM);
		BBB.KIM.meth(456);
		
		System.out.println(b1.name());
		ttt = b1.name(); // 열거상수 이름을 문자열로 리턴
		System.out.println(b1.ordinal());  //인덱스번호
		
		b1 = BBB.valueOf("KIM");	//문자열로 열거상수 대입
		System.out.println(b1);
		System.out.println("--------------");
		BBB [] arrB = BBB.values(); //열거항목을 배열로 호출
		for (BBB ee : arrB) {
			System.out.println(ee);
		}
		
		System.out.println("순서비교--------------");
		// 음수 : 앞에 , 0 : 같음 , 양수 : 뒤에
		System.out.println(BBB.PARK.compareTo(BBB.PARK.LEE));
		System.out.println(BBB.PARK.compareTo(BBB.PARK.PARK));
		System.out.println(BBB.PARK.compareTo(BBB.PARK.KIM));
		
	}

}
