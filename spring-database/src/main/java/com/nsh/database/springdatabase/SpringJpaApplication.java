package com.nsh.database.springdatabase;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nsh.database.springdatabase.entity.Person;
import com.nsh.database.springdatabase.jdbc.PersonJdbcDAO;
import com.nsh.database.springdatabase.jpa.PersonJpaRepository;

@SpringBootApplication
public class SpringJpaApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	PersonJpaRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All users -> {} ",repository.findById(20002));
		
		logger.info("All users -> {} ",repository.insert(new Person(10002,"Ilhama","Kurunegele",new Date())));
		logger.info("All users -> {} ",repository.insert(new Person(20001,"Naseeha","Japan",new Date())));
		repository.deleteyId(1);
		logger.info("All users -> {} ",repository.findAll());
	}

}
