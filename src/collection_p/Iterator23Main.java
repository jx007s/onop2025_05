package collection_p;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator23Main {

	public static void main(String[] args) {
		
		ArrayList arr = new ArrayList();
		for (int i : new int[] {34,56,12,43,90,89,654,43,21234,675,45}) {
			arr.add(i);
		}
		System.out.println("arr : "+arr);
		Iterator it = arr.iterator();
		while(it.hasNext()) {
			int i = (int)it.next();
			if(i%2==0) {
				it.remove();
			}else if(i%3==0) {
				it.remove();
			}
		}
		System.out.println("arr : "+arr);
	}

}
