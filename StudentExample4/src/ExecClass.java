import java.util.ArrayList;

public class ExecClass {
	public static void main(String[] args) {
		
	
	Student []s1 = { new Student ("홍길동",500), 
			new Student("둘리", 300), 
			new Student("또치",200)};
	
	
	
	ArrayList<Student> s3 = new ArrayList<Student>();
	s3.add(new Student("이순신", 900));  // 어레이 리스트는 add를 통해 하나씩 추가 해야됨
	s3.add(new Student("김선호", 200));
	
	
	s3.get(0).name = "이혜진";
	s3.get(0).middleScore = 500;
	
	for (int i=0; i<s3.size(); i++) {
		 System.out.println(s3.get(i).name + "의 중간고사 점수 :"+ s3.get(i).middleScore);
	}
 }

}
