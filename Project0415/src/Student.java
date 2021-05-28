// 학생관리용 객체 클래스
public class Student {
	String name;
	int middleScore;
	int finalScore;
	int sumScore;
	int avgScore;
	int totalScore;
	
	//1.
	Student (){
		
	}
	//2.
	Student(String name){
		this.name =name;
		this.sumScore= this.middleScore + this.finalScore ;
	}
	//3.
//	Student (String name, int middleScore, int finalScore){
//		this.name =name;
//		this.middleScore =middleScore;
//		this.finalScore =finalScore;
//		this.sumScore= this.middleScore + this.finalScore ;
//	}

	
	@Override
	public String toString() {
		return "" +this.name
				+ "(" + this.middleScore + ","
				+ this.finalScore+ ")"  ;
		
		
	}

	public void sumScore() {
		this.sumScore = this.middleScore + this.finalScore;
	}

	public void avgScore() {
		this.avgScore = (this.middleScore + this.finalScore) /2;
	}
}


