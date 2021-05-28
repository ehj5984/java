import java.util.Scanner;
//5585 번
public class Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();

		int count = 0;

		int arr[] = { 500, 100, 50, 10, 5, 1 };
		int coin = 1000 - input;
		
		for (int i = 0; i < arr.length; i++) {
			if (coin >= arr[i]) {
				count += coin / arr[i];
				coin = coin % arr[i];
			}
		}
		System.out.println(count);
	}
}
