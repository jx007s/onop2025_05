package collection_p;

import java.util.Comparator;
import java.util.TreeSet;

class ComStud{
	String kind, name;
	int ban,jum;
	
	ComStud(String kind, int ban, String name, int jum) {
	
		this.kind = kind;
		this.ban = ban;
		this.name = name;
		this.jum = jum;
	}

	@Override
	public String toString() {
		return kind + "\t" + ban + "\t" + name + "\t" + jum;
	}
}

class ComStudCom implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		ComStud me = (ComStud)o1;
		ComStud you = (ComStud)o2;
		
		int res = me.ban - you.ban;
		if(res==0) {
			res = 1;
		}
		return res;
	}
	
}

public class ComparatorExamMain {

	public static void main(String[] args) {
		TreeSet studs = new TreeSet(new ComStudCom());
		studs.add(new ComStud("예체능",2,"한가인",78));
		studs.add(new ComStud("인문계",2,"한나인",68));
		studs.add(new ComStud("예체능",1,"한다인",78));
		studs.add(new ComStud("예체능",1,"한라인",98));
		studs.add(new ComStud("예체능",2,"한마인",78));
		studs.add(new ComStud("인문계",1,"한바인",68));
		studs.add(new ComStud("인문계",1,"한가인",98));
		studs.add(new ComStud("예체능",2,"한나인",78));
		studs.add(new ComStud("인문계",3,"한다인",78));
		studs.add(new ComStud("예체능",3,"한라인",68));
		studs.add(new ComStud("인문계",2,"한마인",78));

		for (Object oo : studs) {
			System.out.println(oo);
		}
	}

}

