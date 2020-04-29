package app.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public interface SettingsControllerIF{
	
	// プロフィール設定ページを返す
	@GetMapping("/settings/profile")
    public ModelAndView settingProfilePage(ModelAndView mav);

	// アカウント設定ページを返す
	@GetMapping("/settings/account")
    public ModelAndView settingAccountPage(ModelAndView mav);

	// 通知設定ページを返す
	@GetMapping("/settings/notification")
    public ModelAndView settingNortificationPage(ModelAndView mav);

	// 表示設定ページを返す
	@GetMapping("/settings/customize")
    public ModelAndView settingCustomizePage(ModelAndView mav);
}