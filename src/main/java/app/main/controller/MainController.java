package app.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * MainController<br>
 * トップページやヘルプページなど共通のページを返すコントローラー
 * @author MewW6m　(https://github.com/MewW6m)
 */
@Controller
public class MainController {

	/**
	 * getTopPageメソッド<br>
	 * Topページを返す
	 * @return String Topページ
	 */
	@GetMapping("/")
    public String getTopPage() {
        return "Top";
    }

	/**
	 * getHelpPageメソッド<br>
	 * Helpページを返す
	 * @return String Helpページ
	 */
	@GetMapping("/help")
    public String getHelpPage() {
		return "Help";
	}
}