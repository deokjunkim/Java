package calender;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		
		System.out.println("두 수를 입력하세요!");
		Scanner scanner = new Scanner(System.in);
		String[]  inputS = scanner.next().split(",");
		int A = Integer.parseInt(inputS[0]);
		int B = Integer.parseInt(inputS[1]);
		System.out.println(A + " + " + B + " = " + (A+B));
		scanner.close();
		
		System.out.println("두 수를 입력하세요!");
		Scanner scanner1 = new Scanner(System.in);
		String s1 = scanner1.next();
		String s2 = scanner1.next();
		int A1 = Integer.parseInt(s1);
		int B2 = Integer.parseInt(s2);
		System.out.println(A1 + " + " + B2 + " = " + (A1+B2));
		
		System.out.printf( "%d + %d = %d", A1, B2, (A1+B2));
		scanner1.close();
	}
}
