package com.zhanylai11.cruddemo;

import com.zhanylai11.cruddemo.dao.StudentDAO;
import com.zhanylai11.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			//createStudent(studentDAO);

		    //createMultipleStudents(studentDAO);

			//readStudent(studentDAO);
			deleteStudent(studentDAO);


		};
	}

	private void deleteStudent(StudentDAO studentDAO) {
		int studentDeleted = 3;
		System.out.println("Deleting student id: " + studentDeleted);
		studentDAO.delete(studentDeleted);
	}

	private void readStudent(StudentDAO studentDAO) {

		//create object
		System.out.println("Creating a Student");
		Student tempStudent = new Student("Lana", "Park", "lanalana@naver.com");

		//save the student
		System.out.println("Saving the student");
		studentDAO.save(tempStudent);

		//display object
		int theStudentId = tempStudent.getId();
		System.out.println("Saved Student. Generated Id: " + theStudentId);

		//retrieving student
		System.out.println("Retrieving student with id: " + theStudentId);
		Student myStudent = studentDAO.findById(theStudentId);

		//prints the student
		System.out.println("Student : " + myStudent);

	}
	}

	/*
	private void createMultipleStudents(StudentDAO studentDAO) {
		//create the student object
		System.out.println("Creating new 3 student objects ...");
		Student tempStudent1 = new Student("Zhanylai", "Dzholchieva", "dzh.2002z@gmail.com");
		Student tempStudent2 = new Student("Luiza", "Bek", "luiz@gmail.com");
		Student tempStudent3 = new Student("Lee", "Min", "minhoo@naver.com");

		//save
		System.out.println("Saving the student");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);

		//display id of the saved student
		System.out.println("Saved student. Generated id: " + tempStudent1.getId());
		System.out.println("Saved student. Generated id: " + tempStudent2.getId());
		System.out.println("Saved student. Generated id: " + tempStudent3.getId());

	}

	}


	private void createStudent(StudentDAO studentDAO) {

		//create the student object
		System.out.println("Creating new student object ...");
		Student tempStudent = new Student("Zhanylai", "Dzholchieva", "dzh.2002z@gmail.com");

		//save
		System.out.println("Saving the student");
		studentDAO.save(tempStudent);

		//display id of the saved student
		System.out.println("Saved student. Generated id: " + tempStudent.getId());

	}

	 */


