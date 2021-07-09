package calender;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Calender {
	private static final int[] MAX_DAYS = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final int[] LEAP_MAX_DAYS = {0,  31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final String[] WEEKDAY = { "SU", "MO", "TU", "WE", "TH", "FR", "SA" };

	public int getMaxDaysOfMonth(int year, int month) {
		if (isLeapYear(year)) {
			return LEAP_MAX_DAYS[month];
		}
		return MAX_DAYS[month];
	}

	public boolean isLeapYear(int year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			return true;
		}
		return false;
	}

	public void printCalender(int year, int month) {
		Calender cal = new Calender();
		System.out.printf("   <<%4d년%3d월>>   \n", year, month);
		
		int start = cal.getWeekDay(year, month, 1);

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
	
	public int getWeekDay(int y, int m, int d) {
		int year = 1970;
		int month = 1;
		int weekday = 4;
		
		int count = 0;
		
		for(int i = year ; i < y ; i ++) {
			if(isLeapYear(i)) {
				count += 366;
			}
			else {
				count += 365;	
			}
			
		}
	
		for(int mm = month ; mm < m ; mm ++) {
			count += getMaxDaysOfMonth(y,mm);
		}
		
		count += d - 1;
		
		return (count + weekday) % 7;
	}

	public static void main(String[] args) {
		
//		Calender cal = new Calender();
//		System.out.println(cal.isLeapYear(1972));
//		System.out.print(cal.getWeekDay(2021, 7, 7));
//		System.out.println();
//		System.out.print(cal.getWeekDay(1970, 1, 1));
//		System.out.println();
//		System.out.print(cal.getWeekDay(1971, 1, 1));
//		System.out.println();
//		System.out.print(cal.getWeekDay(1972, 1, 1));
//		System.out.println();
//		System.out.print(cal.getWeekDay(1973, 1, 1));
//		System.out.println();
//		System.out.print(cal.getWeekDay(1974, 1, 1));
//		System.out.println();
		//System.out.print(cal.getWeekDay(1970, 2, 5));
		// 1 : 목 , 2 : 금 , 3 : 토 , 4: 일 , 5 : 월 , 6 :
	}

}
