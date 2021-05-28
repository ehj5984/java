import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Solution {

	public static void main(String args[]) throws Exception {

		System.setIn(new FileInputStream("res/sample_input.txt"));

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int[] arr = new int[x];
		
		ArrayList list = new ArrayList();
		
		for (int i = 0; i < arr.length ; i++) {

			arr [i] = sc.nextInt();
			
			if (!list.contains(arr[i])) {
				list.add(arr[i]);
			}
			
		}
		System.out.println(list);
		

		Arrays.sort();
		for (int i=0; i< list.length; i++ ) {
			
		}
		
	}
//	
//		Arrays.sort(list);
//		for (int i=0; i< list.length; i++ ) {
//			
//		}
}









		




		
		
		
		
		
		
		
		
		
		
		

//
//
//int k = sc.nextInt();
//int i, j, x, y = 0;
//int[] sum = new int[k];
//
//for( int q = 0; q < k; q++){
//    i = sc.nextInt();
//    j = sc.nextInt();
//    x = sc.nextInt();
//    y = sc.nextInt();
//    
//    int sumtest= 0;
//    for ( int w = i-1; w <= x-1; w++ ){
//        for ( int e = j-1; e <= y-1; e++ ){
//            sumtest += arr[w][e];
//        }
//    }
//    sum[q] = sumtest;
//}
//
//for( int num : sum) {
//    System.out.println(num);
//}
//}
//
//}
