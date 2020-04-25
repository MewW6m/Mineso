package app.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import app.main.service.UserServiceIF;

@Controller
public class UserController{	
	@Autowired(required=false)
	private UserServiceIF userservice;

	// 指定したユーザーページを返す
	@GetMapping("/@{userId}")
    public ModelAndView getUserPage(@PathVariable("userId") String userId, ModelAndView mav) {
		userservice.getUser(userId);
		if(userservice.getUserEnabled(userId) && userservice.getUserVisibled(userId)) {
			mav.addObject("userId", userId);
			mav.addObject("userName", userservice.getUserName(userId));
			mav.addObject("userMailAddress", userservice.getUserMailAddres(userId));
			mav.addObject("userDescription", userservice.getUserDescription(userId));
			mav.addObject("userImage", userservice.getUserImage(userId));
			mav.setViewName("user");
		} else {
			mav.setViewName("Top");
		}
		return mav;
    }
	
	// 指定したユーザーフォローページを返す
	@GetMapping("/@{userId}/follow")
    public ModelAndView getFollowPage(@PathVariable("userId") String userId, ModelAndView mav) {
		mav.setViewName("Top");
		return mav; 
	}
	
	// 指定したユーザーフォロワーページを返す
	@GetMapping("/@{userId}/follower")
    public ModelAndView getFollowerPage(@PathVariable("userId") String userId, ModelAndView mav) {
		mav.setViewName("Top");
		return mav; 
	}
}