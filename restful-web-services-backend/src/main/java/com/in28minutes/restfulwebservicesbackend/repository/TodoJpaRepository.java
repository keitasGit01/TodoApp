package com.in28minutes.restfulwebservicesbackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.restfulwebservicesbackend.todo.Todo;

public interface TodoJpaRepository extends JpaRepository<Todo, Long>{
	
	//List<Todo> findByUsername(String username);

}
