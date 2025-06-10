package util_p;

class MySingle{
	String name="장동건";
	int age=45;
	boolean marriage=true;
	
	private static MySingle me = null;
	
	private MySingle() {
		System.out.println("생성자");
	}
	static MySingle getInstance() {
		
		if(me == null) {
			me = new  MySingle(); 
		}
		return me;
	}
	@Override
	public String toString() {
		return "MySingle [name=" + name + ", age=" + age + ", marriage=" + marriage + "]";
	}
	
}

public class SingleTonMain {

	public static void main(String[] args) {
		//싱글톤 : 프로세스 진행시 1개의 인스턴스로만 사용하는 형태
		//        1개 인스턴스가 생성되어 사용
		//MySingle ms = new MySingle();
		MySingle ms1 = MySingle.getInstance();
		MySingle ms2 = MySingle.getInstance();
		ms1.name = "장서건";
		ms2.age = 37;
		//MySingle.marriage = false;
		System.out.println(ms1);
		System.out.println(ms2);
		System.out.println(ms1==ms2);

	}

}
