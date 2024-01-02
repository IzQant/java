package 십일월이십일;

public class ball extends circle {
	private String color;
	public ball(String color) {
		this.color = color;
	}
	
	public void findColor() {
		System.out.println(color + "공이다.");
	}
	
	public void findArea() {
		super.findArea();
		System.out.println("넓이는 4*(3.14 * 반지름 * 반지름)이다.");
	}
	public void findVolume() {
		System.out.println("부피는 (3.14 * 반지름 * 반지름 *반지름)이다.");
	}
}
