package 십일월팔일;
public class movinglist4 {

	static Subject subjects[] = new Subject[4];
	
	public static void main(String[] args) {
		subjects[0] = new Subject("국어", 70);
		subjects[1] = new Subject("수학", 80);
		subjects[2] = new Subject("영어", 90);
		subjects[3] = new Subject("과학", 85);
		
		for (Subject s: subjects) {
			System.out.println(s.name + "점수:" + s.jumsu);
		}
		System.out.println("등급" + getGrade());
			

	}
	
	static char getGrade() {
		char grade;
		int sum = 0;
	}
	

}

class Subject {
	String name;
	int jumsu;
	
	public Subject(String name, int num) {
		this.name = name;
		this.jumsu = num;
	}
	
	
}
