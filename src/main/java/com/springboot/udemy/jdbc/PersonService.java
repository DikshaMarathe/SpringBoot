package com.springboot.udemy.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springboot.udemy.entity.Person;

@Repository
public class PersonService {
	@Autowired
	JdbcTemplate jdbctemplate;
	
	public List<Person> getRecords(){
		return jdbctemplate.query("Select * from Person", new BeanPropertyRowMapper<Person>(Person.class) );
	}
	
	public Person findById(long id) {
		return jdbctemplate.queryForObject("Select * from Person where id = ?", new Object[] {id},
				new BeanPropertyRowMapper<Person>(Person.class));
	}
	
	public int deleteById(long id) {
		return jdbctemplate.update("delete from person where id = ?", new Object[] {id});
	}
}
