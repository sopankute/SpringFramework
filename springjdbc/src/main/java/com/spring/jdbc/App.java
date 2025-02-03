package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");

		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
		
		System.out.println("App.main() | context created");

		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

		System.out.println("App.main() | studentDao bean created");

		// INSERT
		Student student = new Student();
//		student.setName("Vishwa");
//		student.setCity("Nanded");
//		student.setPercentage(86);
//		int result = studentDao.insert(student);
//		System.out.println("App.main() | record inserted : " + result);

//		JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
//		String insertQuery = "insert into student(sname, scity, spercentage) values(?,?,?)";
//		int result = template.update(insertQuery, "Sunil", "Pune", 78);
//		System.out.println("App.main() | record inserted " +result );

		// UPDATE
//		Student student = new Student();
//		student.setName("Mahavir");
//		student.setCity("SambhajiNagar");
//		student.setId(9);
//		
//		int result = studentDao.change(student);
//		System.out.println("App.main() | "+result+" record updated");

		// DELETE
//		int result = studentDao.delete(5);
//		System.out.println("App.main() | " + result + " deleted succesfully.");

		
		// Get Student
//		student = studentDao.getStudent(8);
//		System.out.println(student);
		
		List<Student> list = studentDao.getAllStudent();
		for(Student s : list) {
			System.out.println(s);
		}
		
	}

}
