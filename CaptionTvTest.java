package ch7.sec01.exam01;

// 티비
class Tv {
	boolean power;   //전원상태 (on/off)
	int channel;     //채널
	void power ()       {power = !power;}
	void channelUp ()       {++channel;}
	void channelDown()       {--channel;}
}


// 캡쳐 티비
class CaptionTv extends Tv {
	boolean caption;   //캡션 상태
	void displayCaption (String text) {
		if (caption) { //캡션 탕대가 on(true)일 때만 text를 보여준다.
			System.out.println(text);
		}
	}
}

	class CaptionTvTest {
	public static void main(String args[]) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;  //상속받은 멤버
		ctv.channelDown();   //상속받은 멤버
		System.out.println(ctv.channel);  //채널 출력
		ctv.displayCaption("Hello World");
		ctv.caption = true;                //캡션(자막) 기능을 켠다.
		ctv.displayCaption ("Hello, World");
	}
}
