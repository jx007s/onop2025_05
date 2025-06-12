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
		goNext();
		//goNext();
		//goNext();
		//goNext();
		goUrl("줌");
	}
	
	void goUrl(String url) {
		System.out.println("goUrl ("+url+")-----------------");
		
		next.clear();
		
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
		if(!next.empty()) {
			back.push(now);
			now = next.pop();
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


//mp3 노래듣기를 구현하세요

//1. 노래 정보 :  트랙번호, 노래제목, 가수
//2. 노래 리스트 -->next 에 넣기
//3. 구현내용 다음곡, 이전곡, 트랙번호

