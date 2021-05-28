package midterm_answer;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class inputprocessing {
	static int N;
	static int AnswerN;

	public static void main(String args[]) throws Exception {
		
		System.setIn(new FileInputStream("src/inputTest.txt"));
 
		Scanner sc = new Scanner(System.in);
		
		int T; 

		T = sc.nextInt();
		sc.nextLine();

		 int sum;
		 for(int i=0; i < T; i++) {
			 sum = 0;
			 char[] c = sc.nextLine().toCharArray();
//			 System.out.println(Arrays.toString(c));
			 for(int j=0; j < c.length ; j++) {
				 if(c[j] == 'A') sum++;
			 }
			 System.out.println(sum);

		 }

		
		
	}
}
