
import java.util.Arrays;
import java.util.Random;

public class Project31 {
	public static void main(String[] args) {
		int[] score = {0,0,0,0,0,0,0,0,0,0};
	
		// score에 점수를 넣어줘. 라는 메소드를 만들자 
		insertNumber(score);
		
		
		
		//확인
		System.out.println(Arrays.toString(score));
		calcScore(score); // score의 총합 구하기 
 
//		int[] score2 = new int[20];
//		insertNumber(score2);
//		System.out.println(Arrays.toString(score2));
		
	}
 
	public static void insertNumber(int[]k) {
	
		Random r1 = new Random();
		for (int i=0; i<k.length; i++) {
			k[i]= r1. nextInt(101);
				
	  }
  }
	
	public static void calcScore(int[] s) {
		int total =0;
		for (int i=0; i<s.length; i++) {
			total = total + s[i];
	 }
	 
		System.out.println(" 총합 : " + total);
	}
}


