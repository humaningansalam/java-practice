package project03;

public class EmployeeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ù ��° Employee ��ü ���� ����
    	Employee emp1;

    	// �� ��° Employee ��ü ���� ����
  			// ���⿡ �ڵ带 �����ϼ���

		// Employee ��ü�� �����ϰ� emp1�� ����Ű�� �Ѵ�
		emp1 = new Employee( );

		// emp1�� �̸��� ���̵��ɡ����� �����Ѵ�
		emp1.setName("�̵���");

		// emp1�� ��ȣ�� 100���� �����Ѵ�
		emp1.setNumber(100);

		// emp1�� ���̸� 25�� �����Ѵ�
		emp1.setAge(25);

        // emp1�� �̸�, ��ȣ�� ���̸� ����Ѵ�
		System.out.println(emp1);

		// Employee ��ü�� �����ϰ� emp2�� ����Ű�� �Ѵ�
		Employee emp2 = new Employee( );

		// emp2�� �̸��� �������⡯���� �����Ѵ�
  		emp2.setName("������");

		// emp2�� ��ȣ�� 200���� �����Ѵ�
  		emp2.setNumber(200);

		// emp2�� ���̸� 18�� �����Ѵ�
  		emp2.setAge(18);

		// emp2�� �̸�, ��ȣ�� ���̸� ����Ѵ�
  		System.out.println(emp2);

        // emp2�� ��ȣ�� 300���� �����Ѵ�
  		emp2.setNumber(300);

		// emp1�� �̸�, ��ȣ�� ���̸� ����Ѵ�
  		System.out.println(emp2);




	}

}
