package com.andela;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	@RequestMapping("/")
	public String index() {
		return "This is a sample text from AppController using RequestMapping";
	}
}
