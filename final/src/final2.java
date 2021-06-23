import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class final2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int[] newarr = {} ;
		
		// 배열 받기
		String input = sc.nextLine();
		String[] arr = sc.nextLine().split(",");
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		int[] final_result = new int[result.size()];
		
		
		int[] new_array = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
		// 배열첫번째 D로 지정 
		int D = new_array[0];
		 
		 
		for (int i = 0; i < new_array.length; i++) {
			if (new_array[i] % D == 0) {
				result.add(new_array[i]);
			}
		}

		if (result.size() == 0) {

			result.add(-1);

		} else {
	         for (int i = 0; i < result.size(); i++) {
	             final_result[i] = result.get(i);
	        }
	    }

	    Arrays.sort(final_result);
	    System.out.println(Arrays.toString(final_result));
	}
}
