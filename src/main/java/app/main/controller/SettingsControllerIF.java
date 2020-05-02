package app.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * SettingsControllerIFインターフェース<br>
 * 設定関連ページを返すコントローラーインターフェース
 * @author MewW6m　(https://github.com/MewW6m)
 */
@Controller
public interface SettingsControllerIF{

	/**
    * settingProfilePageメソッド<br>
    * プロフィール設定ページを返す
    *  @param mav テンプレートで利用するデータと、Viewに関する情報
    * @return ModelAndView テンプレートで利用するデータと、Viewに関する情報
    */
	@GetMapping("/settings/profile")
    public ModelAndView settingProfilePage(ModelAndView mav);

	/**
    * settingAccountPageメソッド<br>
    * アカウント設定ページを返す
    *  @param mav テンプレートで利用するデータと、Viewに関する情報
    * @return ModelAndView テンプレートで利用するデータと、Viewに関する情報
    */
	@GetMapping("/settings/account")
    public ModelAndView settingAccountPage(ModelAndView mav);

	/**
    * settingNortificationPageメソッド<br>
    * 通知設定ページを返す
    *  @param mav テンプレートで利用するデータと、Viewに関する情報
    * @return ModelAndView テンプレートで利用するデータと、Viewに関する情報
    */ 
	@GetMapping("/settings/notification")
    public ModelAndView settingNortificationPage(ModelAndView mav);

	/**
    * settingCustomizePageメソッド<br>
    * 表示設定ページを返す
    *  @param mav テンプレートで利用するデータと、Viewに関する情報
    * @return ModelAndView テンプレートで利用するデータと、Viewに関する情報
    */
	// 
	@GetMapping("/settings/customize")
    public ModelAndView settingCustomizePage(ModelAndView mav);
}