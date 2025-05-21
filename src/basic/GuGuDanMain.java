package basic;

public class GuGuDanMain {
	public static void main(String[] args) {
		
		for (int gob = 1; gob <=9; gob++) {
			for (int dan = 2; dan <=9; dan++) {
				System.out.print(dan+"x"+gob+"="+dan*gob+"\t");
			}
			System.out.println();
		}
	}
}
