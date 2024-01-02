package 십일월십육일;

public class circlearray {

	public static void main(String[] args) {
		Circle[] circles = new Circle[5];
		
		for (int i = 0; i < circles.length; i++) {
			circles[i] = new Circle(i + 1.0);
			System.out.printf("원의 넓이(반지름 : %.1f) = %.2f\n", circles[i].radius, circles[i].findarea());
		}

	}

}

class Circle {
	double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	double findarea() {
		return 3.14 * radius * radius;
	}
}
