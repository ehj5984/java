import java.util.ArrayList;
import java.util.Scanner;

public class ExecClass {
	public static void main(String[] args) {
		// list, map, queue
		String name;
		int age;
		String address;
		String department;

		Scanner sc = new Scanner(System.in);

		ArrayList<CustomClass> c = new ArrayList<CustomClass>();
		// CustomClass c1 = new CustomClass();

		for (int i = 0; i < 99999; i++) {
			System.out.println("---원하시는 메뉴를 선택하세요----");
			System.out.println("1. 등록하기");
			System.out.println("2. 출력하기");
			System.out.println("3. 수정하기");
			System.out.println("4. 삭제하기");
			System.out.println("종료를 원하시면 '종료'를 입력해주세요");

			String userInput = sc.nextLine();
			System.out.println(userInput);

			if (userInput.equals("1")) {
				System.out.println("사원의 부서를 입력해주세요");
				department = sc.nextLine();

				System.out.println("사원의 이름을 입력해주세요");
				name = sc.nextLine();

				System.out.println("사원의 주소를 입력해주세요");
				address = sc.nextLine();

				System.out.println("사원의 나이를 입력해주세요");
				age = sc.nextInt();

				c.add(new CustomClass(department, name, age, address));

			} else if (userInput.equals("2")) {
				System.out.println("전체 목록 보기");

				for (int j = 0; j < c.size(); j++) {
					System.out.println("부서 :" + c.get(i).department + "// 이름 :" + c.get(j).name + "// 나이 :"
							+ c.get(i).age + "// 주소 :" + c.get(i).address);
				}

				System.out.println("=============================================");

			} else if (userInput.equals("3")) {
				System.out.println("수정할 사원의 이름을 입력하세요");

				userInput = sc.nextLine();
				if (userInput.equals(""))

					System.out.println("=============================================");

			} else if (userInput.equals("4")) {
				System.out.println("=== 사원 삭제 ===");
				System.out.println("> 삭제할 사원 이름을 입력해주세요 : ");
				name = sc.nextLine();

				for (int k = 0; k < c.size(); k++) {
					if (name == c.get(k).name)
						c.remove(k);
				}

			}

		}
	}
}
