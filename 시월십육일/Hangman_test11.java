package 시월십육일;
import java.util.Scanner;
public class Hangman_test11 {

	public static void main(String[] args) {
		String hiddenString = "hello";
		StringBuffer outputString = new StringBuffer();
		Scanner scan = new Scanner(System.in);
		String user;
		
		for (int i = 0; i < hiddenString.length(); i++)
			outputString.append('-');
		System.out.println("\n단어(" + hiddenString.length() + "글자" + ");" + outputString);
		
		System.out.print("1 문자를 입력하세요: ");
		user = scan.next();
		char ch = user.charAt(0);
		for (int i = 0; i < hiddenString.length(); i++) {
			if (hiddenString.charAt(i) == ch) {
				outputString.setCharAt(i,  ch);
				System.out.println("\n단어 :" + outputString);
			}
		}
	}
	

}
