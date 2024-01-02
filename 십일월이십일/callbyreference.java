package 십일월이십일;

public class callbyreference {
	static void swap(Number z) {
		int temp = z.x;
		z.x = z.y;
		z.y = temp;
	}
	public static void main(String[] args) {
		Number n = new Number();
		n.x = 10;
		n.y = 20;
		System.out.println(n.x + "," + n.y);
		swap(n);
		System.out.println(n.x + "," + n.y);
	}

}

class Number {
	int x;
	int y;
}