package chapture04;

public class StringTest03 {
	
	public static void main(String[] args) {
		
		// String Builder
//		String s1 = "Hello" + "World" + "java" + 17;
//		new StringBuilder("Hello")
//			.append("World")
//			.append(" java")
//			.append(17)
//			.toString();
		
		// String Buffer
		String s1 = "Hello" + "World" + "java" + 17;	//  이게 왜 되는가?
		new StringBuffer("Hello")
			.append("World")
			.append(" java")
			.append(17)
			.toString();
		
		System.out.println(s1);
		
		
		String s2 = "";
		for(int i = 0; i<1000000; i++) {
//			s2 = s2 + "h";
//			s2 = new StringBuffer(s2).append("h").toString();
			// 두 코드는 같음
			// 속도가 매우 느림
		}
		
		StringBuffer sb = new StringBuffer("");
		for(int i = 0; i<1000000; i++) {
			sb.append("h");
		}
		String s3 = sb.toString();  // 반복문의 수가 클 경우, 이 방법을 사용하는 것이 더 빠르다. 
	}
}

// 주로 1번째처럼 사용하지만,
// 2번쨰 경우처럼 명시적으로 사용해야 할 때가 있음 (4/26)

// String Builder, String Buffer 결과가 같음 (4/29)