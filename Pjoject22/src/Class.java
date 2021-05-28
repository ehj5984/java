import java.util.Scanner;

public class Class {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");

		Scanner s1 = new Scanner(System.in);

		int number = s1.nextInt(); // 4 입력
		System.out.println("사용자 입력 숫자는" + number + "입니다");

		boolean isPrime = true; // isPrime =true
		
		for (int i = 0; i < number; i++) {

			if (i < 2) {
				continue;
			}
			if (number % i == 0) {// 4%2 ==0
				isPrime = false;  // isPrime = false;
			}
		}

		if (isPrime == false) {
			System.out.println("소수가 아닙니다");
		} else {
			System.out.println("소수입니다");
		}

	}
}
