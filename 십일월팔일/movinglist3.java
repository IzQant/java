package 십일월팔일;
import java.util.Arrays;

public class movinglist3 {

	public static int[] reverse(int[] org) {
		int[] des = new int[org.length];
		for (int i = 0, j = des.length - 1; i < org.length; i++, j--)
			des[j] = org[i];
		return des;
	}
	public static void main(String[] args) {
		int[] data = {1, 3, 5, 7, 9};
		int[] result = reverse(data);
		System.out.print("변환 전 : ");
		for (int i : data)
			System.out.print(i + " ");
		System.out.print("\n변환 후 : ");
		for (int i : result)
			System.out.print(i + " ");

	}

}
