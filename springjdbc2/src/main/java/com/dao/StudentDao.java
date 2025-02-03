package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.model.Student;

@Component
public class StudentDao {
	@Autowired
	private JdbcTemplate j;

//	public void setJ(JdbcTemplate j) {
//		this.j = j;
//	}
	
	public int insertStudent(Student s){
		String query = "insert into student(sname, scity, spercentage) values(?,?,?)";
		return j.update(query, new Object[] {s.getSname(), s.getScity(), s.getSpercentage()});
	}
}
