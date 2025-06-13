package collection_p;

import java.util.Stack;

//mp3 노래듣기를 구현하세요

//1. 노래 정보 :  트랙번호, 노래제목, 가수
//2. 노래 리스트 -->next 에 넣기
//3. 구현내용 다음곡, 이전곡, 트랙번호
class StackMusic{
	int no;
	String title, singer;
	
	StackMusic(int no, String title, String singer) {
		
		this.no = no;
		this.title = title;
		this.singer = singer;
	}

	@Override
	public String toString() {
		return "[" + no + ", " + title + ", " + singer + "]";
	}
	
}

public class StackMP3Main {
	
	Stack back = new Stack();
	Stack next = new Stack();
	Object now = null;
	
	StackMP3Main(){
		next.push(new StackMusic(10,"너에게닿기를","10CM"));
		next.push(new StackMusic(9,"남행열차","김수희"));
		next.push(new StackMusic(8,"거짓말","빅뱅"));
		next.push(new StackMusic(7,"너를위해","임재범"));
		next.push(new StackMusic(6,"아파트","윤수일"));
		next.push(new StackMusic(5,"땡벌","남진"));
		next.push(new StackMusic(4,"바람의노래","조용필"));
		next.push(new StackMusic(3,"어머나","장윤정"));
		next.push(new StackMusic(2,"슬픔활용법","김범수"));
		next.push(new StackMusic(1,"아줌마","태진아"));
		
		goNext();
		goNext();
		goBack();
		goBack();
		//goBack();
		//goBack();
		goNext();
		goNext();
//		goNext();
//		goNext();
//		goNext();
//		goNext();
//		goNext();
//		goNext();
//		goNext();
//		goNext();
//		goNext();
//		goNext();
//		goNext();
//		goNext();
		goTrack(3);
		goTrack(7);
		goTrack(2);
	}
	
	
	boolean moduleNext() {
		boolean res = !next.empty();
		if(res) {
			
			if(now!=null) {
				back.push(now);
			}
			now = next.pop();
		}
		
		return res;
	}

	
	void goNext() {
		System.out.println("goNext()--------------");
		if(!moduleNext()) {
			
			System.out.println("다음곡이 없습니다.");
		}
		
		ppp();
	}
	
	
	boolean moduleBack() {
		boolean res = !back.empty();
		if(res) {
			
			if(now!=null) {
				next.push(now);
			}
			now = back.pop();
		}
		
		return res;
	}
	
	void goBack() {
		System.out.println("goBack()--------------");
		if(!moduleBack()) {
		
			System.out.println("이전곡이 없습니다.");
		}
		
		ppp();
	}
	
	void goTrack(int no) {
		System.out.println("goTrack("+no+")--------------");
		StackMusic mNow = (StackMusic)now;
		if(no==mNow.no) {
			//System.out.println("현재곡입니다.");
		}else if(no>mNow.no){
			while(no>mNow.no) {
				moduleNext();
				mNow = (StackMusic)now;
			}
		}else {
			while(no<mNow.no) {
				moduleBack();
				mNow = (StackMusic)now;
			}
		}
				
		ppp();
	}
	
	void ppp() {
		System.out.println("현재:"+now);
		System.out.println("이전곡:"+back);
		System.out.println("다음곡:"+next);
	}

	public static void main(String[] args) {
		new StackMP3Main();
	}

}
