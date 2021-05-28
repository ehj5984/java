import java.util.Scanner;

public class ExecClass {
	public static void main(String[] args) {
//	String a = "Hello" ;
//	String b = new String ("Hello");
//	
//	System.out.println(a.hashCode());
//	System.out.println(b.hashCode());
//	
//	a= "Hello1";
//	System.out.println(a.hashCode());
//	
//	if(a==b) {
//		
//	}
//	
//	a= "Hello";
//	
//	a = a+"1";// Hello 1
//	a = a+"1";// Hello 11
//	a = a+"1";// Hello 111
//	a = a+"1";
//	a = a+"1";
//	
//	StringBuffer c = new StringBuffer("Hello");
//	c.append("1");
//	System.out.println(c);
//	System.out.println(c.hashCode());
//	c.append("1");
//	System.out.println(c);
//	System.out.println(c.hashCode());\
		
		
// 스트링 클래스에는 버퍼 없고 버퍼에는 스트링 클래스 있음
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력해주세요");
		
		String inputString = sc.nextLine();
		
		StringBuffer c = new StringBuffer(inputString);

		c.reverse();

		String d = c.toString();
		System.out.println(d);
		
	}
}
