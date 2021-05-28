import java.util.Arrays;

public class Exec {

	public static void main(String[] args) {
		Score[] s = { new Score("이혜진", 80, 26), 
				new Score("ddd", 20, 30), 
				new Score("eee", 50, 26),
				new Score("fff", 20, 37), 
				new Score("ggg", 80, 26), 
				new Score("qqq", 87, 30), 
				new Score("aaa", 80, 26),
				new Score("zzz", 78, 65), 
				new Score("rrr", 80, 26), 
				new Score("ppp", 20, 50) };

		System.out.println(Arrays.toString(s));
//		System.out.println(Arrays.sort(aver));
		
		int totalMiddle = 0;
		int totalFinal = 0;
		int totalScore = 0;
	
	
		
		for(int i =0; i<s.length; i++) {
			totalMiddle = totalMiddle + s[i].Middle;
			totalFinal= totalFinal + s[i].Final;
			totalScore = totalScore + s[i].sum ;
			
		}
		
		double avgMiddleScore =(double)totalMiddle / s.length;
		double avgFinalScore =(double)totalFinal/ s.length;
		double avgtotalScore = (double)totalScore /s.length;
		
		System.out.println("중간고사 총점 : " + totalMiddle +", 중간고사 평균 : " +avgMiddleScore);
		System.out.println("기말고사 총점 : "+ totalFinal + "기말고사 평균 : "+ avgFinalScore  );
		System.out.println("전체 총점 : " + totalScore );
		
		
	
		for (int i=0; i<s.length; i++) {
			
			for(int j = 0; j <s.length -1; j++ ) {
					
				if (s[i].sum > s[j].sum) {
						
						Score temp = s[i];
						s[i]= s[j];
						s[j] = temp;
					}
						
			
			}
			
		
		}
		System.out.println(Arrays.toString(s)); 
	}
}
