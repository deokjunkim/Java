import java.util.Arrays;
import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
//		// 2단
//		for(Integer i = 1 ; i < 10 ; i ++) {
//			System.out.printf("2 * %d = " + 2*i + "\n", i);
//		}
//		// 2단
//		System.out.println(2*1);
//		System.out.println(2*2);
//		System.out.println(2*3);
//		System.out.println(2*4);
//		System.out.println(2*5);
//		System.out.println(2*6);
//		System.out.println(2*7);
//		System.out.println(2*8);
//		System.out.println(2*9);
//		
//		// 3단
//		System.out.println(3*1);
//		System.out.println(3*2);
//		System.out.println(3*3);
//		System.out.println(3*4);
//		System.out.println(3*5);
//		System.out.println(3*6);
//		System.out.println(3*7);
//		System.out.println(3*8);
//		System.out.println(3*9);
//		
//		//4단
//		
//		Scanner scanner = new Scanner(System.in);
//		Integer dan = scanner.nextInt();
//		
//		System.out.println(dan*1);
//		System.out.println(dan*2);
//		System.out.println(dan*3);
//		System.out.println(dan*4);
//		System.out.println(dan*5);
//		System.out.println(dan*6);
//		System.out.println(dan*7);
//		System.out.println(dan*8);
//		System.out.println(dan*9);
		
//		// 6 dan
//		int i = 0;
//		while(i < 10) {
//			i += 1;
//			System.out.println(6*i);
//		}
//		System.out.println(i);
//		// 7 dan
//		for(int y = 1; y < 10 ; y ++){
//			System.out.println(7*y);
//		}
		
//		System.out.println("구구단 중 출력할 단은? : ");
//		Scanner scanner = new Scanner(System.in);
//		Integer dan = scanner.nextInt();
//		System.out.println("사용자가 입력한 단은? : " + dan);
//		
//		if(dan < 2) {
//			System.out.println("잘못입력함 (2보다 작음)");
//		}
//		else if(dan > 9) {
//			System.out.println("잘못입력함 (9보다 )");
//		}
//		else {
//			for(int i = 1; i < 10 ; i ++){
//				System.out.println(dan*i);
//			}
//		}
		// Array (배열) : 배열로 구구단 다시 구현 
		
//		int[][] result = new int[8][9];
//		for(int i = 0; i < result.length; i ++) {
//			int[] dan = new int[9];
//			for(int y = 0; y< dan.length; y ++) {
//				result[i][y] = (i+2) * (y +1);
//			}
//		}
//		
//		for(int i = 0 ;  i < result.length; i ++) {
//			System.out.println((i+2) + "dan : " + Arrays.toString(result[i]));
//			for(int res : result[i]) {
//				System.out.println(res);
//			}
//			System.out.println();
//		}
		
		// 2단
		for(int i = 2; i < 10 ; i ++) {
			int[] result = calculate(i);
			print(result);
			
		}
		
		
		
	}
	
	// Method (함수) : 메소드 활용 구구단 다시 구현
	public static int[] calculate(int times) {
		int[] result = new int[9];
		for(int i = 0 ; i < result.length ; i ++) {
			result[i] = times * (i+1);
		}
		return result;
			
	}
	public static void print(int[] result) {
		System.out.println(Arrays.toString(result));
	}
}
