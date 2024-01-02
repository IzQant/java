package 시월십팔일;
//1전이 3번으로, 2번이 1번으로, 3번이 2번으로
import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		int s1, s2, s3;
		
		Su hh;
		
		
		
		while (true) {
			s1 = in_out(1);
			s2 = in_out(2);
			s3 = in_out(3);
			
			if (s1 == s2) {
				System.out.println("같은 수를 입력해서 종료합니다.");
				break;
			} else if (s2 == s3) {
				System.out.println("같은 수를 입력해서 종료합니다. :");
				break;
			} else if (s3 == s1) {
				System.out.println("같은 수를 입력해서 종료합니다. :");
			}
			if (s1 == s2) {
				hh = new Su(s1);
				break;
			
			
			} else {
				hh = new Su(s1, s2, s3);
				System.out.println("교환전");
				System.out.printf("%3d %3d %3d \n", hh.s1, hh.s2, hh.s3);
				hh.change();
				System.out.println("교환후");
				System.out.printf("%3d %3d %3d \n", hh.s1, hh.s2, hh.s3);
			}
		}

	}
	
	public static int in_out(int b) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("%d번째 수를 입력하세요 :", b);
		int a = scanner.nextInt();
		return a;
	}

}

class Su {
	int s1, s2, s3;
	
	public Su (int s1) {
		this.s1 = s1;
		this.s2 = s1;
		this.s3 = s1;
	}
	
	public Su (int s1, int s2, int s3) {
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}
	
	public void change() {
		int temp = this.s1;
		this.s1 = this.s3;
		this.s2 = this.s1;
		this.s3 = this.s2;
		this.s3 = temp;
	}
}