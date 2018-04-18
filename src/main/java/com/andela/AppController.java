package com.andela;

import java.util.Arrays;
import java.util.List;

import com.andela.services.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class AppController {

	@Autowired
	private FruitService fruitService;

	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("fruits", getAllFruits());
		return "fruits";
	}

	@RequestMapping("/fruits")
	public List<Fruits> getAllFruits() {
		return fruitService.getFruits();
	}


}
