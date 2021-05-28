import java.util.Scanner;
// this는 나한테 있는 것 : 서클 클래스에 있는 것을 디스로 사용할 수 있음
// super는 베이스에 있는 생성자를 실행하라는 뜻 

public class Circle extends Base {
	double pi = 3.14;
	double inputNum = 0;

	Circle(String name) {
		super(name); // 부모 클래스 생성자에 접근 

	}

	@override
	public void inputData() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("반지름을 입력해주세요.");
		String inputText = scanner.nextLine();
		inputNum = Double.parseDouble(inputText);

	}

	@Override
	public void calcArea() {

		areaSize = Math.round(inputNum * inputNum * pi * 100) / (double) 100;

	}

}
