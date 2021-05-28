import java.util.Arrays;
import java.util.Random;

public class Project30 {
	public static void main(String[] args) {

		int[][] number = new int[4][4]; // 4*4 배열이 만들기. 2차원 배열은 1차원 배열을 묶어서 배열로 만든 것
//	int[][]= number = {{0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}} 초기값 이렇게도 선언가능

//	int [] number = new int [4]; // y축을 만든겨
//  number[0] <-- 배열 x	  

//	     number[0] = new int [4];	  // x축을 만듦
//       number[1] = new int [4];	  
//       number[2] = new int [4];	  
//       number[3] = new int [4];	  

		System.out.println(Arrays.toString(number)); // 주소값이 출력되는 형태

		Random r = new Random();

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				number[i][j] = r.nextInt(200);
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("(" + i + "," + j + ") : " + number[i][j] + "   ");
			}
//       System.out.println(); // 줄바꿈 할 거면 써 
		}
		
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				number[i][3] = number[i][3] + number[i][j]; // x축 합계
				number[3][j] = number[3][j] + number[i][j]; // y축 합계
				number[3][3] = number[3][3] + number[i][j]; // 총 합계
			}
		}

		
		System.out.println(" 계산 결과 ");
		
		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number[0].length; j++) {
				System.out.println("(" + i + "," + j + ") : " + number[i][j] + "   ");
			}
		}
	}
}

// 공유파일에 오렬줌 
