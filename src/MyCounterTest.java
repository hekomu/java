
public class MyCounterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCounter obj=new MyCounter();
		obj.value=10;
		
		MyCounter obj2=new MyCounter();
		obj.inc(obj);
		
		System.out.println("x:"+obj.value);
	}

}
