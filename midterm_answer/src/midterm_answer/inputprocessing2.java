package midterm_answer;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class inputprocessing2 {
	static int N;
	static int AnswerN;

	public static void main(String args[]) throws Exception {
		
		System.setIn(new FileInputStream("src/inputTest2.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T; 
		int N = 10;
		T = sc.nextInt();
		sc.nextLine();

		 int sum;
		 for(int i=0; i < T; i++) {
			 sum = 0;
			 String[] E = sc.nextLine().split(" ");
			 int[] intArray = Stream.of(E).mapToInt(Integer::parseInt).toArray();
			 Arrays.sort(intArray);	
			 
//			 Arrays.stream(intArray).forEach(System.out::print);
			 Arrays.stream(intArray).forEach(x->{System.out.print(x+" ");});


//			 for(int k: intArray){
//			    System.out.print(k+" ");
//			 }
			 System.out.println();
		 }

		
		
	}
}
