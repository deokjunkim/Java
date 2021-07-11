package calender;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Prompt {
	private final static String YPROMT = "YEAR> ";
	private final static String MPROMT = "MONTH> ";
	private final static String BASICPROMT = "> ";
	private final static String FILE_NAME = "Calender.dat";
	private static HashMap<String, Plan> map = new HashMap<String, Plan>();

	public static void creatdFile(Plan p) {

		File file = new File(FILE_NAME);
		String item = p.saveString();
		try {
			FileWriter f = new FileWriter(file, true);
			f.write(item);
			f.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void readFile() {
		File file = new File(FILE_NAME);
		if (!file.exists()) {
			System.err.println("no save file");
			return;
		}
		try {
			Scanner s = new Scanner(file);
			while (s.hasNext()) {
				String line = s.nextLine();
				String date = line.split(",")[0];
				String schedule = line.split(",")[1];
				Plan p = new Plan(date, schedule);
				map.put(date, p);
			}
			System.out.print(map);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public static void getCalender() {
		Calender cal = new Calender();
		try (Scanner scanner = new Scanner(System.in)) {
			int month = 1;
			int year = 0;
			System.out.println("년도를 입력하세요 ");
			System.out.printf(YPROMT);
			year = scanner.nextInt();

			System.out.println("월을 입력하세요 ");
			System.out.printf(MPROMT);
			month = scanner.nextInt();

			cal.printCalender(year, month);

		}

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

//		try (Scanner scanner = new Scanner(System.in)) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("[일정 등록] 날짜를 입력하세요.");
		System.out.printf(BASICPROMT);
		String date = scanner.next();
		System.out.println("일정을 입력하세요.");
		System.out.printf(BASICPROMT);
		String schedule = scanner.next();

		Plan p = new Plan(date, schedule);
		creatdFile(p);
//			System.out.println("참석자를 등록하시겠습니까? (Y/N)");
//			System.out.printf(BASICPROMT);
//			Boolean addPeople = false;
//			addPeople = scanner.next().equals("Y") ? true : false;
//			while (addPeople) {
//				System.out.println("참석자 이름을 입력하세요. (exit : e)");
//				System.out.printf(BASICPROMT);
//				String name = scanner.next();
//				if (name.equals("e")) {
//					break;
//				}
//				int idx = map.size();
//				System.out.printf("idx : %d\n", idx);
//				p.addPeople(idx, name, p.people);
//
//			}
		System.out.println("일정이 등록되었습니다.");

		if (map.get(date) == null) {
			map.put(date, p);
		} else {
			p = map.get(date);
			p.addSchedule(schedule);
			map.put(date, p);
		}
//		System.out.println(map);
//		System.out.println(map.get(date));
//		}
	}

	public static void scheduleSearch() {
//		try (Scanner scanner = new Scanner(System.in)) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("[일정 검색] 날짜를 입력하세요.");
		System.out.printf(BASICPROMT);
		String date = scanner.next();

		Plan p = map.get(date);

		if (p != null) {
			int ssize = p.getScheduleSize();

			System.out.printf("%d개의 일정이 있습니다. \n", ssize);
			for (int i = 0; i < ssize; i++) {
				System.out.printf("%d. %s\n", i + 1, p.getSchedule().get(i));
			}
//				System.out.println(p.people);
//				int psize = p.getPeopleSize();
////				System.out.print(psize);
//				if (psize > 0) {
////					System.out.printf("[ 참석자 : ");
//					for (int i = 0; i < psize; i++) {
//						p.getPeople().get(i);
//						System.out.printf("%d.참석자 : [", i + 1);
//						ArrayList pList = p.getPeople().get(i);
////						System.out.println(pList);
//						for(int y = 0; y < pList.size(); y++) {
//							System.out.printf("%s", pList.get(y));
//							if(y == pList.size() -1){
//								break;
//							}
//							System.out.print(", ");
//						}
//						System.out.printf("]\n");
//					}
//					
//				}
		} else {
			System.out.print("일정이 없습니다.\n");
		}
//		}

	}

	public static void help() {
		System.out.println("help!!!");
	}

	public static void main(String[] args) {

		Prompt.runHelp();
		readFile();
		Scanner scanner = new Scanner(System.in);
		boolean out = true;
		while (out) {
			System.out.println("명령 (1, 2, 3, h, q)");
			System.out.printf(BASICPROMT);
			String method = scanner.next();
			switch (method) {
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
