
public class Student1 implements Comparable<Student1>{

	String name;
	int score;

	Student1(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public int compareTo(Student1 o) {
		if (this.score < o.score) {
			return -1;
		} else if (this.score > o.score) {
			return 1;
		}
		return 0;
	}
}


// implements comparable student1 해야돼