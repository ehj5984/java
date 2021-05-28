import java.util.Scanner;

public class Triangle extends Base { // 이 클래스는 base클래스를 바탕으로 만들 것
	double baseLine = 0;
	double height = 0;

	Triangle(String name) {
		super(name);

	}

	public void inputData() {		Scanner scanner = new Scanner(System.in);
		
		System.out.println("밑변을 입력해주세요.");
		String inputText = scanner.nextLine();
		this.baseLine = Double.parseDouble(inputText);
		
		System.out.println("밑변을 입력해주세요.");
		inputText = scanner.nextLine();
		this.height = Double.parseDouble(inputText);
	}

	public void calcArea() {

		this.areaSize = (this.baseLine * this.height) / (double) 2;
	}
}