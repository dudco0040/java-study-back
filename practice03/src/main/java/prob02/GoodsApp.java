package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		Goods[] goods = new Goods[COUNT_GOODS];		// 입력 받는 개수의 크기의 배열 생성 - 제품, 가격, 개수 - 배열 X
		//Goos 클래스의 배열 
		// 상품 입력
		// 3개의 객체를 입력받을 것 - 
		for(int i = 0; i< COUNT_GOODS; i++) {
			String input = scanner.nextLine();  	// 형식: 제품명 가격 수량
			String[] inputArr = input.split(" ");	// 배열에 저장
			
			String name = inputArr[0];
			int price = Integer.parseInt(inputArr[1]);
			int count = Integer.parseInt(inputArr[2]);
			
			Goods g = new Goods(); //실제로 선언을 해줌
			// set 값을 업데이트
			g.setName(name);
			g.setPrice(price);
			g.setCount(count);
			
			goods[i] = g;
			System.out.println(goods);
		}

		// 상품 출력
//		for(i = 0; i<inputArr.length(); i++) {
//			
//		}  for 문이 끝남과 동시에 inputArr 변수에 있는 내용은 쓸 수 없음
		
		for (Goods g:goods) {
			
			System.out.println(g.getName() + "(가격:" + g.getPrice() + ")이 " + g.getCount() + "개 입고 되었습니다.");
		}
		
		// 자원정리
		scanner.close();
	}
}

//Goods를 구현하는 문제 
//count
//reference array?
//