package com.andela.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.andela.model.Fruits;
import org.springframework.stereotype.Service;

@Service
public class FruitService {
	private List<Fruits> fruits = new ArrayList<>(Arrays.asList(
			new Fruits(1L, "Orange", "oval shape", "five"),
			new Fruits(2L, "Pear", "pear shape", "twenty"),
			new Fruits(3L, "Apple", "apple shape", "ten")
	));

	public List<Fruits> getFruits() {
		return fruits;
	}

	public void addFruits(Fruits fruits) {
//		fruits.add(fruits);
		System.out.println(fruits);
	}
}
