
public class Television {	
	
	private int channel;
	private int volume;
	private boolean onOff;
	
	//생성자
	public Television(int c, int v, boolean o){
		this.channel=c;
		this.volume=v;
		onOff=o;
	}
	
	//오버로딩
	public Television() {
		this(1,1,false);
		
	}
	
	public Television(int c) {
		this(c,1,false);
		
	}
	
	public Television(int c,int v) {
		this(c,v,false);
		
	}
	
	void Print() {
		
		 System.out.println("텔레비전의 채널은 "+channel+
				 "이고 볼륨은 "+volume+"입니다.");	
		
	}
	
	public String toString(){
		return "텔레비전의 채널은 "+channel+
				 "이고 볼륨은 "+volume+"입니다.";
		
	}

	public void setChannel(int newChannel) {
		
		channel = newChannel;
		
	}

}
