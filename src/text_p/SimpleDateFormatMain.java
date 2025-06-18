package text_p;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatMain {

	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(now));
		
		String [] ppArr= {
				"y","yy","yyyy",
				"M","MM","MMM","MMMM",
				"d","dd","D","DD","DDD",
				"w","ww","W","WW",
				"E","EE","EEE","EEEE",
				"F","z","Z",
				
				"a"
				
		};
		
		Locale loc = new Locale("en");
		loc = new Locale("ko");
		
		for (String pp : ppArr) {
			sdf = new SimpleDateFormat(pp, loc);
			System.out.println(pp+" : "+sdf.format(now));
		}

	}

}
