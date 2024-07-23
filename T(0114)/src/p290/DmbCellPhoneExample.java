package p290;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DmbCellphone dmbcellphone = new DmbCellphone("자바폰", "검정", 10);
		
		System.out.println("모델 : "+ dmbcellphone.model);
		System.out.println("색상 : "+ dmbcellphone.color);
		
		System.out.println("채널 : "+ dmbcellphone.channel);
		
		dmbcellphone.powerOn();
		dmbcellphone.bell();
		dmbcellphone.sendVoice("여보세요");
		dmbcellphone.receiveVoice("안녕하세요 저는 홍길동인데요");
		dmbcellphone.sendVoice("반갑습니다.");
		dmbcellphone.hangup();
		
		dmbcellphone.turnOnDmb();
		dmbcellphone.changeChannelDmb(0);
		dmbcellphone.turnOffDmb();
		
	}

}
