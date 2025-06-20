package thread_p;


import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.JOptionPane;

class ThTimer extends Thread{
	
	boolean endChk = false;
	
	@Override
	public void run() {
		for (int i = 20; i > 0; i--) {
			
			if(endChk) {
				break;
			}
			
			System.out.println(i);
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		endChk = true;
		System.out.println("타이머종료");
	}
}

class ThExam extends Thread{
	LinkedHashMap<String, String> exam;
	
	ThTimer tm;  //타이머를 멤버필드로 가져온다
	
	ThExam(ThTimer tm) {
		this.tm = tm;
		
		exam = new LinkedHashMap<String, String>();
		exam.put("동네주민","임");
		exam.put("범인은?","b");
		exam.put("1+1=","귀");
		exam.put("숙제는?","없어");
		exam.put("내일은?","보강");
	}
	
	@Override
	public void run() {
		int cnt = 0;
		
		for (Map.Entry<String, String> qq: exam.entrySet()) {
			
			if(tm.endChk) { //타이머 끝났는지 확인
				break;
			}
			
			String answer = JOptionPane.showInputDialog(qq.getKey());
			
			if(tm.endChk) { //타이머 끝났는지 확인
				break;
			}
			if(answer.equals(qq.getValue())) {
				cnt++;
			}
			System.out.println(answer);
		}
		tm.endChk = true;
		System.out.println("시험종료 : "+cnt);
	}
}


public class ExamMain {

	public static void main(String[] args) {
		ThTimer timer = new ThTimer();
		ThExam ex = new ThExam(timer);
		timer.start();
		ex.start();

	}

}
