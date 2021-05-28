
public class Savebox_method {

	int coins = 0; // 변수지정 save box라고 불리는 객체의 속성값

	// String messages = new String();
	// int value = Integer.parseInt(userInputString);

	public void deposit(int value) {
		coins = coins + value;
	}

	public void withdraw() {
		System.out.println(coins);
	}
}



//Scanner s = new Scanner(System.in);
//String userInputString = scanner.nextLine(); 이거를 deposit 안에 써도 됨
// 특정한 클래스를 만들어서 사용할 수 있음. 시키고 싶은 일을 메소드의 형태로 만들어 넣어줌
// public void는 똑같이 쓰고 메소드 이름은 내가 명령시키고 싶은 이름에 근접하게 쓰는 게 좋음
// save box method를 new 통해 실체를 만들어서 box1 이라고 지정함.
// 이제 box1에게 deposit 혹은 withdraw의 일을 시킨다 
