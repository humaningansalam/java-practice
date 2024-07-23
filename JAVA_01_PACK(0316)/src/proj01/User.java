package proj01;

public class User {
	private String senum;
	
	private String date;
	private String name;
	private String number;
	
	private String toto;
	
	public User() {
		
	}
	
	public User(String senum) {
		
		this.senum = senum;
		
	}
	
	public User(String senum, String date, String name, String number, String toto) {
		
		this.senum = senum;
		
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getSenum() {
		return senum;
	}

	public void setSenum(String senum) {
		this.senum = senum;
	}

	public String getToto() {
		return toto;
	}

	public void setToto(String toto) {
		this.toto = toto;
	}

	@Override
	public String toString() {
		return "User [senum=" + senum + ", date=" + date + ", name=" + name + ", number=" + number + ", toto=" + toto
				+ "]";
	}

	

}
