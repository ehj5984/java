import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class final1 {

	static int N;
	static int AnswerN;

	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);

		String[] firstLine = sc.nextLine().split(" ");
		String[] secondLine = sc.nextLine().split(" ");

		int[] first_array = new int[firstLine.length];
		int[] second_array = new int[secondLine.length];

		for (int i = 0; i < firstLine.length; i++) {
			first_array[i] = Integer.parseInt(firstLine[i]);
			second_array[i] = Integer.parseInt(firstLine[i]);
		}

		
		Arrays.sort(first_array);
		Arrays.sort(second_array);

		for (int i = 0; i < first_array.length; i++) {
			if (first_array[i] == second_array[i]) {
				System.out.println("t");
			} else {
				System.out.println("f");
			}
		}
	}
}
