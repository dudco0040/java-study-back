package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Goods[] goods = new Goods[COUNT_GOODS];

		// 상품 입력

		// 상품 출력
		String line = sacnner.nextLine();
		// 한번만 받고 /3개로 분리해서 받음
		String[] data = line.split(" ");
		
		String name = data[0];
		int price = Integer.parseInt(data[1]);
		int price = Integer.parseInt(data[2]);
		
		// 자원정리
		scanner.close();
	}
}

//Goods를 구현하는 문제 
//count
//reference array?
//