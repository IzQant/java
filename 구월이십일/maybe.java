package 구월이십일;

import java.util.Scanner;

public class maybe {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x, sum;
		while (true) {
			System.out.print("양의 정수를 입력하세요 : ");
			x = in.nextInt();
			if (x == 999)
				break;
			sum = 0;
			for (int i = 1; i <= x; i++)
				sum += i;
			System.out.printf("1부터 %d까지의 합은 %d입니다.\n", x, sum);
		}
		System.out.println("프로그램을 종료합니다!");

	}

}
