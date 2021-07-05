package calender;

import java.util.Scanner;

public class Prompt {
	private final static String PROMT= "Cal> ";

	public static void runPrompte() {
		Calender cal = new Calender();
		Scanner scanner = new Scanner(System.in);
		int month = 1;
		while (true) {
			System.out.println("월을 입력하세요 ");
			System.out.printf(PROMT);
			month = scanner.nextInt();
			if (month == -1) {
				break;
			}
			if (month > 12) {
				continue;
			}
			cal.printCalender(2021, cal.getMaxDaysOfMonth(month));
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
