import java.util.ArrayList;
import java.util.Collections;

public class ExecClass {

	public static void main(String[] args) {

		ArrayList<Student1> student = new ArrayList<Student1>();

		student.add(new Student1("가혜진", 50));
		student.add(new Student1("나혜진", 40));
		student.add(new Student1("다혜진", 30));
		student.add(new Student1("라혜진", 65));
		student.add(new Student1("마혜진", 95));
		student.add(new Student1("바혜진", 45));
		student.add(new Student1("사혜진", 78));
		student.add(new Student1("아혜진", 32));
		student.add(new Student1("자혜진", 59));
		student.add(new Student1("차혜진", 76));

		Collections.sort(student);

		for (int i = 0; i < student.size(); i++) {
			System.out.println(student.get(i).name + " : " + student.get(i).score + "\n");

		}
	}
}
