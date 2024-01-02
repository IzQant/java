package 십일월일일;
import java.util.Scanner;
import java.util.Random;

public class lacotepractice {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		int com[] = new int[3];
		while (com[0] == 0)
			com[0] = r.nextInt(10);
		while (com[1] == com[0] || com[1] == 0)
			com[1] = r.nextInt(10);
		while (com[2] == com[1] || com[2] == com[0] || com[2] == 0)
			com[2] = r.nextInt(10);
		
		int count = 0;
		
		while (true) {
			int ans[] = new int[3];
			int strike = 0, ball = 0;
			for (int i = 0; i <= 2; i++) {
				System.out.printf("%d번째 숫자 :", i+1);
				int a = in.nextInt();
				ans[i] = a;
			}
			
			for (int j = 0; j < com.length; j++) {
				for (int k = 0; k < ans.length; k++) {
					if (com[j] == ans[k] && j != k) {
						ball += 1;
					} else if (com[j] == ans[k] && j == k) { 
						strike += 1;
					}
				}
			}
			count += 1;
			System.out.printf("%s 스트라이크 %s 볼\n", strike, ball);
			if (strike == 3) {
				System.out.println("게임 끝");
				System.out.printf("%s번째 시도 성공", count);
				break;
			}
		}
	}
}
