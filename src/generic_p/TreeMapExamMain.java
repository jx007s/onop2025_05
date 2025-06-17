package generic_p;

import java.util.Comparator;
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

// TMStud 를 TreeSet(반>성별) 에 add 할때 정렬기준
class TMStudCom implements Comparator<TMStud>{

	// 점수 > 이름 순 정렬
	@Override
	public int compare(TMStud me, TMStud you) {

		
		int res = you.jum - me.jum;
		
		if(res==0) {
			res = me.name.compareTo(you.name);
		}
		if(res==0) {
			res = 1;
		}
		return res;
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
			new TMStud(2,"원빈","it",89),
			new TMStud(1,"투빈","남",79),
			new TMStud(2,"현빈","여",69),
			new TMStud(1,"빈라덴","여",89),
			new TMStud(1,"투빈","여",89),
			new TMStud(3,"원빈","여",79),
			new TMStud(2,"현빈","여",89),
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
		
		TreeMap<Integer, TreeMap<String, TreeSet<TMStud>>> total = new TreeMap() ;
		
		//정렬 인스턴스
		TMStudCom tsc = new TMStudCom();
		
		
		for (TMStud tst : ori) {
			
			//반에 해당하는 TreeMap 가져오기 --> ban1, ban2
			TreeMap<String, TreeSet<TMStud>> currBan = total.get(tst.ban);
			
			// 현재 반이 없을 경우 생성하여 넣는다
			if(currBan==null) {
				currBan = new TreeMap();
				total.put(tst.ban,currBan );
			}
			
			TreeSet<TMStud> currGen = currBan.get(tst.gender);
			
			
			// 현재 성별이 없을 경우 생성하여 넣는다
			if(currGen==null) {
				currGen = new TreeSet(tsc);
				currBan.put(tst.gender, currGen );
			}
			
			currGen.add(tst);
		}
		
		
		//// 출력부
		
		//반
		for (Map.Entry<Integer, TreeMap<String, TreeSet<TMStud>>> ban : total.entrySet()) {
			
			
			System.out.println("[["+ban.getKey()+"반]]");
			
			// 반 -> 성별
			for (Map.Entry<String, TreeSet<TMStud>> gen : ban.getValue().entrySet()) {
				
				
				System.out.println(" >>"+gen.getKey());
				
				//System.out.println(gen.getValue());
				for (TMStud stObj : gen.getValue()) {
					System.out.println(stObj);
				}
			}
		}

	}

}

/*
////// 오늘 경기 기록을 출력하세요
/// 입력: "h22","h23","h11","a3","a7","a22","h23","a11","h5","a3","h8","a11","h22","h23"..........

/// 출력내용

//  h : 홈팀,  a:상대팀
//  각 팀별로 선수가 안타를 친 갯수를 출력하세요
//  단 선수번호는 오름차순으로 정렬

ex)

홈팀

22 : 2
23 : 3

...

상대팀

3 : 2
7 : 1
 * */

