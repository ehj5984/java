
//
//public class Array2 {
//
//public static void main(String[] args) {
//int[][] array = {{95,80},{83,92,96},{78,83,93,87,88}};
//
//int sum=0;
//int count=0;
//double avg;
//
//for(int i=0; i for(int k=0;k sum += array[i][k];
//count++;
//}
//}
//System.out.println("배열 요소의 총 합 = "+sum);
//avg = (double)sum/count;
//System.out.println("배열 요소의 평균 = "+avg);
//}
//}


//
//for(int i=0; i<3; i++) {
//	System.out.print("["+i+"]행 열갯수: ");
//	int input = scan.nextInt();
//	arr[i] = new int[input]; // 2차원 배열 행렬 중 열.
//
//	for(int j=0; j<arr[i].length; j++) {
//		arr[i][j] = (int)(Math.random()*100)+1;
//		sum[i] += arr[i][j]; // 각 행의 더한 값을 다른 배열에 담아둔다. (5의 배수 판별을 위해)
//	}			
//}
//System.out.println();
//
//for(int i=0; i<arr.length; i++) {
//	for(int j=0; j<arr[i].length; j++) {
//		System.out.print(arr[i][j]+" ");
//	}
//	System.out.println();
//}
//System.out.println();
//
//for(int i=0; i<arr.length; i++) {
//	if(sum[i]%5==0) {
//		System.out.println("["+i+"]열의 합계(5의 배수): "+sum[i]);
//	}else {
//		System.out.println("["+i+"]열의 합계(5의 배수): 5의 배수가 아닙니다.");					
//	}
//}	
//}
//}

//package dp;
// 
//import java.util.Scanner;
// 
//public class baekjoon_2167 {
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        
//        //배열 크기 입력받아서 이차원 크기의 배열 생성
//        int row = sc.nextInt();
//        int col = sc.nextInt();
//        
//        int[][] arr = new int[row][col];
//        
//        // x의 크기 만큼 입력 받아 배열에 넣기
//        for ( int q = 0; q < row; q++ ){
//            
//            for( int w = 0; w < col; w++ ){
//                arr[q][w] = sc.nextInt();
//            }
//        }
//        
//        int k = sc.nextInt();
//        int i, j, x, y = 0;
//        int[] sum = new int[k];
//        
//        for( int q = 0; q < k; q++){
//            i = sc.nextInt();
//            j = sc.nextInt();
//            x = sc.nextInt();
//            y = sc.nextInt();
//            
//            int sumtest= 0;
//            for ( int w = i-1; w <= x-1; w++ ){
//                for ( int e = j-1; e <= y-1; e++ ){
//                    sumtest += arr[w][e];
//                }
//            }
//            sum[q] = sumtest;
//        }
//        
//        for( int num : sum) {
//            System.out.println(num);
//        }
//    }
//    
//}
// 

//
//package ArrayTest;
//
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
//package Level2;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//public class Test {
//
//	public static void main(String[] args) {
//		System.out.println("정렬전");
//		System.out.println("-----------------------");
//		int[] arr = {2, 3, 1, 4, 5, 2, 3, 6, 9};
//		for(int i : arr)
//			System.out.print(i + " ");
//		System.out.println();
//		System.out.println("-----------------------");
//		System.out.println();
//		System.out.println();
//		Set<Integer> set = new HashSet<Integer>();
//		for(int i : arr)
//			set.add(i);
//		
//		List<Integer> list = new ArrayList<Integer>(set);
//		Collections.sort(list);
//		System.out.println("정렬후");
//		System.out.println("-----------------------");
//		for(int i : list)
//			System.out.print(i + " ");
//		System.out.println();
//		System.out.println("-----------------------");
//			
//	}
//}



\