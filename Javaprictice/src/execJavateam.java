import java.util.Scanner;
//수치 입력 inputData
//넓이 계산 calcArea
public class execJavateam {

	   int lowerline;
	   int height;
	   double calcarea;
	   
	public void inputData() {
	
	Scanner scanner = new Scanner(System.in);

	System.out.println("밑변을 입력해주세요");
	String inputString = scanner.nextLine();
	lowerline = Integer.parseInt(inputString);
	
	System.out.println("높이를 입력해주세요");
	inputString = scanner.nextLine();
	height = Integer.parseInt(inputString);
	
	  
}

	public void calcArea() {
		
	calcarea = lowerline * height ;
	
    System.out.println("사각형 넓이는 " + calcarea + "입니다." );
 }
}
