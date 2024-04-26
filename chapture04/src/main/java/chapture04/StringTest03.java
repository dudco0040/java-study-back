package chapture04;

public class StringTest03 {
	
	public static void main(String[] args) {
		String s1 = "Hello" + "World" + "java" + 17;	//  이게 왜 되는가?
		new StringBuffer("Hello")
			.append("World")
			.append(" java")
			.append(17)
			.toString();
		
		System.out.println(s1);
	}
}

// 주로 1번째처럼 사용하지만,
// 2번쨰 경우처럼 명시적으로 사용해야 할 때가 있음