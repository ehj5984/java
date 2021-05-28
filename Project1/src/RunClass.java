

public class RunClass {
public static void main(String[] args) {
	int a; // 정수
	a = 10;
	
	double c = 3.14; // 실수
	char d ='A' ;  // 문자 (한글자만) 작은따옴표사용 (오직 자바에서만)
	boolean e = true ; // 참 / 거짓 true /false
	String f = "Hello" ; // 문자열 큰 따옴표 사용
	String g = new String("Hello"); // 원래는 이렇게 써야하는데 불편하니까
	
	int b = a + 3;
	double result = (double)10/3 ;
	System.out.println(result);
	
	
	String printString = "안녕하세요. \n\'자바' 프로그래밍 수업입니다.";
	System.out.println(printString);
}

}
