import java.util.Arrays;
import java.util.Scanner;

public class MedianFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int[] num=new int[5];
		
		
		for(int i=0; i<5;i++)
		{
			System.out.printf("%d번째 숫자를 입력해주세요:",i+1);
			num[i]=input.nextInt();
			if (num[i]<=0)
			{
				
				System.out.printf("양수를 입력해주세요");
				i--;
			}
			
					
		}
		
		Arrays.sort(num);;
			
			
		System.out.printf("가운데 값은 %d입니다.",num[2]);
}	
}
