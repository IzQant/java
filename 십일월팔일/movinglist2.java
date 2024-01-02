package 십일월팔일;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class movinglist2 {

	public static void main(String[] args) {
		int[] data = {1, 3, 5, 7, 9};
		int[] result = reverse(data);
		
		System.out.println(Arrays.toString(result));
		

	}
	
	public static int[] reverse(int[] data) {
		List<Integer> result = new ArrayList<>();
		for (int i = data.length - 1; i >= 0; i--) {
			result.add(data[i]);
		}
		
		int[] reversedArray = new int[result.size()];
		for (int i = 0; i < result.size(); i++) {
			reversedArray[i] = result.get(i);
		}
		
		return reversedArray;
	}

}
