import java.util.Random;
import java.util.Scanner;

public class Pppp {
	public static void main(String[] args) {
		Random r1 = new Random(); // ctrl shift o 잊지말기

		int randNum = r1.nextInt(3) + 1;
		System.out.println("컴퓨터 숫자 :" + randNum);

		Scanner s1 = new Scanner(System.in);
		int userNumber = s1.nextInt();
		System.out.println("사용자 숫자 :" + userNumber);

		if (randNum == 1) {
			System.out.println("컴퓨터 : 가위");
		}
		if (randNum == 2) {
			System.out.println("컴퓨터 : 바위");
		}
		if (randNum == 3) {
			System.out.println("컴퓨터 : 보");
		}

		if (userNumber == 1) {
			System.out.println("사용자 : 가위");
		}
		if (userNumber == 2) {
			System.out.println("사용자 : 바위");
		}
		if (userNumber == 3) {
			System.out.println("사용자 : 보");
		}

		if (randNum == 1 && userNumber == 2) {
			System.out.println("결과 : 사용자 승리");
		}
		if (randNum == 2 && userNumber == 3) {
			System.out.println("결과 :사용자 승리");
		}
		if (randNum == 3 && userNumber == 1) {
			System.out.println("결과 : 사용자 승리");
		}

		if (randNum == userNumber) {
			System.out.println("결과 : 무승부");
		}

		if (randNum == 2 && userNumber == 1) {
			System.out.println("결과 : 컴퓨터 승리");
		}
		if (randNum == 3 && userNumber == 2) {
			System.out.println("결과 : 컴퓨터 승리");
		}
		if (randNum == 1 && userNumber == 3) {
			System.out.println("결과 : 컴퓨터 승리");
		}
	}
}

//가위바위보 게임 사용자 vs 컴퓨터 숫자에 가위바위보를 맵핑 1. 가위 2.바위 3. 보 . 123 중 셋중하나 사용자와 랜덤숫자에 받으면 됨
// 사용자에게서 가위 바위 보 출력하고 숫자 출력하고 입력 받는 거 만들어