package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Student;

public class StudentService {

	public StudentService() {

	}
/*
	Connection conn = null;
	PreparedStatement preparedStatement = null;
	ResultSet rs = null; */
	
	String url ="jdbc:mysql://localhost:3306/student";
	String USER_NAME ="root";
	String PASSWORD ="root";
	
	try {
		
		Class driverClass = Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
		
		
		//get a connection to a database
		com.mysql.jdbc.Connection myConn = DriverManager.getConnection(url,USER_NAME,PASSWORD);
	
		//create  a statement
		
		statement myStmt = myConn.createStatement();
		
		//execute a query
		
		string sql = " insert into student " + " (name, roll_no, address, grade)" 
		  + "(prakash, 345, suryapal, 6b)" ;
		
		myStmt.executeUpdate(sql);
		
	}
	
		
		
		
	

	public void getConnection() {
		try {
			
			Class driverClass = Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}

	}

	public void addStudent(Student student) throws Exception {
		getConnection();
		Connection conn = DriverManager.getConnection(url, USER_NAME, PASSWORD);
		String query="insert into student values"+"("+student.getName()+","+student.getRoll_no()+","+student.getAddress()+","+student.getGrade()+")";
		preparedStatement=conn.prepareStatement(query);
		preparedStatement.executeQuery(query); 
		
		
		
		String query = "INSERT INTO student(id,name,roll_no,address,grade) VALUES(?,?,?,?,?,?)";
		preparedStatement.executeQuery(query);
		
		preparedStatement = conn.preparedStatement(query);
		
		
  
	
	
	


	public void updateStudent(long id) {

	}

	public void deleteStudent(long id) {

	}
	
	public List<Student> getAllStudents() throws SQLException{
		getConnection();
		Connection conn=DriverManager.getConnection(url, USER_NAME, PASSWORD);
		String sql="Select * from student";
	    preparedStatement=conn.prepareStatement(sql);
	    ResultSet rs=preparedStatement.executeQuery();
	    
	    List<Student> allStudents=new ArrayList<Student>();
 	    
	    while(rs.next()){
	    	int userid = rs.getInt(1);
			String name = rs.getString(2);
			int roll_no = rs.getInt(3);
			String address = rs.getString(4);
			String grade = rs.getString(5);

			Student student= new Student(userid, name, roll_no, address, grade);
			allStudents.add(student);
	    }
	    
	    return allStudents;
	    
		
	}

}
