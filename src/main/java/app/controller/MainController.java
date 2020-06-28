package app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

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
	@GetMapping("/top")
    public String getTopPage() {
        return "Top";
    }

	/**
	 * getMainPageメソッド<br>
	 * ログイン状況に応じて、ページをリダイレクトする
	 * @return String リダイレクト先
	 */
	@GetMapping("/")
	public String getMainPage() {
		if (true) { // ログインしているとき
			return "redirect:/main";
		} else { // ログインしていないとき
			return "redirect:/top";
		}
	}

	/**
	 * postAuthメソッド<br>
	 * ログインする
	 * @return String リダイレクト先
	 */
    @PostMapping("/auth/{socialType}")
	public String postAuth(@PathVariable("socialType") String socialType) {
		return "redirect:/@id1";
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
	
	/**
	 * getTermsPageメソッド<br>
	 * 利用規約ページを返す
	 * @return String 利用規約ページ
	 */
	@GetMapping("/terms")
    public String getTermsPage() {
		return "Terms";
	}
}