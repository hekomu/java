import java.util.Scanner;

public class Lec3Ex2 {
	

	public static void main(String args[]) {
			
			Scanner input = new Scanner(System.in);
			int num;
			
			System.out.println("양의 정수를 입력하시오: ");
			num=input.nextInt();
			
			System.out.println(num+"의 약수는 다음과 같습니다. ");
			for(int i=0; i<=num ;i++) {
				if(num%i==0) {
					System.out.println(i);
				
				
				}

			}
	}
	
}
