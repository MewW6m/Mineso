package app.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SettingsControllerImpl implements SettingsControllerIF{
	
	// プロフィール設定ページを返す
	@Override
	@GetMapping("/settings/profile")
    public ModelAndView settingProfilePage(ModelAndView mav) {
		mav.setViewName("Top");
		return mav; 
	}

	// アカウント設定ページを返す
	@Override
	@GetMapping("/settings/account")
    public ModelAndView settingAccountPage(ModelAndView mav) {
		mav.setViewName("Top");
		return mav; 
	}

	// 通知設定ページを返す
	@Override
	@GetMapping("/settings/notification")
    public ModelAndView settingNortificationPage(ModelAndView mav) {
		mav.setViewName("Top");
		return mav; 
	}

	// 表示設定ページを返す
	@Override
	@GetMapping("/settings/customize")
    public ModelAndView settingCustomizePage(ModelAndView mav) {
		mav.setViewName("Top");
		return mav; 
	}
}