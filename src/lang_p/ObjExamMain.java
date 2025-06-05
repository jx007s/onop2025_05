package lang_p;

class ObjGen{
	String name;
	int jum;
	ObjGen(String name, int jum) {
		
		this.name = name;
		this.jum = jum;
		
	}
	@Override
	public String toString() {
		return "일반\t"+name + "\t" + jum;
	}
	
	void compare(Object obj) {
		if(getClass()!=obj.getClass()) {
			System.out.println("비교불가");
			return;
		}
		
		//System.out.println("비교가능");
		ObjGen you = (ObjGen)obj;
		System.out.println(jum - you.jum);
	}
}

class ObjArt{
	String name, spec;

	ObjArt(String name, String spec) {
		
		this.name = name;
		this.spec = spec;
	}

	@Override
	public String toString() {
		return "특기생\t" + name + "\t" + spec;
	}
	
	
}

public class ObjExamMain {

	public static void main(String[] args) {
		Object [] studs = {
				new ObjGen("장동건", 73),
				new ObjArt("장서건", "동양화"),
				new ObjGen("장남건", 83),
				new ObjGen("장중건", 53),
				new ObjArt("북두신건", "서양화"),
				new ObjArt("머신건", "국제화")
		};
		
		for (Object oo : studs) {
			System.out.println(oo);
		}
		
		for (Object oo : studs) {
			((ObjGen)studs[0]).compare(oo);
		}

	}

}

/*
 * 
배열로 묶은 다음 모든 도형들의 넓이 합계를 출력하세요
원 - 넓이
직사각형 - 넓이, 둘레

 * */

