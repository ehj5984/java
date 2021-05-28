import java.util.Scanner;

public class Eqaa { 
public static void main(String[] args) {  //main치고 컨트롤스페이스
	System.out.println("두 수의 합");
	
	
	// 숫자입력
	
	
	int userInputnumber1 = 0;
	int userInputnumber2 = 0;
	
	Scanner s = new Scanner(System.in);
	
	userInputnumber1 = s.nextInt();
	userInputnumber2 = s.nextInt();
	
	System.out.println(userInputnumber1+ userInputnumber2);
	
}
}