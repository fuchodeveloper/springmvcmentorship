package com.andela;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class AppController {
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("fruits", getAllFruits());
		return "fruits";
	}

	@RequestMapping("/fruits")
	public List<Fruits> getAllFruits() {
		return Arrays.asList(
				new Fruits("one", "Orange", "oval shape", "five"),
				new Fruits("two", "Pear", "pear shape", "twenty"),
				new Fruits("three", "Apple", "apple shape", "ten")
		);
	}

}
