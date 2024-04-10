
public class TelevisionTest {

	public static void main(String[] args) {
		
		Television tv1 = new Television(7,10,true);
		Television tv2= new Television();
		
		
		tv1.Print();
		tv2.Print();
		
		
	
		
		
		//참조변수            
		//Television tv1 = new Television();
		
		//tv1.channel =7;
		//tv1.setChannel(3);
		//tv1.setChannel(15);
		//tv1.volume=10;
		//tv1.onOff=true;
		//tv1.Print();
		//System.out.println("텔레비전의 채널은 "+tv1.channel+"이고 볼륨은 "+tv1.volume+"입니다.");
		//System.out.println(tv1); 
		
		
		
		//참조변수
		//Television tv2= new Television();
	
		//tv2.channel=2;
		//tv2.setChannel(-1);
		//tv2.setChannel(7);	
		//tv2.volume=12;
	    //tv2.Print();
		//System.out.println("텔레비전의 채널은 "+tv2.channel+"이고 볼륨은 "+tv2.volume+"입니다.");
	
	  
	}
	

}
