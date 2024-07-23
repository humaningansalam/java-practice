package chap02;

public class HashCodeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 =new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.equals(str2));
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		//���ڿ� ������ ���� str1, str2�� ���ؼ� hashCode ȣ���ϸ�?? ���������
		//System.identityHashCode :��ü�� �ּҰ����� �ؽ��ڵ带 ���� -> ��� ��ü�� ���ؼ� �ٸ� �ؽ��ڵ尪�� ��ȯ
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		/*
		 * �ؽ��̶�?
		 * ������ ���� ������� �ϳ� / �ٷ����� �����͸� �����ϰ� �˻��ϴµ� ����
		 * �ؽ��Լ��� ã�����ϴ� ���� �Է��ϸ�, �װ��� ������ġ�� �˷��ִ� �ؽ��ڵ带 ��ȯ
		 * 32bit = 4Byte // �ּ� = 4����Ʈ JVM
		 * 64bit = 8Byte // �ּ� = 4����Ʈ JVM
		 * Ŭ������ �ν��Ͻ� ���� ������ ��ü�� ���� �ٸ��� �Ǵ��ؾ� �ϴ� ��찡 �ְ���??
		 * equals �޼ҵ� + hashCode �޼ҵ嵵 ������  Ȱ���ؼ� ���� �ٸ��� �Ǵ��ؾ��Ѵ�.
		 * 
		 * �ؽ̱��(HashMap, HashSet) : �ݵ�� hashCode �޼ҵ带 �������̵��ؾ� �Ѵ�.
		 */

	}

}
