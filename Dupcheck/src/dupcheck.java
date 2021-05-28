import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/*
 * 0~10 자연수 배열을 중복을 제거하고 오름차순으로 출력하시오.
 */
public class dupcheck {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/input.txt"));
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int N;
		int[] arr;
		int[] cnt;

		for (int test_case = 1; test_case <= T; test_case++) {

			N = sc.nextInt();
			cnt = new int[11];
			arr = new int[N];

			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
				cnt[arr[i]]++;
			}
			System.out.println(Arrays.toString(arr)); // 배열 프린트

			for (int i = 0; i < 11; i++) {
//				if (cnt[i] > 0)
//					System.out.print(i);

//				중복제거 없이 오름차순 출력 
				if(cnt[i]>0) {
					for(int j=0; j < cnt[i]; j++) {
						System.out.print(i);
					}
				}
			}
			System.out.println();

		}

	}

}



//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.util.Arrays;
//import java.util.Scanner;
//
///*
// * 0~10 자연수 배열을 중복을 제거하고 오름차순으로 출력하시오.
// */
//public class Dupcheck {
//
//   public static void main(String[] args) throws FileNotFoundException {
//      System.setIn(new FileInputStream("src/inputDC.txt"));
//      Scanner sc = new Scanner(System.in);
//
//      int T = sc.nextInt();
//      int N;
//      int[] arr;
//      int[] cnt;
//      for (int test_case = 1; test_case <= T; test_case++) {
//         N = sc.nextInt();
//         cnt = new int[11];
//         arr = new int[N];
//         for (int i = 0; i < N; i++) {
//            arr[i] = sc.nextInt();
//            cnt[arr[i]]++;
//         }
//         
////         System.out.println(Arrays.toString(arr)); // 배열 프린트
//
//         for (int i = 0; i < 11; i++) {
//            if (cnt[i] > 0)
//               System.out.print(i);
//
//////            중복제거 없이 오름차순 출력 
////            if(cnt[i]>0) {
////               for(int j=0; j < cnt[i]; j++) {
////                  System.out.print(i);
////               }
//         }
//         System.out.println();
//      }
//
//   }
//
//}
