
public class Practice330 {
	public String name ; // 이름들어가는 부분 
	public int korScore = 0; //국어 점수 부분
	public int engScore = 0;
	public int mathScore = 0;
	public int totalScore = 0; // 토탈 점수 부분  
	
	
	Practice330(String name, int korScore, int engScore, int mathScore){ // 생성자 만들어
		this.name = name;
		this.korScore = korScore;
		this.engScore = engScore;
		this.mathScore =  mathScore;
		this.totalScore = korScore + engScore + mathScore ;
	} // 여기까지 클래스 구현 완료 
		
	
	}


