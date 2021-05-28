import java.util.Scanner;

public class Quiz_4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		int arr[] = new int[N + 1];
		int sum;

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		for (int j = 0; j < N; j++) {
			sum += arr[j];
		}

	}
}
