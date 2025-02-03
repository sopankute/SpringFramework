package com.springboot.jpa;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.hibernate.boot.model.process.internal.UserTypeResolution;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.*;

import com.springboot.jpa.dao.UserRepository;
import com.springboot.jpa.entities.User;

@SpringBootApplication
public class SpringbootjpaApplication {

	public static void main(String[] args) {
		
		System.out.println("Application Strated.........");
		
		ApplicationContext context = SpringApplication.run(SpringbootjpaApplication.class, args);
		
		UserRepository userRepository = context.getBean(UserRepository.class);
		
		
//		User user = userRepository.findByName("sunya");
//		System.out.println(user);
		
		
		List<User> users = userRepository.findByCity("nanded");
		users.forEach(e->System.out.println(e));
		
		
		/*			
		 * 
		 // Create
		 * User user=new User(); user.setId(745); user.setName("Namdev");
		 * user.setCity("Mukhed");
		 * 
		 * User user1 = userRepository.save(user); System.out.println(user1); 
		 
	
		 // Update
		Optional<User> optional = userRepository.findById(745);
		User user = optional.get();
		user.setCity("Loha");
		userRepository.save(user);
		System.out.println(user);
		 
		 // Read all 
		Iterable<User> iterable = userRepository.findAll();
	
//		1
//		Iterator<User> iterator = iterable.iterator();
//		while(iterator.hasNext()) {
//			User user = iterator.next();
//			System.out.println(user);
//		}
		
//		2
//		iterable.forEach(user->{
//			System.out.println(user);
//		});
		 
		// Delete
		userRepository.deleteById(975);
		System.out.println("Deleted....");
		
		
		// Create Multiple	
		User user1=new User();
		user1.setId(125);
		user1.setName("vishya");
		user1.setCity("nanded");
		
		User user2=new User();
		user2.setId(435);
		user2.setName("sunya");
		user2.setCity("nanded");
		
		User user3=new User();
		user3.setId(975);
		user3.setName("bhushya");
		user3.setCity("jintoor");
		
		List<User> users = List.of(user1, user2, user3);
		Iterable<User> result = userRepository.saveAll(users);
		
		result.forEach(user->{
			System.out.println(user);
		});
		
		 */
		
	}

}
