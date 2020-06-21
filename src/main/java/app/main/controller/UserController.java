package app.main.controller;

import app.main.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * UserControllerImplクラス<br>
 *　ユーザー関連ページを返すコントローラー実装
 * @author MewW6m　(https://github.com/MewW6m)
 */
@Controller
public class UserController {
	
	@Autowired
	private UserService userservice;

	/**
	 * getUserPageメソッド<br>
	 * 指定したユーザーページを返す
	 *  @param userId urlで指定されたユーザーID
	 *  @param mav テンプレートで利用するデータと、Viewに関する情報
	 * @return ModelAndView テンプレートで利用するデータと、Viewに関する情報
	 */
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

	/**
	 * getFollowPageメソッド<br>
	 * 指定したユーザーフォローページを返す
	 *  @param userId urlで指定されたユーザーID
	 *  @param mav テンプレートで利用するデータと、Viewに関する情報
	 * @return ModelAndView テンプレートで利用するデータと、Viewに関する情報
	 */
	@GetMapping("/@{userId}/follow")
	public ModelAndView getFollowPage(@PathVariable("userId") String userId, ModelAndView mav) {
		mav.setViewName("Top");
		return mav;
	}

	/**
	 * getFollowerPageメソッド<br>
	 * 指定したユーザーフォロワーページを返す
	 *  @param userId urlで指定されたユーザーID
	 *  @param mav テンプレートで利用するデータと、Viewに関する情報
	 * @return ModelAndView テンプレートで利用するデータと、Viewに関する情報
	 */
	@GetMapping("/@{userId}/follower")
	public ModelAndView getFollowerPage(@PathVariable("userId") String userId, ModelAndView mav) {
		mav.setViewName("Top");
		return mav;
	}
}