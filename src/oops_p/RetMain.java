package oops_p;

import java.util.Arrays;

class RetAAA{
	int meth_1() {
		System.out.println("meth_1 실행 --1");
		
		return 10;
		//System.out.println("meth_1 실행 --2");
		
		//return 20;
		
		//System.out.println("meth_1 실행 --3");
		
		//return 30;
	}
	
	int meth_2(String tt) {
		System.out.println("meth_2 실행 --1");
		
		if(tt == "qq") {
			return 10;
		}
		
		System.out.println("meth_2 실행 --2");
		
		if(tt == "ww") {
			return 20;
		}
		
		System.out.println("meth_2 실행 --3");
		
		return 30;
	}
	
//	int, int  meth_3() {
//		
//		return 10,20;
//	}
	
	int [] meth_4() {
		int [] ret = {11,22,33};
		System.out.println("meth_4 실행 : "+ret);
		return ret;
	}
	
	RetData dataMake(String pname,int age) {
		System.out.println("dataMake 실행 : "+pname+","+age);
		
		RetData ret = new RetData();
		ret.input(pname, age, true);
		return ret;
	}
}

class RetData{
	String pname;
	int age;
	boolean marriage;
	
	void input(String pname,int age,boolean marriage) {
		this.pname = pname;
		this.age = age;
		this.marriage = marriage;
	}
	void ppp() {
		System.out.println(this+","+pname+","+age+","+marriage);
	}
}

public class RetMain {

	public static void main(String[] args) {
		RetAAA ra = new RetAAA();
		int rr = ra.meth_1();
		System.out.println("rr : "+rr);
		rr = ra.meth_2("ewrrew");
		System.out.println("rr : "+rr);
		
		int [] arr = ra.meth_4();
		arr[1] = 234;
		System.out.println("arr : "+arr+Arrays.toString(arr));
		ra.meth_4()[2] = 345;
		System.out.println("arr : "+arr+Arrays.toString(arr));
		
		RetData rd = new RetData();
		rd.input("박보검", 34, false);
		rd.ppp();
		
		RetData rd2 = ra.dataMake("박보물",27);
		System.out.println("rd2 : "+rd2);
		rd2.ppp();
		
		
		RetData [] dataArr = {
				ra.dataMake("박국보",17),
				ra.dataMake("박보석",23),
				ra.dataMake("박문화재",33),
				ra.dataMake("박방패",43)
		};
		
		//dataArr[0].ppp();
		for (int i = 0; i < dataArr.length; i++) {
			dataArr[i].ppp();
		}
		System.out.println("----------------");
		
		for (RetData zxc : dataArr) {
			zxc.ppp();
		}
		
		
	}

}
