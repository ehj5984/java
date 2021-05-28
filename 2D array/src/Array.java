
public class Array {
	public static void main(String[] args) {
		int arr[][] = { { 10, 33, 44 }, { 27, 5, 98 } };
		int array[] = new int[2];
		int count = 0;

		String[] title = { "Name", "Quiz1", "Quiz2", "Quiz3", "SUM", "AVG" };
		String[] name = { "student1", "student2" };

		for (String t : title) {
			System.out.print("  " + t);

		}
		System.out.println();
		for (int k = 1; k < 40; k++) {
			System.out.print("-");
		}

		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			System.out.print(name[i] + "\t");

			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j] + "\t");
			}
			
			int sum = 0;
			for (int j = 0; j < arr[i].length; j++) {

				sum += arr[i][j];

			}
			System.out.println(sum + "\t");

			int avg = 0;
			for (int j = 0; j < arr[i].length; j++) {

				avg += arr[i][j];
			}
			
			System.out.print(avg / 2 + "\t");

		}

		for (int k = 1; k < 40; k++) {
			System.out.print("-");
		}

		System.out.println();


	}
}
