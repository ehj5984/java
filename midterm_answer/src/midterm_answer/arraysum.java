package midterm_answer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class arraysum {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/inputArraySum.txt"));

		int n, m, k, sum = 0;
		int[][] map;
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		map  = new int[n+1][m+1];
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=m; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		k = sc.nextInt();
		for(int i=0; i < k;i++) {
			int rowsum = 0;
			int colsum = 0;
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();

			for(int row = 0; row < map.length; row++) {
				rowsum += map[row][y1];
			}
			for(int col = 0; col < map[x1].length; col++) {
				colsum += map[x1][col];
			}
			System.out.println(rowsum+" "+colsum);
		}
		
		
	}

}