
public class Base { // 공통처리가 가능한 부분은 여기에 모아놓기
	double areaSize = 0;
	String name;

	Base(String name) {
		this.name = name; // 삼각형인지 사각형인지 넣어주는
	}

	public void inputData() { // 파라미터를 넣어주는 곳
	
	}

	public void calcArea() {

	}

	public void printSize() {
		this.calcArea();
		System.out.println(name + "의 크기는 " + this.areaSize);
	}
}
