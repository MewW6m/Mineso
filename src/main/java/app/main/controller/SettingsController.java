package app.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * SettingsController<br>
 * 設定関連ページを返すコントローラー
 * @author MewW6m　(https://github.com/MewW6m)
 */
@RequestMapping("/settings")
@Controller
public class SettingsController {

	/**
	 * settingProfilePageメソッド<br>
	 * プロフィール設定ページにリダイレクトする
	 * @return String リダイレクト
	 */
	@GetMapping("")
	public String redirectProfilePage() {
		return "redirect:/settings/profile";
	}

	/**
	 * settingProfilePageメソッド<br>
	 * プロフィール設定ページを返す
	 *  @param mav テンプレートで利用するデータと、Viewに関する情報
	 * @return ModelAndView テンプレートで利用するデータと、Viewに関する情報
	 */
	@GetMapping("/profile")
    public ModelAndView settingProfilePage(ModelAndView mav) {
		mav.setViewName("Top");
		return mav; 
	}

	/**
	 * settingAccountPageメソッド<br>
	 * アカウント設定ページを返す
	 *  @param mav テンプレートで利用するデータと、Viewに関する情報
	 * @return ModelAndView テンプレートで利用するデータと、Viewに関する情報
	 */
	@GetMapping("/account")
    public ModelAndView settingAccountPage(ModelAndView mav) {
		mav.setViewName("Top");
		return mav; 
	}

	/**
	 * settingNortificationPageメソッド<br>
	 * 通知設定ページを返す
	 *  @param mav テンプレートで利用するデータと、Viewに関する情報
	 * @return ModelAndView テンプレートで利用するデータと、Viewに関する情報
	 */
	@GetMapping("/notification")
    public ModelAndView settingNortificationPage(ModelAndView mav) {
		mav.setViewName("Top");
		return mav; 
	}

	/**
	 * settingCustomizePageメソッド<br>
	 * 表示設定ページを返す
	 *  @param mav テンプレートで利用するデータと、Viewに関する情報
	 * @return ModelAndView テンプレートで利用するデータと、Viewに関する情報
	 */
	@GetMapping("/customize")
    public ModelAndView settingCustomizePage(ModelAndView mav) {
		mav.setViewName("Top");
		return mav; 
	}
}