package chap06;

public class StringBufferEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String Ŭ������ �ν��Ͻ��� �����Ҷ�, ������ ���ڿ��� �����Ҽ� ����.
		//StringBuffer Ŭ������ ���� �����ϴ�.
		//StringBuffer�� ���������� ���ڿ��� �����ϱ� ���� ���۸� ������ ������, ũ�⸦�� ������ ���ִ�.(16)
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
		//StringBufferŬ������ equals�޼ҵ带 �������̵�����
		System.out.println("sb == sb2 ?" + (sb == sb2));
		System.out.println("sb.equals(sb2) ? " + sb.equals(sb2));
		
		//StringBuffer�� ������ String���� ��ȯ�Ѵ�.
		String s = sb.toString();
		String s2 = sb2.toString();
		
		System.out.println("s.equals(s2) ? " + s.equals(s2));

	}

}
