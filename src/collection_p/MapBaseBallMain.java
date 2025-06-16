package collection_p;

import java.util.HashMap;

public class MapBaseBallMain {

	public static void main(String[] args) {
		int [] hit = {2,3,5,7,9,1,2,3,7,2,3,5,8,2};
		
		// 각 선수가 몇개의 안타를 쳤는지...
		
		HashMap mm = new HashMap();
		
		for (int i : hit) {
			int cnt = 1;
			if(mm.containsKey(i)) {
				cnt += (int)mm.get(i);
			}
			mm.put(i, cnt);
			System.out.println(i+mm.toString());
			
		}

		System.out.println(mm);
	}

}
