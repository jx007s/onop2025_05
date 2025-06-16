package collection_p;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;


class TMStud{
	int ban, jum;
	String gender, name;
	public TMStud(int ban, String name, String gender, int jum) {
		
		this.ban = ban;
		this.name = name;
		this.gender = gender;
		this.jum = jum;
	}
	@Override
	public String toString() {
		return ban + "\t" + gender + "\t" + jum + "\t" + name;
	}
	
	
}

public class TreeMapExamMain {

	public static void main(String[] args) {
		TMStud [] ori = {
			new TMStud(1,"현빈","남",79),
			new TMStud(2,"빈라덴","남",79),
			new TMStud(1,"원빈","남",89),
			new TMStud(2,"현빈","남",89),
			new TMStud(1,"투빈","남",79),
			new TMStud(2,"장희빈","남",79),
			new TMStud(1,"현빈","남",89),
			new TMStud(2,"원빈","남",89),
			new TMStud(1,"투빈","남",79),
			new TMStud(2,"현빈","여",79),
			new TMStud(1,"빈라덴","여",89),
			new TMStud(1,"투빈","여",89),
			new TMStud(2,"원빈","여",79),
			new TMStud(2,"현빈","여",79),
			new TMStud(1,"빈라덴","여",89),
			new TMStud(1,"투빈","여",89),
			new TMStud(2,"원빈","여",79)
		};
		
		/*
		 * 반 >  성별 > 점수, 이름
		 * 
		 * TreeMap
		 *   k,  v
		 *   반  TreeMap
		 *        k,  v
		 *       성별, TreeSet(점수 > 이름)
		 *             학생
		 * */
		
		TreeMap total = new TreeMap() ;
		
		TreeMap ban1 = new TreeMap();
		TreeMap ban2 = new TreeMap();
		
		ban1.put("남", new TreeSet());
		ban1.put("여", new TreeSet());
		
		ban2.put("남", new TreeSet());
		ban2.put("여", new TreeSet());
		
		// 반  TreeMap
		total.put(1, ban1);
		total.put(2, ban2);
		
		
		
		for (TMStud tst : ori) {
			//System.out.println(tst);
		}
		
		
		//// 출력부
		
		//반
		for (Object banObj : total.entrySet()) {
			Map.Entry ban = (Map.Entry)banObj;
			
			System.out.println("[["+ban.getKey()+"반]]");
			
			// 반 -> 성별
			for (Object genObj : ((TreeMap)ban.getValue()).entrySet()) {
				Map.Entry gen = (Map.Entry)genObj;
				
				System.out.println(" >>"+gen.getKey());
			}
		}

	}

}
