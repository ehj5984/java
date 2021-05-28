import java.util.Scanner;
// 10원 --> 5원 2개
// 11원 --> 2원 3개 , 5원 1개
// 12원 --> 2원 1개 , 5원 2개
// 13원 --> 2원 3개 , 5원 1개
// 14원 --> 2원 2개 , 5원 2개

// n-2 를 반복, 나머지가 5일 떄까지 
public class problem14916 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int count = 0;

		if (n % 5 == 0) {       // 5로 바로 나눠질 때
			int countNum = n / 5;
			System.out.println(countNum);
		} else {                // 2 씩 빼다가 5로 나누어질 때
			
			while (true) { 
				n -= 2;         // 2 씩 빠지는 코인 카운트
				count++;

				if (n < 0) {    // 뺴다가 나머지가 0보다 작아질 때
					System.out.println(-1);
					break;
				}

				if (n == 0) {   // 2 로 나누어 떨어질 때
					System.out.println(count);
					break;
				}
				
				
				
				if (n % 5 == 0) { // 2로 빼다가 5로 나누어지는 경우 
					count += n / 5 ;
					System.out.println(count);
					break;
				}
			}
		}
	}
}