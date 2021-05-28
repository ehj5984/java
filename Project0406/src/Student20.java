
public class Student20 {
	private String name;
	private String phone;
	private String address;
	private int age;

	Student20(String name, String address, String phone, int age) {
		this.name = name; // 객체 내부 property로  접근할 때 this라는 것을 쓴다. 확실하게 하기위해 this를 쓰자 
		this.address = address;
		this.phone = phone;
		this.age = age;
		this.printInfo();
	}

	private void printInfo() {  // private 쓸라면 위에 this.printInfo(); 넣어줘야돼.
								// protected 쓸라면 상속에서 접근된 애들만 쓸 수 있다.
		System.out.println("이름 : " + this.name + ", 주소 : " + this.address + ", 연락처 : " + this.phone + ", 나이 : " + this.age);

	}
	
	public void setName(String name) {
		this.name = name ;
		
	}
	public String getName() {
		return this.name;
	}
	
//	@Override
//	public String toString() { // System.out.println(s1); 을 메모리 주소값이 아닌 내가 원하는 형태로 하고 싶을 때 
//		return "이름 : " + this.name + ", 주소 : " + this.address + ", 연락처 : " + this.phone + ", 나이 : " + this.age ;
//	}
	
	@Override
	public String toString() { // System.out.println(s1); 을 메모리 주소값이 아닌 내가 원하는 형태로 하고 싶을 때 
		return "이름 : " +  ", 나이 : " + this.age ;
	}
	
	
	
}
