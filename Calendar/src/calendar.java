import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import com.kopo.Test;

public class calendar {
	public static void main(String[] args) throws ParseException {
		
		Test t1= new Test();
		
//		Calendar cal = Calendar.getInstance();
//		cal.add(Calendar.DAY_OF_MONTH, 1);
//
//		java.util.Date nextDay = cal.getTime();
//		System.out.println(nextDay);
//
//		int year = 2020;
//		int month = 7;
//		int day = 29;
//
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");

//		String timeStamp = new SimpleDateFormat("yyyy-mm-dd  hh : mm : ss").format(Calendar.getInstance().getTime());
//		System.out.println(timeStamp); //오늘 날짜 캘린더 (현재시각 많이 씀)
//		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
//		Date date = sdf.parse("2020-10-01");
//		Calendar cal = sdf.getCalendar(); //문자열을 가지고 캘린더로 바꿔줌

//		Calendar cal2 = Calendar.getInstance();
//		cal2.set(year, month - 1, day);
//
//		System.out.println(dateFormat.format(cal.getTime()));
//
//		System.out.println(dateFormat.format(cal.getTime()));
//
//		System.out.println("해당년도: " + cal.get(Calendar.YEAR));
//		System.out.println("해당월: " + (cal.get(Calendar.MONTH) + 1)); // 보여줄때 +1로 하여 사람기준으로 설정
//		System.out.println("첫번째 일: " + cal.getMinimum(Calendar.DAY_OF_MONTH));
//
//		System.out.println("마지막 일(현재 날짜 기준 최대수): " + cal.getActualMaximum(Calendar.DAY_OF_MONTH)); // 기본적으로 이걸 사용
//		System.out.println("마지막 일(Calender이 가진 최대수): " + cal.getMaximum(Calendar.DAY_OF_MONTH));

		// 특정날짜의 연월일 구하기 -- java show now

//		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-mm-dd");
//		Date date2 = sdf2.parse("2020-10-01");
//		Calendar cal2 = sdf2.getCalendar(); //문자열을 가지고 캘린더로 바꿔줌
//		
//		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-mm-dd");
//		Date date3 = sdf3.parse("2020-11-21");
//		Calendar cal3 = sdf3.getCalendar(); //문자열을 가지고 캘린더로 바꿔줌
//		
//		System.out.println(cal2.getTime());
//		System.out.println(cal3.getTime());
//		
//		
//		long time1 =cal2.getTimeInMillis();
//		long time2 = cal3.getTimeInMillis();
//		
//		long differTime = time1 - time2 ;
//		long days = differTime / 1000 / 60 / 60 / 24;
//		System.out.println(days);

		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-mm-dd");
		Date date2 = sdf2.parse("2020-10-01");
		Calendar cal2 = sdf2.getCalendar(); // 문자열을 가지고 캘린더로 바꿔줌

		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-mm-dd");
		Date date3 = sdf3.parse("2020-11-21");
		Calendar cal3 = sdf3.getCalendar(); // 문자열을 가지고 캘린더로 바꿔줌

		System.out.println(cal2.getTime());
		System.out.println(cal3.getTime());

		long time1 = cal2.getTimeInMillis();
		long time2 = cal3.getTimeInMillis();

		long differTime = time1 - time2;
		long days = differTime / 1000 / 60 / 60 / 24;
		System.out.println(days);

		
		
		System.out.print(" Target Date = ");

		Scanner scanner = new Scanner(System.in);
		String targetDay = scanner.nextLine();

		// 목표 날짜
		SimpleDateFormat yyyyMMdd = new SimpleDateFormat("yyyyMMdd");
		Date targetDate = yyyyMMdd.parse(targetDay);

		// 현재 날짜
		Date todayDate = new Date();
		String todayDay = yyyyMMdd.format(todayDate);

		long differTime3 = targetDate.getTime() - todayDate.getTime();

		System.out.println(differTime3 / (24 * 60 * 60 * 1000) + 1 + "일 (" + targetDay + " ~ " + todayDay + ")");
	}

}
