import java.util.ArrayList;
import java.util.Scanner;

//ArrayList<Student> s3 = new ArrayList<Student>();
//	s3.add(new Student("이순신", 900));  // 어레이 리스트는 add를 통해 하나씩 추가 해야됨
//	s3.add(new Student("김선호", 200));
//	
//	
//	s3.get(0).name = "이혜진";
//	s3.get(0).middleScore = 500;
//	
//	for (int i=0; i<s3.size(); i++) {
//		 System.out.println(s3.get(i).name + "의 중간고사 점수 :"+ s3.get(i).middleScore);
//	}

public class ExecClass {
	public static void main(String[] args) {

		String name;
		String phoneNumber;

		Scanner sc = new Scanner(System.in);

		ArrayList<Customer> s1 = new ArrayList<Customer>();

		for (int i = 0; i < 99999; i++) {
			System.out.println("원하시는 메뉴를 선택해주세요.");
			System.out.println("1 : 고객 정보 입력 ");
			System.out.println("2 : 전체 목록 보기 ");
			System.out.println("종료를 원하시면 '종료'를 입력하세요.");

			String userInputString = sc.nextLine(); // -> 모든 입력에 대해 나오게
			System.out.println(userInputString);

			if (userInputString.equals("1")) {
				System.out.println(" 이름을 입력하세요 ");
				name = sc.nextLine();
				System.out.println(" 전화번호를 입력하세요 ");
				phoneNumber = sc.nextLine();

				s1.add(new Customer(name, phoneNumber));

			} else if (userInputString.equals("2")) {
				System.out.println("전체 목록 ");

				for (int j = 0; j < s1.size(); j++) {
					System.out.println(s1.get(j).name +s1.get(j).phoneNumber );
				}
				
				System.out.println("------------------------- ");
				System.out.println("------------------------- ");
			
			} else if (userInputString.equals("종료")) {
				break;

			}
		}
	}
}