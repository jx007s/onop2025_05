package lamda_p;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/*
함수형 인터페이스		입력		출력			설명

Consumer<T>			O		X			값을 받아 소비함 (예: 출력)

Supplier<T>			X		O			값을 공급함 (예: 랜덤 값)

Function<T, R>		O		O			값을 변환함 (예: 계산, 가공)

Predicate<T>		O		Boolean		조건 판별 (예: 필터링)

*/

public class FunctionMain {

	public static void main(String[] args) {
		
		// 매개변수 O, 리턴 X
		Consumer<String> csm = (s)->System.out.println("컨서머 출력 : "+s+","+s.length());
		csm.accept("아기상어");
		
		// 매개변수 X, 리턴 O
		Supplier<String> timeSup = ()-> new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		String rr = timeSup.get();
		System.out.println(rr);
		
		// 첫번째 : 매개변수 , 두번째 : 리턴
		Function<String, Integer> tttLength = s->s.length();
		int i = tttLength.apply("장수풍뎅이");
		System.out.println(i);
		
		// 매개변수 : O, 리턴 : boolean
		Predicate<Integer> isEven = no -> no % 2 == 0;
		boolean bb = isEven.test(10);
		System.out.println(bb);
		
		
		// Bi : 매개변수가 2개				Integer a, Strinb b	
		BiConsumer<Integer, String> bc = (a,b)-> System.out.println("a : "+a*10 + " , b : "+b);
		bc.accept(10, "사슴벌레");
		
		// 첫번째 , 두번째: 매개변수 , 세번째 : 리턴
		BiFunction<Integer, Integer, int []> bf = (a,b)-> new int[] {a,b};
		int [] arr = bf.apply(5, 6);
		System.out.println("arr : "+Arrays.toString(arr));
		
		// 매개변수 2개, 리턴 : boolean
		BiPredicate<Integer, Integer>bp = (a,b)-> a == b;
		bb = bp.test(10, 20);
		System.out.println(bb);
		
	}

}
