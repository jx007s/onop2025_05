package generic_p;

class AAA{
	Object aa;
	String bb;
	public AAA(Object aa, String bb) {
		super();
		this.aa = aa;
		this.bb = bb;
	}
	@Override
	public String toString() {
		return "AAA [aa=" + aa + ", bb=" + bb + "]";
	}
}

class BBB<T>{   //  <T>  : 타입추상화
	T aa;
	String bb;
	public BBB(T aa, String bb) {
		
		this.aa = aa;
		this.bb = bb;
	}
	@Override
	public String toString() {
		return "BBB [aa=" + aa + ", bb=" + bb + "]";
	}
}

public class GenericMain {

	public static void main(String[] args) {
		AAA a1 = new AAA("아기상어","엄마상어");
		AAA a2 = new AAA(1234,"엄마상어");
		System.out.println("a1 "+a1);
		System.out.println("a2 "+a2);
		//System.out.println(a2.aa-456);
		System.out.println((int)a2.aa-456);  //형변환 필요
		//System.out.println((int)a1.aa-456);  // a1.aa : String  이므로 에러발생
		
		//타입 구체화 하지 않고 선언 생성 가능  <T> 를 Object 로 처리
		BBB b1 = new BBB("아빠상어","할머니상어");
		BBB<String> b2 = new BBB<String>("장수풍뎅이","사슴벌레");
		//BBB<String> b3 = new BBB<String>(1234,"사슴벌레");
		BBB<Integer> b4 = new BBB<Integer>(1234,"하늘소");
		System.out.println("b1 "+b1);
		System.out.println("b1.aa "+b1.aa.getClass().getName());
		//System.out.println("b1.aa "+b1.aa.indexOf("아")); --> Object 이므로 불가
		
		System.out.println("b2 "+b2);
		System.out.println("b2.aa "+b2.aa.indexOf("풍")); //generic으로 String 인식
		System.out.println(b4.aa-456); 

	}

}
