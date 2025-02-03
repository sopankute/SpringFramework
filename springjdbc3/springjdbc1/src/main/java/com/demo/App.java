package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.MyConfiguration;
import com.dao.StudentDao;
import com.model.Student1;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
        StudentDao dao = (StudentDao)context.getBean(StudentDao.class);
//        Student1 s = new Student1();
//        s.setSname("Bhushan");
//        s.setScity("Parbhani");
//        s.setSpercentage(78.57);
//        System.out.println(dao.insertStudent(s));
        
//        System.out.println(dao.method1);	// byName
        // Student [sid=100, sname=null, scity=null, spercentage=0.0]
        
//        System.out.println(dao.s);			//byType
        // Student [sid=200, sname=null, scity=null, spercentage=0.0]
    }
}
