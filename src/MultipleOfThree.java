import java.util.Scanner;

public class MultipleOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);

		System.out.printf("숫자를 입력해주세요:");
		int num=input.nextInt();
		
		if(num%3 == 0) {
			System.out.printf(num+"은 3의 배수입니다.");
		}
		else {
			System.out.printf(num+"은 3의 배수가 아닙니다.");
		}
	}

}
