package collection_p;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

/*  직급, 이름순으로 정렬해 주세요 

직급 : 사장 > 부장 > 과장 > 대리 > 사원

이름 : 오름차순

사원_정우성,과장_현빈,부장_원빈,과장_장동건,사원_장서건,대리_정남성,대리_정좌성,부장_이효리,사원_삼효리,과장_한가인,대리_두가인
*/

enum GradeSort{
	사장,부장,과장,대리,사원
}

class TreeMem{
	String grade, pname;

	public TreeMem(String ttt) {
		String [] arr = ttt.split("_");
		this.grade = arr[0];
		this.pname = arr[1];
	}

	@Override
	public String toString() {
		return grade + " , " + pname;
	}	
}

class ComTreeMem implements Comparator{
	
	ArrayList sortArr = new ArrayList();
	
	public ComTreeMem(String stts) {
		
	
		for (String stt : stts.split(",")) {
			
			sortArr.add(stt);
		}
		
	}
	

	@Override
	public int compare(Object o1, Object o2) {
		TreeMem me = (TreeMem)o1;
		TreeMem you = (TreeMem)o2;
		
		//int res = me.grade.compareTo(you.grade);
		//int res = GradeSort.valueOf(me.grade).ordinal() - GradeSort.valueOf(you.grade).ordinal(); 
		int res = sortArr.indexOf(me.grade) - sortArr.indexOf(you.grade);
		
		if(res==0) {
			me.pname.compareTo(you.pname);
		}
		if(res==0) {
			res = 1;
		}
		return res;
	}
	
}


public class TreeSetCompanyMain {

	public static void main(String[] args) {
		String ori = "사원_정우성,과장_현빈,부장_원빈,과장_장동건,사장_장서건,대리_정남성,대리_정좌성,부장_이효리,사원_삼효리,과장_한가인,대리_두가인";

		//GradeSort gs = GradeSort.과장;
//		System.out.println(gs.ordinal());
//		System.out.println(GradeSort.부장.ordinal());
//		System.out.println(GradeSort.valueOf("대리").ordinal());

		TreeSet ss = new TreeSet(new ComTreeMem("사장,과장,부장,대리,사원"));
		
		for (String oo : ori.split(",")) {
			ss.add(new TreeMem(oo));
		}
		
		for (Object mem : ss) {
			System.out.println(mem);
		}
	}

}

