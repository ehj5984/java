package midterm_answer;

import java.util.Arrays;
import java.util.Scanner;

public class CT_bigN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] E = sc.nextLine().split(" ");
		int n = Integer.parseInt(E[0]);
		int m = Integer.parseInt(E[1]);
		int k = Integer.parseInt(E[2]);

		int[] data = new int[n];

		for (int i = 0; i < n; i++) {
			data[i] = sc.nextInt();
		}
//		System.out.println(Arrays.toString(data));

		Arrays.sort(data);
		int first = data[n - 1];
		int second = data[n - 2];

		int result = 0;
		int tempK = k;
		for (int i = 0; i < m; i++) {

			if (tempK == 0) {
				result = result + (second);
				tempK = k;
			} else {
				result = result + (first);
				tempK = tempK - 1;
			}
		}
		System.out.println(result);

	}

}
