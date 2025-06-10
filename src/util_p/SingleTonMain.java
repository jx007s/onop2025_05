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
		//MySingle ms = new MySingle();
		MySingle ms1 = MySingle.getInstance();
		MySingle ms2 = MySingle.getInstance();
		System.out.println(ms1);
		System.out.println(ms2);
		System.out.println(ms1==ms2);

	}

}
