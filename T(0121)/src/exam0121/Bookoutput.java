package exam0121;

import java.util.*;

public class Bookoutput {

    Scanner scan = new Scanner(System.in);
	
	public void bookshow(ArrayList<Bookinfo> list) {
		if(list.size() == 0) {
			System.out.println("�Էµ� ������ �����ϴ�.");
		}
		else {
			for(int i=0; i<list.size(); i++) {
				System.out.println(list.get(i));
			}
			
		}
	}

	
	public void booksearch(ArrayList<Bookinfo> list) {
		int[] ck = new int[2];
		int prcount = 0;
		int ckcount = 0;
		
		if(list.size() == 0) {
			System.out.println("�Էµ� ������ �����ϴ�.");
		}
		else {
			System.out.println("�˻��� ������ �Է��ϼ���.((-)�� �����˻�����)");
			String tmpprice = scan.next();
			StringTokenizer st = new StringTokenizer(tmpprice, "-");

			
			if(st.countTokens() == 2) {
				while(st.hasMoreTokens()) {
					ck[prcount] = Integer.parseInt(st.nextToken());
					prcount++;
				}

				for(int i=0; i<list.size(); i++) {
					if(list.get(i).price >= ck[0] && list.get(i).price <= ck[1]) {
						System.out.println(list.get(i));
						ckcount++;
					}
				}
				
			}
			
			if(st.countTokens() == 1) {
				for(int i=0; i<list.size(); i++) {
					int inprice = Integer.parseInt(tmpprice);
					if(inprice == list.get(i).price) {
						System.out.println(list.get(i));
						ckcount++;
					}
				}
			}
			
			if(ckcount == 0) {
				System.out.println("�˻����ݿ� �´� ������ �����ϴ�.");
			}
			
		}
		
	}
}
