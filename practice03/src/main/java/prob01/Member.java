package prob01;

public class Member {
	private String id;
	private String name;
	private int point;
	
	public void setName(String name) {	// 이름 변경
		this.name = name;
	}
	public void getName(String name) {	// 이름 반환
		System.out.println(this.name);
	}
	
	public void setPoint(int point) {	// 포인트 변경
		this.point = point;
	}
	
	public void getPoint(int point) {	// 포인트 반환
		System.out.println(point);
	}
	
	public void setId(String id) {	// 회원 아이디 변경
		this.id = id;
	}
	
	public void getId(String id) {	// 회원 아이디 반환
		System.out.println(this.id);
	}
	
}