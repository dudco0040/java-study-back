package paint;

public class Main {

	public static void main(String[] args) {
		Point point = new Point();
//		point.setX(10);
//		point.setY(20);
		drawPoint(point);
//		point.disappear(); // 지우는 메소드를 따로 만들지 말고
		point.show(false);  //true/false - 두 가지 기능을 파라미터로 사용
	}
	
	private static void drawPoint(Point point) {
		point.show();
	}

}
