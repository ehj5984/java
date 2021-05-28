import java.util.Scanner;
// 1.고객 정보에 별점 프로퍼티 추가
// 2.별점 관리용 객체를 새로 만들기 -- 얘는 중복으로 관리 가능 .. 이걸로 구현을 
public class Customer {
	String name;
	String phoneNumber;
	

	
	
	Scanner sc = new Scanner(System.in);

	public Customer(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

//	public String toString() {
//		return "이름 : " + this.name + " || 번호 : " + this.phoneNumber;
//	}

}
