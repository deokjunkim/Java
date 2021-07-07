package calender;

import java.util.Scanner;

public class Prompt {
	private final static String YPROMT = "YEAR> ";
	private final static String MPROMT = "MONTH> ";
	private final static String WPROMT = "WEEKDAY> ";

	public static void runPrompte() {
		Calender cal = new Calender();
		Scanner scanner = new Scanner(System.in);
		int month = 1;
		int year = 0;
		String weekday = "";
		while (true) {
			System.out.println("년도를 입력하세요 ");
			System.out.printf(YPROMT);
			year = scanner.nextInt();
			if (year == -1) {
				break;
			}
			System.out.println("월을 입력하세요 ");
			System.out.printf(MPROMT);
			month = scanner.nextInt();

			if (month == -1) {
				break;
			}
			if (month > 12) {
				continue;
			}
			cal.printCalender(year, month);
			// System.out.printf("%d월은 %d일까지 있습니다 \n",month, cal.getMaxDaysOfMonth(month));

		}
		scanner.close();

		System.out.println("END");
	}
	
	public static void main(String[] args) {
		Prompt prompt = new Prompt();
		prompt.runPrompte();
	}
}
