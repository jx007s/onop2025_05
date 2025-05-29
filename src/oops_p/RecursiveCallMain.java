package oops_p;

class RecurCall{
	String pre="";
	
	int meth(int a) {
		int res = a;
		String myPre=pre;
		pre+="\t";
		System.out.println(myPre+"시작 : "+a+","+res);
		
		if(a>0) {//조건
		
			// 증감 : a-1
			res += meth(a-1); //재귀호출
		}
		
		
		System.out.println(myPre+"끝 : "+a+","+res);
		
		return res;
	}
}

public class RecursiveCallMain {

	public static void main(String[] args) {
		RecurCall rc = new RecurCall();
		int ret = rc.meth(100); //초기값 : 2
		System.out.println("ret : "+ret);

	}

}
