package 구월이십일;

import java.util.Scanner;

public class letsgo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s1, s2, sum;
		while (true) {

			System.out.printf("1번째 수를 입력하세요 : ");
			s1 = in.nextInt();
			System.out.printf("2번째 수를 입력하세요 : ");
			s2 = in.nextInt();
			if (s2 == 0)
				break;
			sum = 0;
			System.out.print(s1);
			int i;
			for (i = s1; i <= s2; i++) {
				sum += i;
				System.out.print("+");
				System.out.printf("%c %d\n", i, "+");
			}
			System.out.printf("= %d\n", sum);

		}
	}

}
