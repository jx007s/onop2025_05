package oops_p;

class RecurCall{
	String pre="";
	
	int meth(int a) {
		
		a -= a % 2;
		
		int res = a;
//		if(a%2!=0) {
//			res = 0;
//		}
		String myPre=pre;
		pre+="\t";
		System.out.println(myPre+"시작 : "+a+","+res);
		
		if(a>0) {//조건
		
			// 증감 : a-1
			res += meth(a-2); //재귀호출
		}
		
		
		System.out.println(myPre+"끝 : "+a+","+res);
		
		return res;
	}
}

public class RecursiveCallMain {

	public static void main(String[] args) {
		RecurCall rc = new RecurCall();
		int ret = rc.meth(3); //초기값 : 2
		System.out.println("ret : "+ret);

	}

}
