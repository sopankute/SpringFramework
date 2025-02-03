package com.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.model.Student1;
@Component
public class StudentDao {
	@Autowired
	private JdbcTemplate j;
	
//	@Autowired
//	public Student1 method1;	// byName
	
	public Student1 s;
	
	@Autowired
	public void setS(Student1 s) {
		this.s = s;
	}

	public int insertStudent(Student1 s){
		String query = "insert into student(sname, scity, spercentage) values(?,?,?)";
		return j.update(query, new Object[] {s.getSname(), s.getScity(), s.getSpercentage()});
	}
}
