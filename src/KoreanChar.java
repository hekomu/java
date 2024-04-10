
public class KoreanChar {
   
	public static void main(String[] args) {

        char start = '\uAC00';
        char end = '\uD7A3';

        char current = start;

        do {

            System.out.print(current);
            
            current++;


            if ((current - start) % 28 == 0 && current <=end) {
                System.out.print("\n--…--\n");
            }


            
        } while (current <= end);
    }
}