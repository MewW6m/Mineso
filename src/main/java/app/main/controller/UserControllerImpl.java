package app.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import app.main.service.UserServiceIF;

/**
 * UserControllerImplクラス<br>
 *　ユーザー関連ページを返すコントローラー実装
 * @author MewW6m　(https://github.com/MewW6m)
 */
@Controller
public class UserControllerImpl implements UserControllerIF {
	@Autowired(required = false)
	private UserServiceIF userservice;

	@Override
	@GetMapping("/@{userId}")
	public ModelAndView getUserPage(@PathVariable("userId") String userId, ModelAndView mav) {
		userservice.setUser(userId);
		if (userservice.getUserEnabled(userId) && userservice.getUserVisibled(userId)) {
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

	@Override
	@GetMapping("/@{userId}/follow")
	public ModelAndView getFollowPage(@PathVariable("userId") String userId, ModelAndView mav) {
		mav.setViewName("Top");
		return mav;
	}

	@Override
	@GetMapping("/@{userId}/follower")
	public ModelAndView getFollowerPage(@PathVariable("userId") String userId, ModelAndView mav) {
		mav.setViewName("Top");
		return mav;
	}
}