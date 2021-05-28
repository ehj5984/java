import java.io.FileInputStream;
import java.util.Scanner;

public class match {
public static void main(String[] args) {
	System.setIn(new FileInputStream("src/sample_input.txt"));
	Scanner sc = new Scanner(System.in);
	int testCase = sc.nextInt();
	int firstNum;
	int count = 0 ;
	int answer = 0;
	
	for (int i=0; i< testCase; i++) {
		firstNum = sc.nextInt();
		char[]arr = sc.next().toCharArray();
		
		if( arr[firstNum -1] == '(' ){ 
			for (int j = firstNum - 1; j < arr.length; j++) {
				if(arr[j]=='(')
			}
		}
	}
}
}
