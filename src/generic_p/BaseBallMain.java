package generic_p;

import java.util.Map;
import java.util.TreeMap;

public class BaseBallMain {

	public static void main(String[] args) {
		
		TreeMap<Character, TreeMap<Integer, Integer>> res = new TreeMap();
		
		for(String qqq : "h22,h23,h11,a3,a7,a22,h23,a11,h5,a3,h8,a11,h22,h23".split(",")) {
			char team = qqq.charAt(0);
			int no = Integer.parseInt(qqq.substring(1));
			//System.out.println(team);
			//System.out.println(no);
			
			TreeMap<Integer, Integer> myTeam = res.get(team);

			if(myTeam==null) {
				myTeam = new TreeMap();
				res.put(team, myTeam);
			}
			
			int hit = 1;
			if(myTeam.containsKey(no)) {
				hit += myTeam.get(no);
			}
			myTeam.put(no, hit);
			//System.out.println(myTeam);
		}
		
		for (Map.Entry<Character, TreeMap<Integer, Integer>> team : res.entrySet()) {
			System.out.println("[["+team.getKey()+"]]");
			
			for (Map.Entry<Integer, Integer> player : team.getValue().entrySet()) {
				System.out.println(player.getKey()+"\t"+"*".repeat(player.getValue()));
			}
		}

	}

}
