import java.util.Scanner;

public class SavaBox14 {
 public static void main(String[] args) {
	for(int i =0; i < 999999; i++) { //무한루프와 비슷한 형태로 
	 
		System.out.println("원하시는 메뉴를 선택해주세요.");
		System.out.println("1 : 돈 입금");
		System.out.println("2 : 돈 입금 + 메세지 입력");
		System.out.println("종료를 원하시면 crash를 입력하세요.");
	
	Scanner s = new Scanner(System.in);
	String userInputString = s.nextLine();  //-> 모든 입력에 대해 나오게 
	
	System.out.println(userInputString);
	int convertNumber = Integer.parseInt(userInputString);
	
	// 숫자를 문자로 바꾸는 
	// "123" => 123
	// 123 =>"123"     "" + 123

	
	if(userInputString.equals("crash")) {
		break;   //crash 입력하면 for문 종료
		
			}
	
		}
 	}
}
