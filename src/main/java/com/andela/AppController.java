package com.andela;

import java.util.List;

import com.andela.model.Fruits;
import com.andela.services.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
