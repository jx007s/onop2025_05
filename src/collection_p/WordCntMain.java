package collection_p;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class WordCntMain {

	public static void main(String[] args) {
		String news="역대 딱 4차례만 나왔던 대기록에 LG 트윈스의 2,3,4번 타자가 도전한다. "
				+ "바로 100타점 3명 탄생이다."
		+ "69경기를 치른 16일 현재 오스틴 딘이 52타점, 문보경이 49타점, 김현수가 47타점을 기록 중이다."
		+ "이들은 나란히 타점 랭킹 3,4,5위에 올라있다. 그 뒤로 박동원이 40타점으로 공동 12위에 이름을 올렸다."				
		+ "산술적으로 따졌을 때 오스틴은 108타점, 문보경은 102타점, 김현수는 98타점이 가능한 수치다."
		+ "오스틴과 문보경이 이 수치를 따르고, 김현수가 조금만 더 힘을낸다면 3명이 100타점을 "
		+ "돌파하는 큰 일을 해낼 수도 있다."
		+ "3명이 100타점을 넘긴다는 것은 그만큼 팀 타격이 세다는 것을 증명하는 일이다."
		+ "최근에서야 100타점 3명 구단이 탄생했고, 총 4차례 중 단 2팀만 이 기록을 가졌다."
		+ "지난 2015년 삼성 라이온즈와 NC 다이노스가 처음으로 100타점 타자 3명을 배출했다."
		+ "삼성은 나바로가 137타점, 최형우가 123타점. 박석민이 116타점을 기록했고, NC는 테임즈가 140타점, "
		+ "나성범이 135타점, 이호준 현 NC 감독이 110타점을 기록했다."
		+ "이후 NC만 두차례 더 이 진기록을 가졌다. 2016년에 테임즈가 121타점, 나성범니 113타점, "
		+ "FA 이적한 박석민이 104타점을 올려 2년 연속 100타점 타자 3명 배출의 대기록을 세웠다."			
		+ "그리고 2020년 첫 통합우승을 했을 때도 양의지가 124타점, 나성범이 112타점, 알테어가 108타점을 올렸다."
		+ "LG는 지난 2018년 채은성(119타점) 김현수(101타점)가 100타점을 돌파했지만 팀내 3위인 "
		+ "양석환이 82타점에 머물러 실패했고,"
		+ "지난해 오스틴이 132타점, 문보경이 101타점을 올렸는데 박동원이 80타점에 그쳤다."
		+ "올해 오스틴과 문보경이 지난해와 마찬가지로 타점을 올려주고 있는데 여기에 김현수가 타점쌓기에 "
		+ "동참하면서 더 강한 상위 타선이 만들어지고 있는 상황이다."
		+ "LG가 100타점 3명을 배출하는 3번째 구단이 될 수 있을까. 염경엽 감독이 'LG는 빠따의 팀'"
		+ "이라고 한 말처럼 공격력의 팀인 LG가 의미있는 결과물을 만들지 궁금해진다.";
		
		//System.out.println(news);
		/// 단어별로 몇번 나오는지 출력하세요
		///
		HashMap mm = new HashMap();
		///
		for (String ttt: news.replace("(", " ").replace(")", " ").replace("'", " ").replace(",", " ").replace(".", " ").replace("  ", " ").split(" ")) {
			int cnt = 1;
			if(mm.containsKey(ttt)) {
				cnt += (int)mm.get(ttt);
			}
			mm.put(ttt, cnt);
			//System.out.println(ttt+":"+mm);
		}
		
		/*
		for (Object oo : mm.entrySet()) {
			Map.Entry me = (Map.Entry)oo;
			
			System.out.println(me.getKey()+" : "+me.getValue());
		}*/
		
		for (Object k : new TreeSet(mm.keySet())) {
			
			System.out.println(k+"\t"+ "*".repeat((int)mm.get(k)));
		}
		

	}

}
