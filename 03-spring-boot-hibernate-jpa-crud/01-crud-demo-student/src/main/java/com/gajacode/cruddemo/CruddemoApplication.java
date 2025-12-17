package com.gajacode.cruddemo;

import com.gajacode.cruddemo.dao.StudentDAO;
import com.gajacode.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner ->{
			//createStudent(studentDAO);
			//createMultipleStudent(studentDAO);
			//readStudentById(studentDAO);
			//readALLStudents(studentDAO);
			//readStudentByLastName(studentDAO);
			//updateStudent(studentDAO);
			//deleteStudent(studentDAO);
			deleteStudentoflname(studentDAO);
		};
	}

	private void deleteStudentoflname(StudentDAO studentDAO) {
		readALLStudents(studentDAO);
		studentDAO.deleteStudent("of object");
		readALLStudents(studentDAO);
	}

	private void deleteStudent(StudentDAO studentDAO) {
		readALLStudents(studentDAO);
		int sId=1;
		studentDAO.deleteStudent(1);
		readALLStudents(studentDAO);
	}


	private void updateStudent(StudentDAO studentDAO) {

		// student id
		int sId=1;

		// get the student
		Student s=studentDAO.getById(sId);
		// set his fisrtname
		System.out.println("before update "+studentDAO.getById(sId));
		s.setFirstName("somesh");
		// update it
		studentDAO.updateStudent(s);
		// display it
		System.out.println("the upadted student : "+studentDAO.getById(sId));
	}

	private void readALLStudents(StudentDAO studentDAO) {

		// read all students

		List<Student> studentList=studentDAO.findAll();
		// display all

		for(Student s : studentList){
			System.out.println(s);
		}
	}

	private void readStudentByLastName(StudentDAO studentDAO) {

		// read  students

		List<Student> studentList=studentDAO.findByLastName("of object");
		// display students

		for(Student s : studentList){
			System.out.println(s);
		}
	}

	private void readStudentById(StudentDAO studentDAO) {

		// create student object
		Student s1=new Student("reader","of object","reader@reader.in");
		// save it
		studentDAO.save(s1);
		// display it
		Student s2=studentDAO.getById(s1.getId());
		System.out.println("id in"+s1.getId()+"now student forom method "+s2);
	}

	private void createMultipleStudent(StudentDAO studentDAO) {
		// create a 3 new student object
		Student tempst1 = new Student("s1", "son", "s1@chennai.in");
		Student tempst2 = new Student("s2", "son", "s2@chennai.in");
		Student tempst3 = new Student("s3", "son", "s3@chennai.in");


		// save that 3student (java object to DB)
		studentDAO.save(tempst1);
		studentDAO.save(tempst2);
		studentDAO.save(tempst3);

		System.out.println("students saved to DB");

	}

	private void createStudent(StudentDAO studentDAO) {
		// create a new student object
		Student tempst = new Student("paul", "son", "paulson@chennai.in");


		// save that student (java object to DB)
		studentDAO.save(tempst);


		// show the msg

		System.out.println("saved the student in DB"+tempst.getId());
	}


}
