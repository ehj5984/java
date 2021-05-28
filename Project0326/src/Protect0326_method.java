import java.util.Scanner;

public class Protect0326_method {

	Scanner s = new Scanner(System.in);	
	
	int weight = 0;
	int height = 0;
	
	public void userInput(){
		
		System.out.println("체중을 입력해주세요(kg) :");
		String userInputText = s.nextLine();
		weight = Integer.parseInt(userInputText);
		
		System.out.println("신장을 입력해주세요(cm) :");
		String userInputText2 = s.nextLine();
		height = Integer.parseInt(userInputText2);	
		
	}
	
	
	public void result() {
		
		double height2 = (double)height /100;
		double kaupIndex = (double) weight / (height2 * height2);
		
		
		if( kaupIndex >= 30) {
		System.out.println("비만");
		}	
		else if (kaupIndex >= 24) {
		System.out.println("과체중");
	    }
		else if (kaupIndex >= 20) {
		System.out.println("정상");
		}		
		else if (kaupIndex >15) {
		System.out.println("저체중");				
		}
		else if (kaupIndex >= 13) {
		System.out.println("영양실조");
	    }
		else if (kaupIndex < 10) {
		System.out.println("소모증");
}
}
}