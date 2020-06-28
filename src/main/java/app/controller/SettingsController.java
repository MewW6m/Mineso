package app.controller;

import app.model.Settings;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * SettingsController<br>
 * 設定関連ページを返すコントローラー
 * @author MewW6m　(https://github.com/MewW6m)
 */
@RequestMapping("/api/setting")
@RestController
public class SettingsController {

//	/**
//	 * settingProfilePageメソッド<br>
//	 * プロフィール設定ページにリダイレクトする
//	 * @return String リダイレクト
//	 */
//	@GetMapping("")
//	public String redirectProfilePage() {
//		return "redirect:/settings/profile";
//	}

	/**
	 * settingProfilePageメソッド<br>
	 * プロフィール設定ページを返す
	 *  @param mav テンプレートで利用するデータと、Viewに関する情報
	 * @return ModelAndView テンプレートで利用するデータと、Viewに関する情報
	 */
	@GetMapping("/profile/@{userId}")
    public Settings settingProfilePage(ModelAndView mav) {
		return new Settings();
	}

	/**
	 * settingAccountPageメソッド<br>
	 * アカウント設定ページを返す
	 *  @param mav テンプレートで利用するデータと、Viewに関する情報
	 * @return ModelAndView テンプレートで利用するデータと、Viewに関する情報
	 */
	@GetMapping("/account/@{userId}")
    public Settings settingAccountPage(ModelAndView mav) {
		return new Settings();
	}

	/**
	 * settingNortificationPageメソッド<br>
	 * 通知設定ページを返す
	 *  @param mav テンプレートで利用するデータと、Viewに関する情報
	 * @return ModelAndView テンプレートで利用するデータと、Viewに関する情報
	 */
	@GetMapping("/notification/@{userId}")
    public Settings settingNortificationPage(ModelAndView mav) {
		return new Settings();
	}

	/**
	 * settingCustomizePageメソッド<br>
	 * 表示設定ページを返す
	 *  @param mav テンプレートで利用するデータと、Viewに関する情報
	 * @return ModelAndView テンプレートで利用するデータと、Viewに関する情報
	 */
	@GetMapping("/customize/@{userId}")
    public Settings settingCustomizePage(ModelAndView mav) {
		return new Settings();
	}
}