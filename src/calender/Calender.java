package calender;

import java.util.Arrays;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hellow Calender");

		String[] days = { "일", "월", "화", "수", "목", "금", "토" };

//		System.out.println(Arrays.toString(days));
		for (String d : days) {
			System.out.print(d + "  ");
		}
		System.out.print("\n----------------------\n");
		for (int i = 1; i < 29; i++) {
			
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
