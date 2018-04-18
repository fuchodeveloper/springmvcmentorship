package com.andela.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.andela.Fruits;
import org.springframework.stereotype.Service;

@Service
public class FruitService {
	private List<Fruits> fruits = new ArrayList<>(Arrays.asList(
			new Fruits("one", "Orange", "oval shape", "five"),
			new Fruits("two", "Pear", "pear shape", "twenty"),
			new Fruits("three", "Apple", "apple shape", "ten")
	));

	public List<Fruits> getFruits() {
		return fruits;
	}

	public void addFruits(Fruits fruits) {
//		fruits.add(fruits);
		System.out.println(fruits);
	}
}
