package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.StudentDao;
import com.model.Student;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        StudentDao dao = (StudentDao)context.getBean("sd");
        Student s = new Student();
        s.setSname("Nitin");
        s.setScity("Mumbai");
        s.setSpercentage(84.57);
        System.out.println(dao.insertStudent(s));
    }
}
