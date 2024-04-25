package prob04;

public class StringUtil {
	public static String concatenate(String[] str) {	// 배열 타입의 파라미터 받기
		// 문자열을 결합하여 리턴하는 메소드 구현
		String result = "";
		
		for(int i = 0; i< str.length; i++){
			result = result.concat(str[i]);
			
		}
		
		return result;
	}
}


//concatenate 메소드 완성하기