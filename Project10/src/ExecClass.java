import java.util.Scanner;

public class ExecClass {
public static void main(String[] args) {
	System.out.println("화면에 숫자를 입력해주세요!");
	
	//밑 창에 숫자입력
	
	int userInputnumber = 0;
	
	Scanner s = new Scanner(System.in);// 하고 ctrl shift o 해야 맨 위에 적힘
	userInputnumber = s.nextInt(); //입력받은 숫자를 나에게 넘겨 
	
	System.out.println("당신이 입력한 숫자는"+ userInputnumber);
} 
}
