package p351;


public class Audio implements RemoteControl{
	
	private int volume;
	
	//turnOn() 추상 메소드의 실체메소드
	public void turnOn() {
		System.out.println("AUDIO를 켭니다.");
	}
	
	//turnOff() 추상메소드의 실체 메소드
	public void turnOff() {
		System.out.println("AUDIO를 끕니다.");
	}
	
	//setVolume() 추상메소드의 실체 메소드	
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
		else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
		
		System.out.println("현재볼륨 :" + this.volume);
	}

}
