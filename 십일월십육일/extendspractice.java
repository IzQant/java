package 십일월십육일;

public class extendspractice extends point {
	String color;
	void setColor(String color) {
		this.color = color;
	}
	void showColorpoint() {
		System.out.print(color);
		showpoint();
	}
	public static void main(String[] args) {
		extendspractice cp = new extendspractice();
		cp.set(3, 4);
		cp.setColor("red");
		cp.showColorpoint();
	}

}

class point {
	int x, y;
	void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	void showpoint() {
		System.out.println("(" + x + "," + y + ")");
	}
}
