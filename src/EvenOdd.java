

import java.util.Scanner;

public class EvenOdd {
	public static void main(String args[]) {
	
	Scanner input = new Scanner(System.in);
	int num;
	
	System.out.printf("숫자를 입력하세요 :");
	num = input.nextInt();
	
	if(num>0) {
		System.out.println("양수입니다.");
	}
	else {
		System.out.println("0 또는 음수입니다.");
	}
	}
}
