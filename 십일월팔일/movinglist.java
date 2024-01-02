package 십일월팔일;
import java.util.ArrayList;
import java.util.Scanner;

public class movinglist {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> scores = new ArrayList<>();
		int data;
		int n = 0;
		
		while ((data = in.nextInt()) >= 0)
			scores.add(data);
		for (int i = 0; i < scores.size(); i++)
			System.out.println(scores.get(i));

	}

}
