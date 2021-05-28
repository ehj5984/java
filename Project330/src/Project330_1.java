
public class Project330_1 {
	public String name; // 이름이라고 불리는 property 설정
	public int korScore =0 ;    // 성적관리 개체
	public int engScore = 0 ;
	public int mathScore =0 ;
	
	// 이걸 바탕으로 성적관리 객체를 만듦 
	public void setName(String name) { // 세터는 메소드야 들어온 변수를 가지고 내 프로퍼티의 내용을 바꿔줌
		this.name = name;
	//set어쩌고는 변수를 설정해주는 세터

	}
	public void setKorScore(int score) {
		korScore = score ;
	
	}
	public void setEngScore(int score) {
		this.engScore  = score;  // this 라고 불리는 건 자기 자신을 뜻함. property 쓸때는 this를 꼭 붙이자
			
	}
		
	public void setMathScore(int mathscore) {		
		this.mathScore  = mathscore; //method에서 사용하는 변수와 property변수가 똑같을 때 this 를 쓴다. 
	}
	
}


//하나의 이름으로 여러개를 함께 관리할 수 있는 것 
//public class Project330_1 {
//	public String name; // 이름이라고 불리는 property 설정
//	public int korScore =0 ;    // 성적관리 개체
//	public int engScore = 0 ;
//	public int mathScore =0 ;
//	
//	public void printInfo() {
//		System.out.println (this.name+ ":" 
//	           + "국어" +  this.korScore + ","
//	           + "영어" +  this.engScore + ","
//	           + "수학" +  this.mathScore 
//	           ); // THIS를 붙이면 자동으로 PROPERTY라고 인식 
//	}
//}
//
//
//// 둘이 한 세트
//public String getName() {
//	return this.name;
//}
//}
//
//
//public void setName(String name) {
//	this.name = name ;
//}
//}
//
//
//





