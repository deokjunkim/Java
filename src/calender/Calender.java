package calender;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Calender {
	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final String[] DAYS = { "SU", "MO", "TU", "WN", "TH", "FR", "ST" };

	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	public void printCalender(int year, int day) {
		System.out.printf("   <<%4d년%3d월>>   \n", year, day);
		for (String d : DAYS) {
			System.out.printf("%3s", d);
		}

		System.out.print("\n----------------------\n");
		for (int i = 1; i <= day; i++) {

			System.out.printf("%3d", i);
			
			if (i % 7 == 0) {
				System.out.print("\n");
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
		cal.printCalender(2021, day);
	}

	public static void main(String[] args) {

	}

}
