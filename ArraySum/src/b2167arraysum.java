
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.util.Scanner;
//
//public class b2167arraysum {
//
//	public static void main(String[] args) throws FileNotFoundException {
//		System.setIn(new FileInputStream("src/inputAS.txt"));
//
//		// TODO Auto-generated method stub
//		int n, m, k, sum = 0;
//		int[][] map;
//		Scanner sc = new Scanner(System.in);
//		
//		n = sc.nextInt();
//		m = sc.nextInt();
//		map  = new int[n+1][m+1];
//		
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=m; j++) {
//				map[i][j] = sc.nextInt();
//			}
//		}
//		
//		k = sc.nextInt();
//		for(int i=0; i < k;i++) {
//			sum = 0;
//			int x1 = sc.nextInt();
//			int y1 = sc.nextInt();
//			int x2 = sc.nextInt();
//			int y2 = sc.nextInt();
//			for(int a=x1; a<=x2; a++) {
//				for(int b=y1; b<=y2; b++) {
//					sum += map[a][b];
//				}
//			}
//			System.out.println(sum);
//		}
//		
//		
//	}
//
//}

// 3번. 
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class b2167arraysum {

   public static void main(String[] args) throws FileNotFoundException {
      System.setIn(new FileInputStream("src/inputAS.txt"));

      // TODO Auto-generated method stub
      int n, m, k, sum = 0;
      Scanner sc = new Scanner(System.in);
      
      n = sc.nextInt();
      m = sc.nextInt();
      int [][]map = new int[n+1][m+1];  // 배열 정의 배열은 0,0부터 시작하니까 원래 준 값에 1 더해서 시작 
      
      for(int i=1; i<=n; i++) {
         for(int j=1; j<=m; j++) {
            map[i][j] = sc.nextInt();   // 배열 만들어주는 거임. 
         }
      } // 배열 만들어줘 
      
      k = sc.nextInt();   // 몇번 실행할지 알려줘라 
      
      for(int i=0; i < k; i++) {
         sum = 0;
         int x1 = sc.nextInt();  // x,y 값 입력 받고 k 번 만큼 for문을 돌릴 때
         int y1 = sc.nextInt();
         int x2 = sc.nextInt();
         int y2 = sc.nextInt();
         
         for(int a=x1; a<=x2; a++) {  // x2까지 돌리는 동시에
            for(int b=y1; b<=y2; b++) {  // y2까지 합을 구해라  
               sum += map[a][b];
            }
         }
         System.out.println(sum);  // 그리고 sum을 도출해 
      }
      
      
   }

}