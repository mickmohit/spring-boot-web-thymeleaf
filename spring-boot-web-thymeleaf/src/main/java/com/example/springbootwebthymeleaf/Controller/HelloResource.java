package com.example.springbootwebthymeleaf.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
@RequestMapping("/hello")
public class HelloResource {

	// inject via application.properties
		@Value("${welcome.message}")
		private String message = "Hello World";

		@GetMapping("/message")
		public String welcome(Map<String, Object> model) {
			model.put("message", this.message);
			return "welcome";
		}
	
}
