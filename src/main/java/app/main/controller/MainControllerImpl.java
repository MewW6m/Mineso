package app.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * MainControllerImplクラス<br>
 * トップページやエラーページなど共通のページを返すコントローラー実装
 * @author MewW6m　(https://github.com/MewW6m)
 */
@Controller
public class MainControllerImpl implements MainControllerIF{

	@Override
	@GetMapping("/")
    public String getTopPage() {
        return "Top";
    }
	
}