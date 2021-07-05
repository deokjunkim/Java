package calender;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Calender {
	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final int[] LEAP_MAX_DAYS = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final String[] WEEKDAY = { "SU", "MO", "TU", "WE", "TH", "FR", "SA" };

	public int getMaxDaysOfMonth(int year, int month) {
		if (isLeapYear(year)) {
			return LEAP_MAX_DAYS[month - 1];
		}
		return MAX_DAYS[month - 1];
	}

	public boolean isLeapYear(int year) {
		if (year % 4 == 0 && (year % 4 == 0 && year % 100 == 0 && year % 400 == 0)) {
			return true;
		}
		return false;
	}

	public void printCalender(int year, int month, String weekend) {
		Calender cal = new Calender();
		System.out.printf("   <<%4d년%3d월>>   \n", year, month);
		int start = Arrays.asList(WEEKDAY).indexOf(weekend);

		for (String d : WEEKDAY) {
			System.out.printf("%3s", d);
		}
		int maxDay = cal.getMaxDaysOfMonth(year, month);
		System.out.print("\n----------------------\n");
		for (int y = 0; y < start; y++) {
			System.out.printf("%3s", "");
		}
		int c = 7 - start;
		for (int i = 1; i <= maxDay; i++) {

			System.out.printf("%3d", i);

			if (i <= c) {
				if ((i) % (c) == 0) {
					System.out.print("\n");
				}
			} else {
				c += 7;
				if ((i) % (c) == 0) {
					System.out.print("\n");
				}
			}

		}
		System.out.print("\n\n");
	}

	public void printCalender() {
		// TODO Auto-generated method stub
//		System.out.println("Hellow Calender");

		String[] days = { "일", "월", "화", "수", "목", "금", "토" };
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("1", 31);
		map.put("2", 28);
		map.put("3", 31);
		map.put("4", 30);
		map.put("5", 31);
		map.put("6", 30);
		map.put("7", 31);
		map.put("8", 31);
		map.put("9", 30);
		map.put("10", 31);
		map.put("11", 30);
		map.put("12", 31);
		System.out.print("월을 입력하세요 ");
		Scanner scanner = new Scanner(System.in);
		String mon = scanner.next();
		scanner.close();
		Integer day = map.get(mon);
		Calender cal = new Calender();
//		cal.printCalender(2021, day);
	}

	public static void main(String[] args) {

	}

}
