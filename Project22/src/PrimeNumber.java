
public class PrimeNumber {
	public static void main(String[] args) {

		// 얘네 전체를 묶어서 반복시키면 됨
		for (int j = 0; j < 100; j++) {
			// boolean isPrime = true ;
			// 불린은 flag변수
			// 일반적으로 false로 둠

			int number = j + 1; // 숫자에 j+1을 하면 100번 반복. j가 0~99니까
			if (number < 2) { // 1은 소수가 아니니깐 반복되지 않게 하기 위해 for 문 바깥에서 2보다 작은 수를 넘겨
				continue;
			}

			boolean isPrime = true;

			for (int i = 0; i < number; i++) { // 입력받은 숫자까지 제대로 출력이 되는지

				if (i < 2) {
					continue; // continue를 이용해 0과 1은 넘긴다는 것
				}
				if (number % i == 0) { // 나누어졌다는 건 나머지가 0 이라는 것
					isPrime = false;
					// break써도 됨.
				}

			}

			if (isPrime == true) {
				System.out.println("" + number + "소수입니다");
			} else {
				System.out.println("소수가 아닙니다");
			}
		}

	}

}