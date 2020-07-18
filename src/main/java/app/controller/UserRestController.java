package app.controller;

import app.config.JView;
import app.model.ErrorInfos;
import app.model.Users;
import app.service.SettingsService;
import app.service.UserService;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
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
	@JsonView(JView.UserDetail.class)
	@GetMapping("/api/user/{userid}")
	public Users getUserInfo(@PathVariable("userid") String userid) throws Exception {
		return userservice.getUser(userid, true);
	}

	/**
	 * postUserInfo<br>
	 * 指定したユーザー情報を更新する
	 *  @param users 更新するユーザー情報の内容
	 *  @param error 検証結果
	 * @return ErrorInfo エラー情報
	 */
	@PostMapping("/api/user/{userid}")
	public ErrorInfos postUserInfo(@RequestBody @JsonView(JView.UserInfo.class) Users users,
								   BindingResult error) throws Exception {
		// 個々の処理は、認証用のjwtからuidを取り出し、それを使用する
		Integer myUid = 1;
		userservice.postUser(users, myUid);
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
	public List<Users> getFollowList(@PathVariable("userid") String userid) throws Exception  {
		return userservice.getFollow(userid);
	}

	/**
	 * addFollow<br>
	 * 指定したユーザーをフォローする
	 *  @param targetUid 更新するユーザー固有ID
	 * @return ErrorInfo エラー情報
	 */
	@JsonView(JView.Public.class)
	@PostMapping("/api/user/follow/add/{targetUid}")
	public ErrorInfos addFollow(@RequestParam Integer targetUid) {
		// 個々の処理は、認証用のjwtからuidを取り出し、それを使用する
		Integer myUid = 1;
		userservice.insertFollow(targetUid, myUid);
		return new ErrorInfos();
	}

	/**
	 * addFollow<br>
	 * 指定したユーザーをフォローする
	 *  @param targetUid 更新するユーザー固有ID
	 * @return ErrorInfo エラー情報
	 */
	@JsonView(JView.Public.class)
	@PostMapping("/api/user/follow/del/{targetUid}")
	public ErrorInfos delFollow(@RequestParam Integer targetUid) {
		// 個々の処理は、認証用のjwtからuidを取り出し、それを使用する
		Integer myUid = 1;
		userservice.deleteFollow(targetUid, myUid);
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
	public List<Users> getFollowerList(@PathVariable("userid") String userid) throws Exception  {
		return userservice.getFollower(userid);
	}
}