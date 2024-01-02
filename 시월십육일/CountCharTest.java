package 시월십육일;

public class CountCharTest {
	static int countChar(String s, char c) {
		int count = 0;
		for (int i = 0; i < s.length(); i++)
			if (s.charAt(i) == c)
				count++;
		return count;
	}

	public static void main(String[] args) {
		System.out.println(countChar("jazz", 'z'));

	}

}
