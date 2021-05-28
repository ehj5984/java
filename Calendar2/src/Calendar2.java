import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Calendar2 {
	public static void main(String[] args) {
//	System.out.print(" Target Date = ");
//
//	Scanner scanner = new Scanner(System.in);
//	String targetDay = scanner.nextLine();
//
//	// 목표 날짜
//	SimpleDateFormat yyyyMMdd = new SimpleDateFormat("yyyyMMdd");
//	Date targetDate = yyyyMMdd.parse(targetDay);
//
//	// 현재 날짜
//	Date todayDate = new Date();
//	String todayDay = yyyyMMdd.format(todayDate);
//
//	long differTime3 = targetDate.getTime() - todayDate.getTime();
//
//	System.out.println(differTime3 / (24 * 60 * 60 * 1000) + 1 + "일 (" + targetDay + " ~ " + todayDay + ")");

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 99999; i++) {
			System.out.println("원하시는 기능을 선택하세요");
			System.out.println("원하시는 기능을 선택하세요");
			System.out.println("원하시는 기능을 선택하세요");
			System.out.println("원하시는 기능을 선택하세요");

			String userInput = sc.nextLine();
			if (userInput.equals("1")) {
			} else if (userInput.equals("2")) {

			} else if (userInput.equals("exit")) {
				break;
			}
		}
	}
}