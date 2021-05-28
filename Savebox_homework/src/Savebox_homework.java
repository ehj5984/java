
import java.util.Scanner;

public class Savebox_homework {
	public static void main(String[] args) {

		Savebox_method box1 = new Savebox_method();
		Scanner s = new Scanner(System.in); // FOR문 밖으로 나가도됨
//		Scanner s1 = new Scanner(System.in);

		for (int i = 0; i < 999999; i++) {
			System.out.println("원하시는 메뉴를 선택하세요.");
			System.out.println("1 : 입금" + "\n" + "2 : 입금 + 메시지 입력" + "\n" + "종료를 원하시면 crash를 입력하세요");

//			Scanner s = new Scanner(System.in); // FOR문 밖으로 나가도됨
//			Scanner s1 = new Scanner(System.in);


			String userInputString = s.nextLine(); // 한 줄 씩 입력을 받는다는 것
							//int convertNum = Integer.parseInt(userInputString); 

			if (userInputString.equals("1")) { //문자열은 equals로

				System.out.println("금액을 입력하세요.");
				int userInputmoney = s.nextInt();
				

				System.out.println("딸그랑! " + userInputmoney);
				box1.deposit(userInputmoney);
			}

			else if (userInputString.equals("2")) {

				System.out.print("금액을 입력하세요");

				int userInputmoney2 = s.nextInt();
				box1.deposit(userInputmoney2);

				System.out.print("메시지를 입력하세요");
				String massage = s.nextLine();
				System.out.println("당신이 입력한 메시지는?" + massage);
				System.out.println("당신이 입력한 금액은?" + userInputmoney2);
			}

			else if (userInputString.equals("crash")) {
				System.out.print("총액 :");
				box1.withdraw();
				break;
			}
		}
	}
}

//if 랑 if else 이외 것들은 메소드박스를 이용해서 하면됨 
