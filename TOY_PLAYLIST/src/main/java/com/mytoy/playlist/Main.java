package com.mytoy.playlist;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Main {
	
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main(Model model) {
		String message = "안녕?";
		model.addAttribute("message", message);
		return "main";
	}
}
