package p693;

import java.util.function.IntSupplier;

public class SupplierExample {
	public static void main(String[] args) {
		//���⿡ �ڵ带 �����ϼ���.
		
		IntSupplier intSupplier = () -> {
			int num = (int)(Math.random() * 6) + 1;
			return num;
		};
		
		int num = intSupplier.getAsInt();
		System.out.println("���� ��: " + num);
	}
}
