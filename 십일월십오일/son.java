package 십일월십오일;

public class son {

	public static void main(String[] args) {
		Vehicle a = new Vehicle("검정", 150);
		a.show();
		System.out.println();
		
		Car c = new Car("파랑", 200, 1000, 5);
		Vehicle v = c;
		v.show();
		
	}

}

class Vehicle {
	String color;
	int speed;
	
	public Vehicle(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}
	
	void show() {
		System.out.println("색상 : " + color);
		System.out.println("속도 : " + speed);
	}
	
}

class Car extends Vehicle{
	int displacement;
	int gears;
	
	public Car(String color, int speed, int displacement, int gears) {
		super(color, speed);
		this.displacement = displacement;
		this.gears = gears;
	}
	void show() {
		System.out.println("색상 : " + color);
		System.out.println("자동차 속도 : " + speed);
		System.out.println("자동차 배기량 : " + displacement);
		System.out.println("자동차 기어 단수 : " + gears);
	}
}

