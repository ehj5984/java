package midterm_answer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class busallocation {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		final int bus45 = 45;
		final int bus25 = 25;
		int res45 = 0;
		int res25 = 0;
		
		if (number % bus25 == 0) {
			System.out.println(res45+" "+number/bus25);
			return;
		}
		
		while(true) {
			
			if(number >= bus45) {
				number -= bus45;
				res45++;
				if(number % bus25 == 0) {
					System.out.println(res45+" "+number/bus25);
					break;
				}
			}else{
				
				int temp = (number <= bus25) ? res25++ : res45++;
				System.out.println(res45+" "+res25);
				break;
			}
		}
		
	}	
	
}
