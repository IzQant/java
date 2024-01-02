package 구월십삼일;

import java.util.Scanner;

public class testsecond {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("5자리 숫자를 입력하세요 :");
		int a = in.nextInt();
		int h = 0;
		int jj = 0;
		in.close();

		int t1, t2, t3, t4, t5;
		t1 = a % 10;
		if (t1 % 2 == 0)
			jj += 1;
		else
			h += 1;
		a /= 10;
		t2 = a % 10;
		if (t2 % 2 == 0)
			jj += 1;
		else
			h += 1;
		a /= 10;
		t3 = a % 10;
		if (t3 % 2 == 0)
			jj += 1;
		else
			h += 1;
		a /= 10;
		t4 = a % 10;
		if (t4 % 2 == 0)
			jj += 1;
		else
			h += 1;
		a /= 10;
		t5 = a % 10;
		if (t5 % 2 == 0)
			jj += 1;
		else
			h += 1;
		System.out.println("1의 자리 :" + t1);
		System.out.println("10의 자리 :" + t2);
		System.out.println("100의 자리 :" + t3);
		System.out.println("1000의 자리 :" + t4);
		System.out.println("10000의 자리 :" + t5);

	}

}
