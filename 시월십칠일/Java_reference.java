package 시월십칠일;
//call by reference
class Number {
	int x;
	int y;
}
public class Java_reference {
	static void swap(Number z) {
		int temp = z.x;
		z.x = z.y;
		z.y = temp;
	}
	public static void main(String[] args) {
		Number n = new Number();
		n.x = 10;
		n.y = 20;
		System.out.println("swap() 메소드 호출전 " + n.x + "," + n.y);
		swap(n);
		System.out.println("swap() 메소드 호출후 " + n.x + "," + n.y);
	}
}
