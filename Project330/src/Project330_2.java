
public class Project330_2 {

		public String name; // 이름이라고 불리는 property 설정
		public int korScore =0 ;    // 성적관리 개체
		public int engScore = 0 ;
		public int mathScore =0 ;
		public int totalScore = 0;
		
		Project330_2(String name, int korScore, int engScore, int mathScore){
		this.name = name;
		this.korScore = korScore;
		this.engScore = engScore;
		this.mathScore =  mathScore;
		this.totalScore = korScore + engScore + mathScore ;
		
		}


		public void printInfo() {
			System.out.println (this.name+ ":" 
		           + "국어" +  this.korScore + ","
		           + "영어" +  this.engScore + ","
		           + "수학" +  this.mathScore+ ','
		           + "총점" +  this.totalScore
		           ); // THIS를 붙이면 자동으로 PROPERTY라고 인식 
		
		}
		
	}

