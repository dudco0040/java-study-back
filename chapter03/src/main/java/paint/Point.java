package paint;

public class Point {
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void show(boolean visible) {
		if(visible) {  //true
//			System.out.println("점(" + x +"," + y + ")을 그렸습니다.");	 
			// 아래의 show() 메소드가 존재하고, 기존에 있는 메소드가 있다면 활용해야 나중에 변경 및 수정에 용이하다. 
			show();
		}else {		//false
//			System.out.println("점(" + x +"," + y + ")을 지웠습니다.");
			disappear();
		}
	}

	public void show() {
		System.out.println("점(" + x +"," + y + ")을 그렸습니다.");
	}

	public void disappear() {
		System.out.println("점(" + x +"," + y + ")을 지웠습니다.");
	}
}
