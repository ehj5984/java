import java.util.Scanner;

//각행에서 a의 개수가 몇개인지 출력
public class Quiz_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N;
		int T = sc.nextInt(); // 전체 배열 개수
		int count = 0;

		for (int test_case = 0; test_case < T; test_case++) {
			N = sc.nextInt();
			String[] arr = new String[N];

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == "A") {
					count++;
				}
			}
			// test case 배열에서 문자 "A" 개수 카운트
		}
		System.out.println(count);
	}
}
