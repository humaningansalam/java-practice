package project03;

//LetterGradeCourse.java
//문자 학점을 주는 교과목을 나타낸다

class LetterGradeCourse extends Course {
	int assignScore; // 과제 점수
	int examScore; // 시험 점수

	// 문자 학점 교과목의 변수들 값을 주어진 값들로 초기화한다.
	public LetterGradeCourse(String cname) {
		super(cname);
		attendScore = 0;
		assignScore = 0;
		examScore = 0;
	}

	// 교과목의 과제 점수를 반환한다
	public int getAssignScore() {
		return assignScore;
	}

	// 교과목의 시험 점수를 반환한다
	public int getExamScore() {
		return examScore;
	}

	// 교과목의 총점을 계산하여 반환한다
	public double getTotal() {
		return (attendScore * 0.2 + assignScore * 0.3 + examScore * 0.5);
	}

	// 교과목의 학점을 반환한다
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

	// 교과목의 이름, 출석 점수, 과제 점수와 시험 점수를 반환한다
	public String toString() {
		String str = super.toString();
		str += "과제 점수: " + assignScore + "\n";
		str += "시험 점수: " + examScore + "\n";
		return str;
	}

	// 교과목의 과제 점수를 변경한다
	public void setAssignScore(int newAssignScore) {
		assignScore = newAssignScore;
	}

	// 교과목의 시험 점수를 변경한다
	public void setExamScore(int newExamScore)
 {
		examScore = newExamScore;
	}
}[출처][시나리오]성적처리-상속|

작성자
탭탭이