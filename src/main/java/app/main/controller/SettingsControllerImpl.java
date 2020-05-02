package app.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * SettingsControllerImplクラス<br>
 * 設定関連ページを返すコントローラー実装
 * @author MewW6m　(https://github.com/MewW6m)
 */
@Controller
public class SettingsControllerImpl implements SettingsControllerIF{
	
	@Override
	@GetMapping("/settings/profile")
    public ModelAndView settingProfilePage(ModelAndView mav) {
		mav.setViewName("Top");
		return mav; 
	}

	@Override
	@GetMapping("/settings/account")
    public ModelAndView settingAccountPage(ModelAndView mav) {
		mav.setViewName("Top");
		return mav; 
	}

	@Override
	@GetMapping("/settings/notification")
    public ModelAndView settingNortificationPage(ModelAndView mav) {
		mav.setViewName("Top");
		return mav; 
	}

	@Override
	@GetMapping("/settings/customize")
    public ModelAndView settingCustomizePage(ModelAndView mav) {
		mav.setViewName("Top");
		return mav; 
	}
}