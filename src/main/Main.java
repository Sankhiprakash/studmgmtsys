package main;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import service.StudentService;
import entity.Student;

public class Main {

	public static void main(String argv[]) throws Exception {

		System.out.println("                STUDENT RECORD MANAGEMENT SYSTEM           ");

		System.out.println("0. Show all students");
		System.out.println("1.Add student record");
		System.out.println("2.Edit student record");
		System.out.println("3.Delete student record");
		System.out.println("4.Exit");

		System.out.println("Enter a valid option");
		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();
		StudentService service = new StudentService();

		switch (option) {
		
		case 0:

			 List<Student> list=service.getAllStudents();
			
			System.out.println("\t\t\t id"+"\t\t\t name"+"\t\t\t rollNo"+"\t\t\t address"+"\t\t\t grade");
			for (Student student : list) {
				System.out.println("\t\t\t"+student.getId()+"\t\t\t"+student.getName()+"\t\t\t"+student.getRoll_no()+"\t\t\t"+student.getAddress()+"\t\t\t"+student.getGrade());	
			}
			
			break; 
			
			
			
			
		case 1:
			Student student = new Student();

			System.out.println("Enter student name.");
			String name = scanner.next();
			student.setName(name);

			System.out.println("Enter student roll no");
			int roll_no = scanner.nextInt();
			student.setRoll_no(roll_no);

			System.out.println("Enter student address ");
			String address = scanner.next();
			student.setAddress(address);

			System.out.println("Enter student grade");
			String grade = scanner.next();
			student.setGrade(grade);

			service.addStudent(student);
			break;
			
			
			default: System.exit(0);

		    }

		scanner.close();
	}
}
