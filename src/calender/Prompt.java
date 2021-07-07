package calender;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Prompt {
	private final static String YPROMT = "YEAR> ";
	private final static String MPROMT = "MONTH> ";
	private final static String WPROMT = "WEEKDAY> ";
	private final static String BASICPROMT  = "> ";
	private static HashMap<String, ArrayList> map = new HashMap<String, ArrayList>();

	public static void getCalender() {
		Calender cal = new Calender();
		Scanner scanner = new Scanner(System.in);
		int month = 1;
		int year = 0;
		String weekday = "";
		
		System.out.println("년도를 입력하세요 ");
		System.out.printf(YPROMT);
		year = scanner.nextInt();
//		if (year == -1) {
//			ret
//		}
		System.out.println("월을 입력하세요 ");
		System.out.printf(MPROMT);
		month = scanner.nextInt();

//		if (month == -1) {
//			break;
//		}
//		if (month > 12) {
//			continue;
//		}
		cal.printCalender(year, month);
		// System.out.printf("%d월은 %d일까지 있습니다 \n",month, cal.getMaxDaysOfMonth(month));


//		System.out.println("END");
	}

	public static void runHelp() {
		System.out.println("+----------------------+");
		System.out.println("| 1. 일정 등록       ");    
		System.out.println("| 2. 일정 검색   ");        
		System.out.println("| 3. 달력 보기");
		System.out.println("| h. 도움말 q. 종료");
		System.out.println("+----------------------+");
		
	}
	
	public static void scheduleRegistration() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("[일정 등록] 날짜를 입력하세요.");
		System.out.printf(BASICPROMT);
		String date = scanner.next();
		System.out.println("일정을 입력하세요.");
		System.out.printf(BASICPROMT);
		String schedule = scanner.next();
		System.out.println("일정이 등록되었습니다.");
		ArrayList scheduleArray = new ArrayList();
		if(map.get(date) == null) {
			scheduleArray.add(schedule);
			map.put(date, scheduleArray);
		}
		else{
			ArrayList scheduleArray2 = map.get(date);
			scheduleArray2.add(schedule);
		}
//		System.out.println(map);
//		System.out.println(map.get(date));
	}
	
	public static void scheduleSearch() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("[일정 검색] 날짜를 입력하세요.");
		System.out.printf(BASICPROMT);
		String date = scanner.next();
		
		ArrayList scheduleArray = map.get(date);
		int size = 0;
		if (scheduleArray != null) {
			size = scheduleArray.size();
		}

		System.out.printf("%d개의 일정이 있습니다. \n", size);
		for(int i = 0 ; i < size  ; i ++) {
			System.out.printf("%d. %s\n", i + 1, scheduleArray.get(i));
		}
		
	}
	
	public static void help() {
		System.out.println("help!!!");
	}
	

	public static void main(String[] args) {
		Prompt prompt = new Prompt();
//		prompt.runPrompte();
		prompt.runHelp();
		Scanner scanner = new Scanner(System.in);
		boolean out = true;
		while(out) {
			System.out.println("명령 (1, 2, 3, h, q)");
			System.out.printf(BASICPROMT);
			String method = scanner.next();
			switch(method) {
				case "1":
					scheduleRegistration();
					break;
				case "2":
					scheduleSearch();
					break;
				case "3":
					getCalender();
				case "h":
					runHelp();
					break;
				case "q":
					out = false;
					break;
			}
			
		}
		scanner.close();
	}
}
