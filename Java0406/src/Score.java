import java.util.Arrays;

public class Score {
	String name;
	int Middle;
	int Final;
	int sum ;
	double average ;
	int totalScore;

	Score(String name, int Middle, int Final) {
		this.name = name;
		this.Middle = Middle;
		this.Final = Final;
		this.sum = this.Middle + this.Final;
		this.average =  (this.Middle + this.Final)/2;
	}

//	public void printInfo() {
//		System.out.println("이름 : " + this.name + 
//				", 중간성적 : " + this.Middle + 
//				", 기말성적 : " + this.Final);}
//	


		public String toString() { 
		return "이름 : " + this.name + ", 중간점수 : " + this.Middle + ", 기말점수 : " 
				+ this.Final + ", 총합 : " + this.sum +", 평균 :" + this.average +"\n" ;
}
		
		
		public void average() {
			double aver [] = {this.average};
			Arrays.sort(aver);
		}
}
