import java.util.Random;
import java.util.Scanner;

public class Project {
	public static void main(String[] args) {
		System.out.println("가위바위보 중 하나를 입력해주세요.");
		System.out.println("1 : 가위");
		System.out.println("2 : 바위");
		System.out.println("3 : 보");

		Scanner s1 = new Scanner(System.in);
		int userNum = s1.nextInt();

//		if (userNum < 1 || userNum > 3) {
//			System.out.println("1~3의 숫자를 입력하세요.");
//		}

		if (userNum == 1) {
			System.out.println("사용자는 가위를 냈습니다.");
		} else if (userNum == 2) {
			System.out.println("사용자는 바위를 냈습니다.");
		} else if (userNum == 3) {
			System.out.println("사용자는 보를 냈습니다.");
		}

		Random r1 = new Random();
		int comNum = r1.nextInt(3) + 1;

		if (comNum == 1) {
			System.out.println("컴퓨터는 가위를 냈습니다.");
		} else if (comNum == 2) {
			System.out.println("컴퓨터는 바위를 냈습니다.");
		} else if (comNum == 3) {
			System.out.println("컴퓨터는 보를 냈습니다.");
		}

		if (userNum == comNum) {
			System.out.println("비겼습니다.");
		} else {
			int nextUserNum = userNum + 1;
			if (nextUserNum > 3) {
				nextUserNum = 1;
			}

			if (nextUserNum == comNum) {
				System.out.println("사용자 승리");
			} else {
				System.out.println("컴퓨터 승리");
			}

		}

	}
} // 이 코드를 확실히 외우자 걍 출력할 때도 if를 쓰고 두가지 이상의 조건을 넣을 때도 if를 쓴다
