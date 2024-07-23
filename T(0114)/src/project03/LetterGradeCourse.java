package project03;

//LetterGradeCourse.java
//���� ������ �ִ� �������� ��Ÿ����

class LetterGradeCourse extends Course {
	int assignScore; // ���� ����
	int examScore; // ���� ����

	// ���� ���� �������� ������ ���� �־��� ����� �ʱ�ȭ�Ѵ�.
	public LetterGradeCourse(String cname) {
		super(cname);
		attendScore = 0;
		assignScore = 0;
		examScore = 0;
	}

	// �������� ���� ������ ��ȯ�Ѵ�
	public int getAssignScore() {
		return assignScore;
	}

	// �������� ���� ������ ��ȯ�Ѵ�
	public int getExamScore() {
		return examScore;
	}

	// �������� ������ ����Ͽ� ��ȯ�Ѵ�
	public double getTotal() {
		return (attendScore * 0.2 + assignScore * 0.3 + examScore * 0.5);
	}

	// �������� ������ ��ȯ�Ѵ�
	public String getGrade() {
		String letterGrade;
		double total = getTotal();

		if (total >= 90)
			letterGrade = "A";
		else if (total >= 80)
			letterGrade = "B";
		else if (total >= 70)
			letterGrade = "C";
		else if (total >= 60)
			letterGrade = "D";
		else
			letterGrade = "F";

		return letterGrade;
	}

	// �������� �̸�, �⼮ ����, ���� ������ ���� ������ ��ȯ�Ѵ�
	public String toString() {
		String str = super.toString();
		str += "���� ����: " + assignScore + "\n";
		str += "���� ����: " + examScore + "\n";
		return str;
	}

	// �������� ���� ������ �����Ѵ�
	public void setAssignScore(int newAssignScore) {
		assignScore = newAssignScore;
	}

	// �������� ���� ������ �����Ѵ�
	public void setExamScore(int newExamScore)
 {
		examScore = newExamScore;
	}
}[��ó][�ó�����]����ó��-���|

�ۼ���
������