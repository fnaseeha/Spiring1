package com.springboot.project.projectCRUD.repoitory;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.project.projectCRUD.entity.user;

@Repository
public interface userRepository extends JpaRepository<user,Integer> {

	
	
/*	public List<user> getAllUser(){
		TypedQuery<user> us= em.createNamedQuery("select_all",user.class);
		return us.getResultList();
	}*/
}
