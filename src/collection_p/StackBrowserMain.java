package collection_p;

import java.util.Stack;

public class StackBrowserMain {
	
	Object now = null;
	Stack back = new Stack();
	Stack next = new Stack();
	
	StackBrowserMain(){
		goUrl("나베르");
		goUrl("구그레");
		goUrl("거시기");
		goUrl("나테");
		goBack();
		goBack();
		goBack();
		goBack();
	}
	
	void goUrl(String url) {
		System.out.println("goUrl ("+url+")-----------------");
		
		if(now!=null) {
			back.push(now);
		}
		
		
		now = url;
		ppp();
	}
	
	void goBack() {
		System.out.println("goBack()-----------------");
		if(!back.empty()) {
			next.push(now);
			now = back.pop();
		}else {
			System.out.println("이전페이지가 없습니다.");
		}
		
		ppp();
	}
	
	
	void goNext() {
		System.out.println("goNext()-----------------");
		if(!back.empty()) {
			next.push(now);
			now = back.pop();
		}else {
			System.out.println("다음페이지가 없습니다.");
		}
		
		ppp();
	}
	
	void ppp() {
		System.out.println("현재 : "+now);
		System.out.println("이전 : "+back);
		System.out.println("다음 : "+next);
	}

	public static void main(String[] args) {
		new StackBrowserMain();

	}

}

