package com.andreea.onlinecatalog;

import com.andreea.onlinecatalog.model.Professor;
import com.andreea.onlinecatalog.model.Student;
import com.andreea.onlinecatalog.repository.ProfessorRepository;
import com.andreea.onlinecatalog.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnlinecatalogApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;
	private ProfessorRepository professorRepository;

	public static void main(String[] args) {
		SpringApplication.run(OnlinecatalogApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//
//		Student student=new Student();
//		student.setFirstName("John");
//		student.setLastName("Doe");
//
//
//		Student student2=new Student();
//		student2.setFirstName("John2");
//		student2.setLastName("Doe2");
//
//		studentRepository.save(student);
//		studentRepository.save(student2);
//
//		System.out.println("********Before delete*******");
//		for (Student s:studentRepository.findAll()){
//			System.out.println(s.getStudentId()+ "."+s.getFirstName() +"."+ s.getLastName());
//		}
//		System.out.println("********After delete*******");
//		studentRepository. deleteById(2);
//		for (Student s:studentRepository.findAll()){
//			System.out.println(s.getStudentId()+ "."+s.getFirstName() +"."+ s.getLastName());
//		}

	}

}
