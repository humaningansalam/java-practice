package p290;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DmbCellphone dmbcellphone = new DmbCellphone("�ڹ���", "����", 10);
		
		System.out.println("�� : "+ dmbcellphone.model);
		System.out.println("���� : "+ dmbcellphone.color);
		
		System.out.println("ä�� : "+ dmbcellphone.channel);
		
		dmbcellphone.powerOn();
		dmbcellphone.bell();
		dmbcellphone.sendVoice("��������");
		dmbcellphone.receiveVoice("�ȳ��ϼ��� ���� ȫ�浿�ε���");
		dmbcellphone.sendVoice("�ݰ����ϴ�.");
		dmbcellphone.hangup();
		
		dmbcellphone.turnOnDmb();
		dmbcellphone.changeChannelDmb(0);
		dmbcellphone.turnOffDmb();
		
	}

}
