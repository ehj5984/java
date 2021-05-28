import java.util.Scanner;
import java.util.Random;

public class Homework {
   public static void main(String[] args) {
      System.out.println("두 수의 사칙연산 및 나머지구하기");
   
      
      int userInputnumber = 0;
      
      Scanner s2 = new Scanner(System.in);
      System.out.print("입력 숫자 : ");
      userInputnumber = s2.nextInt();
      
      Scanner s = new Scanner(System.in);
      System.out.print("랜덤 숫자 : ");
      Random r = new Random();
      int randomValue = r.nextInt(10);
      System.out.println(randomValue);
      
      //int minus = randomValue - userInputnumber;
      
      System.out.println( randomValue + userInputnumber);
      System.out.println( "빼기 : " + (randomValue - userInputnumber) );
      System.out.println(randomValue * userInputnumber );
      System.out.println((double)randomValue / userInputnumber );
      System.out.println( randomValue % userInputnumber );
   }
} 

// 시스템 프린트 할 때는 글자수 쓰고 더하기 누르면 그냥 문자로 
//인식해서 사칙연산는 뜻이라고 괄호를 쳐주든가 아예 글자를 빼버려야돼  