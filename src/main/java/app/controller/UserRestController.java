package app.controller;

import app.config.JView;
import app.model.ErrorInfos;
import app.model.Settings;
import app.model.Users;
import app.service.SettingsService;
import app.service.UserService;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * UserControllerクラス<br>
 *　ユーザー関連情報を返すコントローラー
 * @author MewW6m　(https://github.com/MewW6m)
 */
@RestController
public class UserRestController {
	
	@Autowired
	private UserService userservice;

	@Autowired
	private SettingsService settingsService;

	/**
	 * getUserInfo<br>
	 * 指定したユーザー情報を返す
	 *  @param userid urlで指定されたユーザーID
	 * @return User 指定されたユーザー情報
	 */
	@JsonView(JView.UserInfo.class)
	@GetMapping("/api/user/{userid}")
	public Users getUserInfo(@PathVariable("userid") String userid) throws Exception {
		return userservice.getUser(userid);
	}

	/**
	 * postUserInfo<br>
	 * 指定したユーザー情報を更新する
	 *  @param userid urlで指定されたユーザーID
	 *  @param users 更新するユーザー情報の内容
	 *  @param error 検証結果
	 * @return ErrorInfo エラー情報
	 */
	@PostMapping("/api/user/{userid}")
	public ErrorInfos postUserInfo(@PathVariable("userid") String userid, @RequestBody @JsonView(JView.UserInfo.class) @Validated Users users, BindingResult error) {
		return new ErrorInfos();
	}

	/**
	 * getFollowList<br>
	 * 指定したユーザーのフォローユーザーリストを返す
	 *  @param userid urlで指定されたユーザーID
	 * @return List<User> フォローユーザーリスト
	 */
	@JsonView(JView.UserInfo.class)
	@GetMapping("/api/user/follow/{userid}")
	public List<Users> getFollowList(@PathVariable("userid") String userid) {
		return getFollow(userid);
	}

	/**
	 * postFollowList<br>
	 * 指定したユーザーのフォロー情報を更新する
	 *  @param userid urlで指定されたユーザーID
	 *  @param users 更新するユーザー情報(ユーザーID)
	 * @return ErrorInfo エラー情報
	 */
	@JsonView(JView.UserInfo.class)
	@PostMapping("/api/user/follow/{userid}")
	public ErrorInfos postFollowList(@PathVariable("userid") String userid, @RequestBody Users users) {
		return new ErrorInfos();
	}

	/**
	 * getFollowerList<br>
	 * 指定したユーザーのフォロワーユーザーリストを返す
	 *  @param userid urlで指定されたユーザーID
	 * @return List<User> フォロワーユーザーリスト
	 */
	@JsonView(JView.UserInfo.class)
	@GetMapping("/api/user/follower/{userid}")
	public List<Users> getFollowerList(@PathVariable("userid") String userid) {
		return getFollower(userid);
	}

	/**
	 * postFollowerList<br>
	 * 指定したユーザーのフォロワー情報を更新する
	 *  @param userid urlで指定されたユーザーID
	 *  @param users 更新するユーザー情報(ユーザーID)
	 * @return ErrorInfo エラー情報
	 */
	@PostMapping("/api/user/follower/{userid}")
	public ErrorInfos postFollowerList(@PathVariable("userid") String userid, @RequestBody Users users) {
		return new ErrorInfos();
	}

	/**
	 * getTagUserList<br>
	 * 指定したタグのタグ付けユーザーリストを返す
	 *  @param tagName urlで指定されたタグ名
	 * @return List<User> タグ付けユーザーリスト
	 */
	@JsonView(JView.UserInfo.class)
	@GetMapping("/api/tag/{tagName}")
	public List<Users> getTagUserList(@PathVariable("tagName") String tagName) {
		Users user = new Users();
		List<Users> userList = new ArrayList<Users>();
		user.setUserid("ac01");
		user.setUname("user01");
		user.setUmail("mailaddress");
		user.setUdesc("desc");
		user.setUimgpath("/path");
		userList.add(user);
		userList.add(user);
		return userList;
	}

	/**
	 * getAppUserList<br>
	 * 指定したアプリの登録ユーザーリストを返す
	 *  @param aname urlで指定されたアプリ名
	 * @return List<User> タグ付けユーザーリスト
	 */
	@JsonView(JView.UserInfo.class)
	@GetMapping("/api/app/{aname}")
	public List<Users> getAppUserList(@PathVariable("aname") String aname) {
		Users user = new Users();
		List<Users> userList = new ArrayList<Users>();
		user.setUserid("ac01");
		user.setUname("user01");
		user.setUmail("mailaddress");
		user.setUdesc("desc");
		user.setUimgpath("/path");
		userList.add(user);
		userList.add(user);
		return userList;
	}
}