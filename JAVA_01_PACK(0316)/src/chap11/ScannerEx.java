package chap11;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String[] argArr = null;
		
		while(true) {
			String prompt = ">>";
			System.out.println(prompt);
			
			String input = s.nextLine();
			
			input = input.trim();       //�Է¹��� ������ ���ʿ��� �յ� ������ �����Ѵ�.
			argArr = input.split(" ");  //�Է¹��� ������ ������ �����ڷ� �ڸ���.
			
			String command = argArr[0].trim();
			
			//��ɾ �ҹ��ڷ� �ٲ۴�.
			command = command.toLowerCase();
			
			
			//q �Ǵ� Q�� �Է��ϸ� ���� ��ȿ�Ѵ�.
			if(command.equals("q")) {
				System.exit(0);
			}
			else {
				for(int i=0; i<argArr.length; i++) {
					System.out.println(argArr[i]);
				}
			}
		}

	}

}
