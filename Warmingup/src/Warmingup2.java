public class Warmingup2 {
	public static void main(String[] args) {

		System.out.println(hj(10));

	}

	public static int hj(int n) {

		if (n==1 || n==2) // (n<=1)
			return 1;

		return hj(n - 1) + hj(n - 2);

	}

}

//
//
//public class Warmingup2 {
//	public static void main(String[] args) {
//	
//		int evensum = 0;
//	
//
//	for (int i = 0; i<100; i++) {
//	if((i+1) % 2 == 0) {
//		evensum = evensum + (i+1);
//}
//	
//		
//	}System.out.println("총합은" + evensum);
//
//	}
//}
//		
////	
//	public class Warmingup2 {
//	public static void main(String[] args) {
//			int sum = 0;
//				for (int i =0; i<101; i++) {
//						sum = sum + i ;
//					}System.out.println(sum);
//			
//			}
//
//	
//	}
//
//public class Warmingup2 {
//public static void main(String[] args) {
//	int number = 6; 
//	for (int i =0; i<9; i++) {
//		int number2 = i + 1; 
//		
//		int result = number * number2 ;
//		System.out.println(result);
//		
//		}
//		
//	}
//
//}
//
//
//public class Warmingup2 {
//public static void main(String[] args) {
//
//
//for (int i = 0; i < 5; i++) {
//	for (int j = 0; j < i + 1; j++) {
//		System.out.print("*");
//	}
//	System.out.println();
//}
//
//}
//
//}

//
//
//public class Warmingup2 {
//public static void main(String[] args) {
//
//
//for (int i = 5; i >0; i--) {
//	for (int j = 0; j < i ; j++) {
//		System.out.print("*");
//	}
//	System.out.println();
//}
//
//}
//
//}

////
////
//public class Warmingup2 {
//public static void main(String[] args) {
//	
//      System.out.println(myRecursive(5));
//
//   }
//   
//   // f(n) = n + f(n+1) 
//   // n >= 100; then exit
//   
//   public static int myRecursive(int n) {
//      if(n >= 0) return 1;
//      
//      return n * myRecursive(n-1);
//   }
//}
//   // return 1 + f(2)
//   //            return 2 + f(3)
//   //                   return 3 + f(4)
//   //                           return 4 + f(5)
//   //                                  return 5;
////
////
////
////
////
//
//
//
//
////5! 을 재귀함수로 출력해보세요.​
////
////100 부터 200까지의 합을 출력해보세요
////피보나치 
//
//
//
//public class Warmingup2 {
//public static void main(String[] args) {
//	
//    System.out.println(myRecursive(5));
//
// }
// 
// // f(n) = n + f(n+1) 
// // n >= 100; then exit
// 
// public static int myRecursive(int n) {
//    if(n >= 0) return 1;
//    
//    return n * myRecursive(n-1);
// }
//}
// // return 1 + f(2)
// //            return 2 + f(3)
// //                   return 3 + f(4)
// //                           return 4 + f(5)
// //                                  return 5;
//
//
