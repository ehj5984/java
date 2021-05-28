import java.util.Arrays;

public class Exec { // 객체 데이터를 쓰는 가장 간단한 형태
	public static void main(String[] args) {
//		Student20 s1 = new Student20();
//		s1.name = "이혜진";
//		s1.address = "서울시 양천구";
//		s1.phone = "010-3911-5984";
//		s1.age = 26;
//
//		Student20 s2 = new Student20();
//		s2.name = "김선호";
//		s2.address = "서울시 마포구";
//		s2.phone = "010-3911-5984";
//		s2.age = 30;

//		Student20 s1 = new Student20("이혜진", "서울시 양천구", "010-3911-5984", 26);
//		Student20 s2 = new Student20("김선호", "서울시 마포구", "010-3911-5984", 30); // this 쓰고 이렇게 묶어서 쓸 수 있음
//		s1.printInfo();
//		s2.printInfo();
		
		
//		s1.setName("이성훈");
//		System.out.println(s1.getName());
		
//		System.out.println(s1); //메모리 주소값이 나옴 (어차피 못 씀.-> 내가 원하는 형태로 출력하고 싶다면?)  
		
		Student20 [] s = {new Student20("이혜진", "서울시 양천구", "010-3911-5984", 26)
				, new Student20("김선호", "서울시 마포구", "010-3911-5984", 30)};
		
		System.out.println(Arrays.toString(s));
		
		}
		
	}
