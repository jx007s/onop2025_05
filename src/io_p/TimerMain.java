package io_p;

public class TimerMain {

	public static void main(String[] args) {
		for (int i = 20; i > 0; i--) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(i);
		}

	}

}
