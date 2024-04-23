package prob5;

import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		int num = scanner.nextInt();
		String text = Integer.toString(num);
//		String s = Integer.toString(scanner.nextInt());
//		System.out.println(s);
		
		int cnt = 0;
		for(int i=0; i<text.length();i++) {
//			System.out.println(text.charAt(i));
			char c = text.charAt(i);
//			num = Integer.parseInt(text.charAt(i));
			if(c=='3' ||c == '6' ||c =='9') {
				cnt++;
			}
		}
		System.out.printf(text+ " ");
		for(int i = 0; i<cnt; i++) {
			System.out.print("짝");
		}
		
		
		
	}
}
