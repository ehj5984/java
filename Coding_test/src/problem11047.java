import java.util.Scanner;

// 4200원 만들 때 동전의 개수가 몇개? 
// next int 2 번  ,, n = next int

// for문으로 i를 n까지  돌려
//public class problem11047 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		int N = sc.nextInt();
//		int K = sc.nextInt();
//		int count = 0;
//		int[] arr = new int[10];
//
//		for (int i = 0; i < N; i++) {
//			arr[i] = sc.nextInt();
//
//		} // 여기까지가 입력처리
//
//		for (int i = N - 1; i >= 0; i--) {
//			if (K >= arr[i]) {
//				count += K / arr[i];
//				K = K % arr[i];
//			}
//		}
//	}
//}


public class problem11047 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int T = sc.nextInt();
		int count = 0;
		int []arr = new int [10];
		
		for (int i =0; i < N ; i++) {
			arr [i] = sc.nextInt(); 
		}
		
		for (int i = N-1 ; i >=0 ; i--) {
			if( T > arr[i]) {
				count += T / arr[i];
				T = T % arr[i];
			}
		}
		System.out.println(count);
	}
}