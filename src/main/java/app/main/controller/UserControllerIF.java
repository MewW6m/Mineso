package app.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public interface UserControllerIF {
	
	// 指定したユーザーページを返す
	public ModelAndView getUserPage(@PathVariable("userId") String userId, ModelAndView mav);
	
	// 指定したユーザーフォローページを返す
	public ModelAndView getFollowPage(@PathVariable("userId") String userId, ModelAndView mav);
	
	// 指定したユーザーフォロワーページを返す
	public ModelAndView getFollowerPage(@PathVariable("userId") String userId, ModelAndView mav);

}
