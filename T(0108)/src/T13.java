import java.util.Scanner;


class Car{
	
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed = 20;
	
	public Car(){
		System.out.println("객체 생성");
	}
	
}

public class T13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
    
		Car mycar = new Car();
		
		//필드 값 읽기
		System.out.println("제작회사 :" + mycar.company);
		System.out.println("모델명 :" + mycar.model);
		System.out.println("색깔 :" + mycar.color);
		System.out.println("최고속도 :" + mycar.maxSpeed);
		System.out.println("현재속도 : " + mycar.speed);
		
		System.out.print("수정할 속도 :");
		mycar.speed = scan.nextInt();

		System.out.println("수정된 속도:" + mycar.speed);
		
	}

}
