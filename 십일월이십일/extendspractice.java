package 십일월이십일;

public class extendspractice {

	public static void main(String[] args) {
		circle c1 = new circle();
		ball b1 = new ball("빨간색");
		
		System.out.println("원 :");
		c1.findRadius();
		c1.findArea();
		
		System.out.println("\n공 :");
		b1.findRadius();
		b1.findColor();
		b1.findArea();
		b1.findVolume(); //ball이 circle의 매서드도 사용할 수 있음 -> 개쩌는데?
	}

}



