package tv;

public class TV {
	private int volum;	 	// 0~100
	private int channel;	// 1~255
	private boolean power;
	
	// getter setter를 사용하지 않고 채널과 음량을 높이고 내리고 하는 방법으로
	// true면 올리고, false면 내리고, 범위 설정
	// 코드 중복을 줄이기 - 기존 메소드를 사용하기
	public void status() {
		System.out.println("TV [power = off, chennel=10, volume=100]");
	}
}
