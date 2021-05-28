import java.util.Arrays;
import java.util.Random;

//import java.util.Arrays;
//
//public class Warming6 {
//public static void main(String[] args) {
//	int a[]= {7,21,8,43,3,5};
//	
//	int i = 0, j=0, tmp=0;
////	int number2 [] = a;
//	
//	for (i=0; i<a.length; i++) {           // i<a.length -1 
//		for (j = i+1; j<a.length; j++) {  // j<a.length-i 로 해야 쓸데없는 연산 빠짐
//			if (a[i]> a[j]) {
//			
//			tmp = a[i];
//			a[i] = a[j];
//			a[j]=tmp;
//		}
//			
//	}
//}System.out.println(Arrays.toString(a));
//}
//}

public class Warming6 {
	public static void main(String[] args) {

		int number[] = new int[20];
		Random r = new Random();
		for (int i = 0; i < number.length; i++) {
	         number[i] = r.nextInt(100);
	      }
		int i = 0, j = 0, tmp = 0;
		int ls[] = number;

		for (i = 0; i < ls.length -1 ; i++) {

			for (j = i; j < ls.length ; j++)

				if (ls[i] < ls[j]) {

					tmp = ls[i];
					ls[i] = ls[j];
					ls[j] = tmp;

				}

			System.out.println(Arrays.toString(ls));

		}
	}
}

//
//import java.util.Arrays;
//import java.util.Random;
//
//public class Warming6 {
//   public static void main(String[] args) {
//      int[] array = new int[20];
//      Random r1 = new Random();
//   
//      for (int i = 0; i < array.length; i++) {
//         array[i] = r1.nextInt(1001);
//      }
//      int tmp = 0;
//      for (int i = 0; i < array.length - 1; i++) {
//         for (int j = i + 1; j < array.length; j++) {
//            if (array[i] < array[j]) {
//               tmp = array[j];
//               array[j] = array[i];
//               array[i] = tmp;
//            }
//         }
//      }
//      System.out.println(Arrays.toString(array));
//   }
//}