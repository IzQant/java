package 시월사일;

class Ball_ {
	double radius = 2.0;

	double getVolume() {
		return 4 / 3 * 3.14 * radius * radius * radius;
	}
}

public class Ball2 {

	public static void main(String[] args) {
		Ball_ ball_1 = new Ball_();
		System.out.println(ball_1.getVolume());

	}

}
