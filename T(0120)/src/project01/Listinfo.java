package project01;

public class Listinfo {
	
	public String name;
	public String number;

	public String date;

	@Override
	public String toString() {
		return "방문시간 :" + date + "  " + "이름 :" + name + "  번호 :" + number;		
	}
	

}
