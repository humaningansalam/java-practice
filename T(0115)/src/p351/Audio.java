package p351;


public class Audio implements RemoteControl{
	
	private int volume;
	
	//turnOn() �߻� �޼ҵ��� ��ü�޼ҵ�
	public void turnOn() {
		System.out.println("AUDIO�� �մϴ�.");
	}
	
	//turnOff() �߻�޼ҵ��� ��ü �޼ҵ�
	public void turnOff() {
		System.out.println("AUDIO�� ���ϴ�.");
	}
	
	//setVolume() �߻�޼ҵ��� ��ü �޼ҵ�	
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
		
		System.out.println("���纼�� :" + this.volume);
	}

}
