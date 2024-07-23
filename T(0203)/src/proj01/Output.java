package proj01;

import java.util.ArrayList;

public class Output {
	
	public Output(ArrayList<Student> list){
		
		for(Student stu : list)
			System.out.println(stu.toString());
		
	}

}
