import java.util.Random;

public class Method {
	public static int testMethod(int number1, int number2) {   //test method만들기
		
		
		int resultNumber = number1 + number2 ;
	    System.out.println("" + number1 + "+" + number2 + " = " + resultNumber);
	    return resultNumber;
	    
	}  // main이 없어서 실행 안됨 밑에 메인 만들어줘 

  public static void main(String[] args) {

	    Random r1 = new Random();
		int number1 = r1.nextInt(100);
		int number2 = r1.nextInt(100);
	  
	  
	  int result = testMethod(number1, number2);   //여기서 number 1,2를 넘겨주었기 때문에 위의 testMethod에 number1,2가 들어가 
	  
          }
		
	}

