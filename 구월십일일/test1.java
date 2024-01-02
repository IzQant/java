package 구월십일일;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		int mach = 340;
		int distance = mach * 60 * 60;
		System.out.println("소리가 1시간 동안 가는 거리 :" + distance + "m");

		float radius = 10.0F;
		float area = radius * radius * 3.14F;
		System.out.println("반지름이" + radius + "인 원의 넓이 :" + area);

		Scanner in = new Scanner(System.in);
		System.out.print("원기둥의 밑면의 반지름은? :");
		double x = in.nextDouble();
		System.out.print("원기둥의 높이는? :");
		double y = in.nextDouble();
		System.out.printf("원기둥의 부피는 %f", x * x * 3.14 * y);

		System.out.print("원하는 정수 입력");
		int a = in.nextInt();
		if (a % 2 == 0)
			System.out.println(a + "은(는) 짝수입니다.");
		else
			System.out.println(a + "%은(는) 홀수입니다.");

	}

}
