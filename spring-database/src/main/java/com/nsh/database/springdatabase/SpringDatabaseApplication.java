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

//@SpringBootApplication
public class SpringDatabaseApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	PersonJdbcDAO dao;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDatabaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All users -> {} ",dao.findById(20002));
		logger.info("All users -> {} ",dao.deleteById(20003));
		logger.info("All users -> {} ",dao.insert(new Person(10002,"Ilhama","Kurunegele",new Date())));
	}

}
