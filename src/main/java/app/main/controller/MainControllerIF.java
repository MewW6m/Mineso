package app.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public interface MainControllerIF {
	
	@GetMapping("/")
    public String getTopPage();
	
}