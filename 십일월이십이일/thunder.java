package 십일월이십이일;

public class thunder {

	public static void main(String[] args) {
		Phone[] phones = { new Phone("황진이"), new Telephone("길동이", "내일"), new Smartphone("민국이", "갤러그") };
		for (Phone phone : phones) {
			phone.talk();
			if (phone instanceof Telephone)
				((Telephone) phone).autoAnswering();
			if (phone instanceof Smartphone)
				((Smartphone) phone).playGame();
		}
	}

}

class Phone {
	protected String owner;
	public Phone(String owner) {
		this.owner = owner;
		
	}
	void talk() {
		System.out.println(owner + "가 통화 중");
	}
}

class Telephone extends Phone {
	private String when;
	public Telephone(String owner, String when) {
		super(owner);
		this.when = when;
	}
	public Telephone(String owner) {
		super(owner);
		this.when = "내일";
	}
	void autoAnswering() {
		System.out.println(owner + "가 부재 중이니 " + when + "에 연락 바람");
	}
}

class Smartphone extends Telephone {
	private String game;
	public Smartphone(String owner, String game) {
		super(owner);
		this.game = game;
	}
	void playGame() {
		System.out.println(owner + "가 " + game + "게임 중");
		
	}
}