package com.nsh.database.springdatabase.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nsh.database.springdatabase.entity.Person;

@Repository
public class PersonJdbcDAO {
	
	public class PersonMapper implements RowMapper<Person>{

		@Override
		public Person mapRow(ResultSet res, int rowNum) throws SQLException {
			
			Person person = new Person();
			person.setId(res.getInt("id"));
			person.setName(res.getString("name"));
			person.setLocation(res.getString("location"));
			person.setBirthDate(res.getTimestamp("birth_date"));
			return person;
		}
		
	}
    
	@Autowired
	JdbcTemplate jdbcTemplete;
	//select
	public List<Person> findAll(){
		return jdbcTemplete.query("select * from person",
				new PersonMapper());	
		
	}
	
	public Person findById(int id){
		return jdbcTemplete.queryForObject(
				"select * from person where id=?",new Object[]{id},
				new PersonMapper());
	}
	
	public int deleteById(int id){
		return jdbcTemplete.update("delete from person where id = ?",
				new Object[]{id});
	} 
	
	public int insert(Person p){
		return jdbcTemplete.update("insert into person(id,name,location,birth_date)"
				+ "values (?,?,?,?)",
				new Object[]{p.getId(),p.getName(),p.getLocation(),new Timestamp(p.getBirthDate().getTime())});
	} 
}
