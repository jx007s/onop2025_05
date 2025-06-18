package text_p;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatMain {

	public static void main(String[] args) throws ParseException  {
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
				
				"a","H","HH","h","hh",
				"m","mm",
				"s","ss",
				"S","SSS"
				
		};
		
		Locale loc = new Locale("en");
		loc = new Locale("ko");
		
		for (String pp : ppArr) {
			sdf = new SimpleDateFormat(pp, loc);
			System.out.println(pp+" : "+sdf.format(now));
		}
		
		sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date ddd = sdf.parse("1997-03-20");
		System.out.println(ddd);
		
		sdf = new SimpleDateFormat("yyMMdd");
		ddd = sdf.parse("970320");
		
		System.out.println(ddd);
		
		sdf = new SimpleDateFormat("HH:mm:ss");
		ddd = sdf.parse("13:45:27");
		System.out.println(ddd);
		
		sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		ddd = sdf.parse("1999-06-23 13:45:27");
		System.out.println(ddd);
		
		ddd = sdf.parse("1999-89-61 123:9888:1234");
		System.out.println(ddd);
		
		now = sdf.parse("1989-11-28 05:07:30");
		
		loc = new Locale("en");
		sdf = new SimpleDateFormat("''yy年 MMM dd일 (", loc);
		String ttt = sdf.format(now)+
				new SimpleDateFormat("E) HH:mm:ss", new Locale("ko")).format(now);
		System.out.println(ttt);
		
		 /// '89年  nov 28일 (화) 05:07:30  형태로 출력해 주세요
		 ///주민번호 -> 생년월일, 한국나이, 만나이, 올해생일, 다가올생일, 생일파티, DDay
	}

}
