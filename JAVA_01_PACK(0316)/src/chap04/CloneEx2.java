package chap04;

import java.util.Arrays;

public class CloneEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		int[] arrCopy = arr.clone();
		/*
		 * ���� ��� ,�迭�� ���
		 * ������ �ν��Ͻ��� ���� �迭�� �ּҸ� ���� ������ ������ �ν��Ͻ��� �۾��� ������ ��Ʈ��Ʈ�� ������ ��ġ�� �ȵ�.
		 * �̷���� clone�޼ҵ带 �ɶ��̵��ؤ��� ���ο� �迭�� �����ϰ� �迭�� ������ �����ϵ��� �ؾ��Ѵ�.
		 * 
		 * �迭�� ��ü�̴�.
		 * Oject Ŭ������ ��Ӥ��޾Ҵ�. ���ÿ� Cloneable �������̽��� �����Ǿ� �ִ�/
		 * �׷��� Object Ŭ������ ������� ��� ��ӹ޴´�.
		 * �̿����� ������ ���� Ÿ������ ��ȯ�ϱ� ������ ����ȯ�� �ʿ� ���� �����̴�.
		 */
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrCopy));
		
		arrCopy[0] = 6;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrCopy));

	}

}
