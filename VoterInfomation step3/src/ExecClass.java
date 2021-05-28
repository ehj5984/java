import java.util.ArrayList;
import java.util.Scanner;

public class ExecClass {
	public static void main(String[] args) {
		String name;
		String address;
		int age = 0;
		int ageSum = 0;

		Scanner sc = new Scanner(System.in);

		ArrayList<VoterInfo> s1 = new ArrayList<VoterInfo>();
		ArrayList<Party> party = new ArrayList<Party>();

		for (int i = 0; i < 99999; i++) {
			System.out.println("원하시는 메뉴를 선택해주세요. \n");
			System.out.println("1 : 유권자 정보 입력 ");
			System.out.println("2 : 전체 목록 보기 ");
			System.out.println("3 : 유권자 기본 통계 ");
			System.out.println("4 : 유권자 별 선호 정당 입력 ");
			System.out.println("5 : 유권자 별 선호 정당 목록 보기 ");
			System.out.println("종료를 원하시면 '종료'를 입력하세요.");

			String userInputString = sc.nextLine();
			System.out.println(userInputString);

			if (userInputString.equals("1")) {
				System.out.println(" 이름을 입력하세요 ");
				name = sc.nextLine();

				System.out.println(" 주소를 입력하세요 ");
				address = sc.nextLine();

				System.out.println(" 나이를 입력하세요 ");
				age = sc.nextInt();

				s1.add(new VoterInfo(name, address, age));

			} else if (userInputString.equals("2")) {
				System.out.println("<< 유권자 전체 목록 >>");

				for (int j = 0; j < s1.size(); j++) {
					System.out.println(
							"이름 : " + s1.get(j).name + "  |  주소 : " + s1.get(j).address + "  |  나이 : " + s1.get(j).age);
				}

				System.out.println("===================================");
				System.out.println("===================================");

			} else if (userInputString.equals("3")) {

				System.out.println("<< 유권자 기본 통계 >>");
				System.out.println(" 1. 전체 유권자 수 : " + s1.size());

				for (int j = 0; j < s1.size(); j++) {
					ageSum += s1.get(j).age;
				}

				double avgAge = (double) ageSum / s1.size();

				System.out.println(" 2. 유권자 평균 나이 : " + avgAge);
				System.out.println(" 3. 연령대 별 유권자 수  : ");

				System.out.println("===================================");
				System.out.println("===================================");

			} else if (userInputString.equals("4")) {
				System.out.println(" 선호 정당을 넣을 주소를 입력하세요 ");
				String userAddrsss = sc.nextLine();
				String userName = "";
				int userAge = 0;

				for (int j = 0; j < s1.size(); j++) {
					if (s1.get(j).address.equals(userAddrsss)) {
						userName = s1.get(j).name;
						userAge = s1.get(j).age;
					}

				}
				if (userAddrsss.equals("")) {
					System.out.println("입력한 주소의 유권자가 없습니다.");

				} else {
					System.out.println("A 정당, B정당, C정당 중 선호하는 정당을 입력해주세요 ");

					String partyString = sc.nextLine();

					party.add(new Party(userName, userAddrsss, userAge, partyString));
				}
				System.out.println("===================================");
				System.out.println("===================================");

			} else if (userInputString.equals("5")) {
				String totalParty;

				for (int j = 0; j < party.size(); j++) {
					System.out.println(
							party.get(j).name + "(주소 : " + party.get(j).address + ") 의 선호 정당 : " + party.get(j).party);

				}

			} else if (userInputString.equals("종료")) {
				break;

			}

		}
	}
}
