//
//public class Exec330 {
//	public static void main(String[] args) {
//		
//		Project330_1 s1 = new Project330_1();
//		
////		s1.setName("김선호");
//		s1.name = "김선호";   // 메소드를 통하지 않아도 직접 접근해서 처리가 가능하다. 
////		s1.setKorScore(100);
//		s1.korScore = 100;  // 메소드를 통하지 않아도 직접 접근해서 처리가 가능하다. 
//		s1.setEngScore(100);
//		s1.setMathScore(100);
//		// s1안에 객체를 묶어서 다님
//		System.out.println(s1.name + ":"+ s1.korScore);
//		
//		
//		Project330_1 s2 = new Project330_1();
//		
//		s2.setName("이혜진");
//		s2.setKorScore(50);
//		s2.setEngScore(10);
//		s2.setMathScore(90);
//		
//		// s2안에 객체를 묶어서 다님
//
//
//	}
//
//}

// 하나의 이름으로 여러개를 함께 관리할 수 있는 것 
public class Exec330 {
	public static void main(String[] args) {
		
		Project330_2 s1 = new Project330_2("김선호",100,100,100);
		

		Project330_2 s2 = new Project330_2("이혜진",50,10,90);
	
//		s2.name = "이혜진";
//		s2.korScore = 50;
//		s2.engScore = 10;
//		s2.mathScore = 90;
		
		// s2안에 객체를 묶어서 다님
		
		s2.printInfo();

	}

}