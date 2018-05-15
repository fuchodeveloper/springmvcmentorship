package com.andela.repositories;

import java.util.List;

import com.andela.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long>{
	List<Person> findByFirstName(String firstName);
}
