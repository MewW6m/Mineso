package app.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * MainControllerIFインターフェース<br>
 * トップページやエラーページなど共通のページを返すコントローラーインターフェース
 * @author MewW6m　(https://github.com/MewW6m)
 */
@Controller
public interface MainControllerIF {

	/**
    * getTopPageメソッド<br>
    * Topページを返す
    */
	@GetMapping("/")
    public String getTopPage();
	
}