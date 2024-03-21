

import java.util.Scanner;

public class EvenOdd {
	public static void main(String args[]) {
	
	Scanner input = new Scanner(System.in);
	int num;
	
	System.out.printf("숫자를 입력하세요 :");
	num = input.nextInt();
	
	if(num%2==0) {
		System.out.println("짝수입니다.");
	}
	else {
		System.out.println("홀수입니다.");
	}
	System.out.printf("프로그램이 종료되었습니다.");
	}
}
