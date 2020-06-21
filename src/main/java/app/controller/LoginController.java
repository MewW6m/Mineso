package app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * LoginController<br>
 *　ログイン関連ページを返すコントローラー
 * @author MewW6m　(https://github.com/MewW6m)
 */
@Controller
public class LoginController {

	/**
	 * getLoginPageメソッド<br>
	 * ログインページを返す
	 * @return ModelAndView テンプレートで利用するデータと、Viewに関する情報
	 */
	@GetMapping("/login")
	public ModelAndView getLoginPage() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("login");
		return mav;
	}

	/**
    * postLoginPageメソッド<br>
    * ログイン認証を行い、適切なページを返す
    *  @param reqBody リクエスト内容
    * @return ModelAndView テンプレートで利用するデータと、Viewに関する情報
    */
	@PostMapping("/login")
	public ModelAndView postLoginPage(@RequestBody String reqBody) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("login");
		return new ModelAndView();
	}
}