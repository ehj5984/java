import java.util.Scanner;
import java.io.FileInputStream;

class Solution {
	static int N;
	static int AnswerN;

	public static void main(String args[]) throws Exception {

		System.setIn(new FileInputStream("C:\\Users\\SMART-24\\eclipse-workspace\\Solution\\src\\input.txt"));

		Scanner sc = new Scanner(System.in);

		// 가로 스캐닝 할 때 FOR문하나 , 세로 스캐닝할 때 FOR문 하나
		// 대각선 스캐닝
		int rabbitNum = sc.nextInt();
		int x = sc.nextInt(); // 여우 x
		int y = sc.nextInt(); // 여우 y
		int rabbit[][] = new int[rabbitNum][rabbitNum];

		for (int i = 1; i <= rabbitNum; i++) {
			rabbit[i][0] = sc.nextInt();
			rabbit[0][i] = sc.nextInt();

			if (rabbit[i][0] == x || rabbit[0][i] == y) {
				AnswerN++;
			}

			if (rabbit[0][i] - rabbit[0][i] / rabbit[i][0] - rabbit[i][0] == 1) {
				AnswerN++;
			}

			// ///////////////////////////////////////////////////////////////////////////////////////////
			/*
			 * 이 부분에 여러분의 알고리즘 구현이 들어갑니다. 여러분의 정답은 AnswerN에 저장되는 것을 가정하였습니다.
			 */
			// ///////////////////////////////////////////////////////////////////////////////////////////

			System.out.println("#" + AnswerN);
		}
	}
}

/*
 * 2 3 10 10 1 5 6 8 2 17 4 3 3 2 1 4 2 5 3 4 5
 */

//3 // 토끼 수 
//10 10//여우 좌표 
//1 5 //토끼좌표
//6 8 // 토끼 좌표
//2 17 // 토끼 좌표 
//4 3 3 2 1 4 2 5 3 4 5
//1 3 3 1 1
