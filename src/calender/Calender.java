package calender;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hellow Calender");

		String[] days = { "일", "월", "화", "수", "목", "금", "토" };
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("1",31);
		map.put("2",28);
		map.put("3",31);
		map.put("4",30);
		map.put("5",31);
		map.put("6",30);
		map.put("7",31);
		map.put("8",31);
		map.put("9",30);
		map.put("10",31);
		map.put("11",30);
		map.put("12",31);
		System.out.print("월을 입력하세요 ");
		Scanner scanner = new Scanner(System.in);
		String mon = scanner.next();
		Integer day = map.get(mon);
//		System.out.println(Arrays.toString(days));
		
		for (String d : days) {
			System.out.print(d + "  ");
		}
		
		System.out.print("\n----------------------\n");
		for (int i = 1; i <= day; i++) {
			
			if(i / 10 == 0) {
				System.out.print(" " + String.valueOf(i) + " ");
			}
			
			else{
				System.out.print(String.valueOf(i) + " ");
			} 
			if (i % 7 == 0) {
				System.out.print("\n");
			}

		}
	}

}
