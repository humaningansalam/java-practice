package project03;

public class Employee {
	
	 public String name;	// �̸�
	 public int number;
	 private int age;
	    // ������ ��ȣ�� ����
	  		// ���⿡ �ڵ带 �����ϼ���

	    // -------------------------------------------------------
	    //  ���ο� Employee ��ü�� �����Ѵ�.
	    // -------------------------------------------------------
		public Employee( )
		{

		}

		// ������ �޼ҵ� - �̸��� ��ȯ�Ѵ�
		public String getName( )
		{
			return name;
		}

		// ������ �޼ҵ� - ��ȣ�� ��ȯ�Ѵ�
		public int getNumber( )
		{
	  		return number;
		}

		// ������ �޼ҵ� - ���̸� ��ȯ�Ѵ�
		public int getAge( )
		{
	  		return age;
		}

	    //  �� Employee ��ü�� ������ ���� ���ڿ��� ��ȯ�Ѵ�.
	    public String toString ()
	    {
	  		return "[name :" + name + "number :" + number + "age :" + age + "]";
	    }

		// ������ �޼ҵ� - �̸��� �־��� ������ �����Ѵ�
		public void setName(String Name)
		{
			name = Name;
		}

		// ������ �޼ҵ� - ��ȣ�� �־��� ������ �����Ѵ�
		public void setNumber(int Number)
		{
	  		number = Number;
		}

		// ������ �޼ҵ� - ���̸� �־��� ������ �����Ѵ�
		public void setAge(int Age)
		{
	  		age = Age;
		}


}
