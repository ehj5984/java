import java.util.Scanner;

public class VoterInfo {

	String name;
	String address;
	int age;

	Scanner sc = new Scanner(System.in);

	public VoterInfo(String name, String address, int age) {
		this.name = name;
		this.address = address;
		this.age = age;
	}

}
