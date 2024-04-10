import java.util.Scanner;

public class Int2Hwd {

	public static void main(String args[]) {
	Scanner input = new Scanner(System.in);
	
	System.out.printf("한글을 입력해주세요:");
	String Hwdnum =input.next();
	
	
		switch(Hwdnum) {
		
		case "하나","일","첫째": 	
			System.out.printf("1");
			break;
		case "둘","이","둘째":
			System.out.printf("2");
			break;
		default:
			System.out.printf("없음");
			break;
		}
	}
}
