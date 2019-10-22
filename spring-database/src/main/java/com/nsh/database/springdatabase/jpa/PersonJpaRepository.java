package com.nsh.database.springdatabase.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.data.annotation.Persistent;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.nsh.database.springdatabase.entity.Person;

@Repository
@Transactional
public class PersonJpaRepository {
	
	//connect db
	@PersistenceContext
	EntityManager entityManager;
	
	public Person findById(int id){
		return entityManager.find(Person.class, id);
	}

	public Person insert(Person person){
		return entityManager.merge(person);
	}
	
	public void deleteyId(int id){
		Person p = findById(id);
		 entityManager.remove(p);
	}
	
	public List<Person> findAll(){
		TypedQuery<Person> querys =  entityManager.createNamedQuery("select_all",Person.class);
		return querys.getResultList();
	}
}
