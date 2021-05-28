import java.util.Arrays;
import java.util.Random;

// 학생관리 실행 클래스
public class ExecClass {
	public static void main(String[] args) {

		
		
//	//Student class 의 1과 매치	
//	Student s1 = new Student();
//	
//	s1.name = "홍길동";
//	s1.middleScore = 990;
//	s1.finalScore = 800;
//	
//	
//	//2와 매치
//	Student s2 = new Student("둘리 ");
//	
//	//3과 매치
//	Student s3 = new Student("또치 ", 500, 400);
	
		Student[] class1 = {
				new Student("가혜진"),
				new Student("나혜진"),
				new Student("다혜진"),
				new Student("라혜진"),
				new Student("바혜진"),
				new Student("사혜진"),
				new Student("아혜진"),
				new Student("자혜진"),
				new Student("차혜진"),
				new Student("타혜진"),
				
		};
		
		
		// 랜덤으로 점수값 받기
		Random random = new Random ();
		for(int i = 0; i < class1.length; i++) {
			class1[i].middleScore = random.nextInt(101);
			class1[i].finalScore = random.nextInt(101);
			class1[i].sumScore();
		}
		
	    // 총점
		int totalMiddleScore = 0;
		int totalFinalScore = 0;
		
		
		
		for (int i = 0; i < class1.length; i++) {
			
			totalMiddleScore = totalMiddleScore + class1[i].middleScore;
			totalFinalScore = totalFinalScore + class1[i].finalScore;
		}
		
		// 평균 점수 
		double avgMidScore = (double)totalMiddleScore / 10;
		double avgFinScore = (double)totalFinalScore / 10;

		// 반 전체 점수, 반 평균
		int totalScore = totalMiddleScore + totalFinalScore ;
		int avgTotScore = (totalMiddleScore + totalFinalScore)/2 ;
		
		System.out.println("반 전체 중간고사 총점 : " + totalMiddleScore + "  ||  중간고사 평균 : " + avgMidScore);
		
		System.out.println("반 전체기말고사 총점 : " + totalFinalScore + "  ||  기말고사 평균 : " + avgFinScore);
		
		System.out.println("반 총점 : " + totalScore + "  ||  반 평균 : " + avgTotScore);
		
		
		
		
		for (int i = 0; i < class1.length - 1; i++) {
			
			for (int j = i + 1; j < class1.length; j++) {
				
				if (class1[i].sumScore < class1[j].sumScore) {
					 //정렬이 , , , 왜 안되지
					
					Student temp = class1[i];
					class1[i] = class1[j];
					class1[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(class1));
	
				
	}
}
