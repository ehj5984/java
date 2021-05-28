import java.util.Scanner;

// 1. 성적 입력 받는 부분 (1명) 구현
//   - 객체 데이터 (클래스 구현)
//   - 입력받는 코드
//   - 한명 부터 한 후에 for문으로 구현 
// 2. 총점 구하는 부분

public class ExacPractice330 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Practice330[] practice = new Practice330[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.println(" 이름을 입력해주세요. ");
			String name = scanner.nextLine();

			System.out.println(" 국어점수를 입력해주세요. ");
			String inputString = scanner.nextLine();
			int korScore = Integer.parseInt(inputString);

			System.out.println(" 영어점수를 입력해주세요. ");
			inputString = scanner.nextLine();
			int engScore = Integer.parseInt(inputString);

			System.out.println(" 수학점수를 입력해주세요. ");
			inputString = scanner.nextLine();
			int mathScore = Integer.parseInt(inputString);

//			String Practice330[] = new Practice330(name, korScore, engScore, mathScore);
			// int [] number = new int [4];
		}
	}
}