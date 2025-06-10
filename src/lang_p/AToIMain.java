package lang_p;

import java.util.Arrays;

public class AToIMain {

	public static void main(String[] args) {
		String ttt = "3742";
		//int i = (int)ttt;
		char [] chArr = ttt.toCharArray();
		System.out.println(Arrays.toString(chArr));
		
		int i = 0;
		for (char c : chArr) {
			i*=10;
			System.out.println(c+":"+i);
			i+=c-'0';
			System.out.println(c+":"+i);
		}
		
		int ii = Integer.parseInt(ttt);
		System.out.println(ii);
		
		//Integer.parseInt("123.456");
		byte bb = Byte.parseByte("127");
		System.out.println(bb);
		short sh = Short.parseShort("32767");
		System.out.println(sh);
		long ll = Long.parseLong("1234567890121");
		System.out.println(ll);
		
		float ff = Float.parseFloat("123.456");
		System.out.println(ff);
		double dd = Double.parseDouble("123.79");
		System.out.println(dd);
		boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		
		bb = 13;
		ttt = Byte.toString(bb);
		System.out.println(ttt);
		
		i = 10;
		System.out.println(Integer.toString(i));
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Integer.toOctalString(i));
		System.out.println(Integer.toHexString(i));
		
	}

}
