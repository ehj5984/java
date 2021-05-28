import java.util.Arrays;
import java.util.Random;


public class Arrayclass {
	public static void main(String[] args) {
	
		// int arr[]={0,0,0,0,0};10
		
		int [] grades = new int[10]; //변수선언	
		for (int i = 0; i < grades.length; i++) {
			
			Random r1 = new Random();
			int randNum = r1.nextInt(101) ;
			
			System.out.println(""+ i + " 성적 점수를 넣어주세요.");			
			grades [i]= randNum ;
		} 
		
		int total = 0 ;
		for (int i = 0; i < grades.length; i++) {
			total = total + grades[i] ;
		}
		
		System.out.println("처리할 점수들은 다음과 같습니다." );
		System.out.println(Arrays.toString(grades)); //ctrl shift o
		System.out.println( "합계 : " + total );
		System.out.println( "평균 : " + total /10); 
	}
}
//
//   Random r1 = new Random();
//   int score[ ]= {0,0,0,0,0,0,0,0,0,0};
//   for (int i = 0, i<score.length; i++) {
//	score[i]  = r1.nextInt(101);
//	
//}
//System.out.println(Arrays.toString(score));
//	
//    int total = 0;
//	for (int i = 0; i < score.length; i++) {
//		total = total +score[i];
//	} 
//	System.out.println( "합계 : " + total );
//	
//	double avg = (double)total / score.length;	
//	avg =Math.round(avg * 100) /100 ; // 소숫점 올리기 
//	
//	System.out.println( "평균 : " + avg);
//}
//}
//
//
//int a=3;
//int b=a;
//
//sys ~ (b) ;  // ->3
//
//b =10;
//sys ~ (a) ; //  -> 3
//
//int arr[]= {1,2,3,4,5};
//int arr2[]= arr1; // 위의 ab는 값을 가져온 건데 이거는 주소값을 가져온 거야 , 이런형태의 문장 쓰지 말기 
//
//System.out.println(arr2[2]);
//arr2[2]=10;
//
//System.out.println(arr1[2]);
//int b1 = arr[4];
//b1 = 10 ;
//
//// 배열을 복사하고 싶을 때는 밑처럼 특별한 방법을 쓰자! system.arraycopy 혹은 for문 
//
//int arr3[]= {1,2,3,4,5};
//int arr4[]= new int [arr3.length]; // 복사하고 싶은 배열을 만들어줌 .
//system.arraycopy(arr3, 0, arr4, 0, arr3.length); // 내가 복사하고 싶은 어레이, 시작 인덱스, 복사할 대상, 붙여넣기 할 곳, 총 몇개를 복붙?
//
//arr3[1]= 10 ;
//arr4[1]= 20;
//
//-> 
