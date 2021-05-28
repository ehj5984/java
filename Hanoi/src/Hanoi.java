


public class Hanoi {
	public static void main(String[] args) {

		Myhanoi myhanoi = new Myhanoi();

		System.out.println("총 옮긴 횟수 : " + myhanoi.hanoifunction(5, 1, 2, 3));
		}
		
	}


	class Myhanoi {
		
		int count = 0;

		int hanoifunction(int n, int from, int by, int to) {

			if (n == 1) {
				System.out.println(from + "->" + to);
				count++;
				return count;
			}

			hanoifunction(n - 1, from, to, by);
			
			System.out.println(from + "->" + to);
			count++;

			hanoifunction(n - 1, to, from, by);

			return count;
		}
	}

//	# 1914번 파이썬 
//
//	N = int(input()) 
//
//	  
//
//	def HANOI(x, y, z, cnt): 
//
//	    if cnt == 0: 
//
//	        return 
//
//	  
//
//	    HANOI(x, z, y, cnt - 1) 
//
//	    print(x,z) 
//
//	    HANOI(y, x, z, cnt - 1) 
//
//	  
//
//	print((1 << N) - 1) 
//
//	if N <= 20: 
//
//	    HANOI(1, 2, 3, N) 
//
//	 
