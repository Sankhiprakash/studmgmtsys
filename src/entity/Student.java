package entity;

public class Student {
	
	private int id;

	private String name;
	
	private int roll_no;
	
	private String address;
	
	private String grade;
	
	public Student(int id,String name,int roll_no,String address,String grade){
		this.id=id;
		this.name=name;
		this.roll_no=roll_no;
		this.address=address;
		this.grade=grade;	
	}
	
	public Student(){
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
	
}
