import java.util.Random;
import java.util.Scanner;

public class Calc {
	public static void main(String[] args) {
		
		System.out.println("숫자를 입력해주세요.");
		// 사용자가 보기 편하게 최대한 안내 메세지 껴주기
		
		Scanner s1 = new Scanner(System.in);
		int userNumber = s1.nextInt();
        //명령어 nextint 찾아봐    
		// 우리는 객체지향 언어를 쓰기때문에 특정 이름을 정한 것
        // 사용자한테 입력받은 숫자는 이렇게 만들어짐

		Random r1 = new Random();
		int randNumber = r1.nextInt(100) + 1 ;
		//new를 통해 랜덤숫자를 만들고 그것을 r1이라고 칭했음 
		// 100개의 숫자만 만들거야 0~99까지로 나오니까 + 1 해주면 0으로 나누는 경우의 수를 없애줌 

		System.out.println("사용자가 입력한 숫자 : " + userNumber + " , 랜덤 생성된 숫자 :" + randNumber);
		
		// 숫자가 무엇인지 스크린에 나오도록

		//이제결과 출력하는 거
		// 3 + 4  <-7 (숫자)
		// "" + 3 + 4 <- 34 로 나옴 (문자열)
		
		// 숫자를 문자열로 바꾸는 방법 중요
		
		int resultNum = userNumber + randNumber;
		System.out.println("" + userNumber + "+" + randNumber + "=" + resultNum);
		
		resultNum = userNumber - randNumber;
		System.out.println("" + userNumber + "-" + randNumber + "=" + resultNum);
		
		resultNum = userNumber * randNumber;
		System.out.println("" + userNumber + "*" + randNumber + "=" + resultNum);
		
		double resultNum2 = userNumber / (double) randNumber;
		resultNum2 = Math.round(resultNum2 * 100) / (double)100;
	
		// 100을 곱해서 반올림 한 후 100으로 나누면 소숫점 둘 째 자리까지 나오는 것 double casting들어감 
		//double을 math 앞쪽에 붙여도 댐
		
		System.out.println("" + userNumber + "/"+ randNumber + "=" + resultNum2);
		
		resultNum = userNumber % randNumber;
		System.out.println("" + userNumber + "%" + randNumber + "=" + resultNum);
		
		
		userNumber++; //증감
		userNumber--;
		resultNum = 1 + 3 * 4 - 2 / 4;
		// 연산자 우선순위 높이고 싶으면 괄호치면 돼 -> 1 + 3 * (4 - 2) / 4;  걍 우선 순위 두려면 무조건 괄호를 치자
		// 모든 언어에서 통용됨 
	}
}
