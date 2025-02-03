package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.RowMapperImpl;
import com.spring.jdbc.entities.Student;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao {

//	@Autowired
	private JdbcTemplate jdbcTemplate;

	// INSERT
	@Override
	public int insert(Student student) {
		// TODO Auto-generated method stub
		String insertQuery = "insert into student(sname, scity, spercentage) values(?,?,?)";
		int result = this.jdbcTemplate.update(insertQuery, student.getName(), student.getCity(),
				student.getPercentage());
		return result;
	}

	// UPDATE
	@Override
	public int change(Student student) {
		// TODO Auto-generated method stub
		String updateQuery = "update student set sname=?, scity=? where sid=?";
		int r = jdbcTemplate.update(updateQuery, student.getName(), student.getCity(), student.getId());
		return r;
	}

	// DELETE
	@Override
	public int delete(int studentId) {
		// TODO Auto-generated method stub
		String deleteQuery = "delete from student where sid=?";
		int r = jdbcTemplate.update(deleteQuery, studentId);
		return r;
	}

	// SELECT ALL 
	@Override
	public Student getStudent(int studentId) {
		// TODO Auto-generated method stub
		String query = "select * from student where sid=?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = jdbcTemplate.queryForObject(query, rowMapper, studentId);
		return student;
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		String selectQuery = "Select * from student";
		List<Student> allStudents = jdbcTemplate.query(selectQuery, new RowMapperImpl());
		return allStudents;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
