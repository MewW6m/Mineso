package app.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainControllerImpl implements MainControllerIF{

	@Override
	@GetMapping("/")
    public String getTopPage() {
        return "Top";
    }
	
}