import java.util.Arrays;

public class ArrayTest {
public static void main(String[] args) {
		
	
	int a[] = {0,0,0,0}; // 몇칸 짜리인지 눈에 띔
	int b[]= new int[5]; // 몇칸 짜리인지 알려주는 다른 방법 
	
	System.out.println(a[3]);
	
	a[0] = 10;  
	a[0]++;
	
	System.out.println(a[0]);
	
	a[1] = 3;
	a[2] = a[0]+ a[1];
	
	System.out.println(a[2]);
	
	a[3] = 50;
	
	//원래는 각각의 변수 출력을 위해 프린트문을 일일이 적어야 하는데 
	//밑처럼 하면 a.length에 입력하는 숫자에 따라 달라짐

	
//	for(int i=0; i<a.length; i++) {
//		System.out.println(a[i]);  
//	}

	
	System.out.println(Arrays.toString(a)); //배열안에 있는 내용을 쉽고 빠르게 보고싶을 때 쓰는 방법 
    


}
}
