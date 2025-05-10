package util_p;

import java.util.Calendar;

public class CalendarDiary {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		int now = today.get(Calendar.DATE);
		
		int last = today.getActualMaximum(Calendar.DATE);
		today.set(Calendar.DATE, 1);
		int first = today.get(Calendar.DAY_OF_WEEK);
		for (int i = 1; i <first; i++) {
			System.out.print("\t");
		}
		for (int i = 1; i <=last; i++) {
			today.set(Calendar.DATE, i);
			String pre = " ", sur="\t";
			if(now == i) {
				pre="[";
				sur="]"+sur;
			}
			
			System.out.print(pre+i+sur);
			
			if(today.get(Calendar.DAY_OF_WEEK)==7) {
				System.out.println();
			}
		}
		

	}

}
