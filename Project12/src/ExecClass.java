import java.util.Random;

public class ExecClass {
	public static void main(String[] args) {
		Random r1 = new Random();
		int randNum = r1.nextInt(100) ;
	
		System.out.println("점수 : " + randNum);
		
		if (randNum >= 90 ) {
			System.out.println("당신의 학점은 A");
		}
		else if (randNum >= 80 ) {
			System.out.println("당신의 학점은 B");
		}
		else if (randNum >=70 ) {
			System.out.println("당신의 학점은 C");
		}
		else if (randNum >=60 ) {
			System.out.println("당신의 학점은 D");
		}
		else if (randNum < 60 ) {


	}

}
}

