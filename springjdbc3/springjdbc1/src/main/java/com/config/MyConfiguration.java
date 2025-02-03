package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.model.Student1;

@Configuration
@ComponentScan(basePackages = {"com.dao"})
public class MyConfiguration {
	
	@Bean
	public JdbcTemplate meth1() {
		JdbcTemplate j = new JdbcTemplate();
		j.setDataSource(meth2());
		return j;
	}
	
	@Bean
	public Student1 method1() {			// byName
		Student1 s = new Student1();
		s.setSid(100);
		return s;
	}
	
	@Bean("s")						//byType
	public Student1 method2() {
		Student1 s = new Student1();
		s.setSid(200);
		return s;
	}
	private DriverManagerDataSource meth2() {
		DriverManagerDataSource d = new DriverManagerDataSource();
		d.setDriverClassName("com.mysql.cj.jdbc.Driver");
		d.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		d.setUsername("root");
		d.setPassword("Mysqsk45@123");
		return d;
	}
}
