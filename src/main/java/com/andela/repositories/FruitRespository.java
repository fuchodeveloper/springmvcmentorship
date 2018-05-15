package com.andela.repositories;

import java.util.List;

import com.andela.model.Fruits;
import org.springframework.data.repository.CrudRepository;

public interface FruitRespository extends CrudRepository<Fruits, Long> {
	List<Fruits> findByName(String name);
}
