package test07;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str = new String[3];

		str[0] = "�ѳ�";
		str[1] = "�γ�";
		str[2] = "����";
		
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]);
		}
		
		for(String s: str) {
			System.out.println(s);
		}
	}

}
