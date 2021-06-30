import java.util.Arrays;
import java.util.Scanner;

public class LastGugudan {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		inputGugudan(scanner);
		inputGugudan2(scanner);
	}
	
	public static void inputGugudan(Scanner s) {
		int dan = s.nextInt();
		
		print(dan, dan);
		
	}
	
	public static void inputGugudan2(Scanner s) {
		String inputStr = s.next();
		String[] splitStr = inputStr.split(",");

		int x = Integer.valueOf(splitStr[0]);
		int y = Integer.valueOf(splitStr[1]);
		
		print(x, y);
		
	}
	
	public static void print(int x, int y) {
		for(int i = 2; i<= x ; i ++) {
			for(int z = 1 ; z <= y ; z ++) {
				System.out.println(i + " * " + z + " = " + i*z);
			}
		}
	}
}
