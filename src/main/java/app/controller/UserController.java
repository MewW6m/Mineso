package app.controller;

import app.model.Settings;
import app.model.User;
import app.service.SettingsService;
import app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * UserControllerImplクラス<br>
 *　ユーザー関連ページを返すコントローラー実装
 * @author MewW6m　(https://github.com/MewW6m)
 */
@RequestMapping("/api/")
@RestController
public class UserController {
	
	@Autowired
	private UserService userservice;

	@Autowired
	private SettingsService settingsService;

	/**
	 * getUserPageメソッド<br>
	 * 指定したユーザーページを返す
	 *  @param userId urlで指定されたユーザーID
	 *  @param mav テンプレートで利用するデータと、Viewに関する情報
	 * @return ModelAndView テンプレートで利用するデータと、Viewに関する情報
	 */
	@GetMapping("/@{userId}")
	public User getUserPage(@PathVariable("userId") String userId, ModelAndView mav) {
		User user = userservice.getUser(userId);
		Settings settings = settingsService.getSettings(user.getUid());
		if (settings.isUserenabled() && settings.isUservisibled()) {
			return user;
		} else {
			return new User();
		}
	}

	/**
	 * getFollowPageメソッド<br>
	 * 指定したユーザーフォローページを返す
	 *  @param userId urlで指定されたユーザーID
	 *  @param mav テンプレートで利用するデータと、Viewに関する情報
	 * @return ModelAndView テンプレートで利用するデータと、Viewに関する情報
	 */
	@GetMapping("/@{userId}/follow")
	public User getFollowPage(@PathVariable("userId") String userId, ModelAndView mav) {
		return new User();
	}

	/**
	 * getFollowerPageメソッド<br>
	 * 指定したユーザーフォロワーページを返す
	 *  @param userId urlで指定されたユーザーID
	 *  @param mav テンプレートで利用するデータと、Viewに関する情報
	 * @return ModelAndView テンプレートで利用するデータと、Viewに関する情報
	 */
	@GetMapping("/@{userId}/follower")
	public User getFollowerPage(@PathVariable("userId") String userId, ModelAndView mav) {
		return new User();
	}
}