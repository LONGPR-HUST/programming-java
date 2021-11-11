package hust.longpr.datetime;

import java.time.LocalDate;
import java.time.Month;

public class Test {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		System.out.println(now);
		LocalDate tomorrow = now.minusDays(2);
		System.out.println(tomorrow);
		LocalDate date = LocalDate.of(2021, 11, 11);
		System.out.println(date);
		LocalDate date1 = LocalDate.of(2021, Month.NOVEMBER, 11);
		System.out.println(date1);

	}

}
