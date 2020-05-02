package app.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

/**
 * UserControllerIFインターフェース<br>
 *　ユーザー関連ページを返すコントローラーインターフェース
 * @author MewW6m　(https://github.com/MewW6m)
 */
@Controller
public interface UserControllerIF {

	/**
    * getUserPageメソッド<br>
    * 指定したユーザーページを返す
    *  @param userId urlで指定されたユーザーID
    *  @param mav テンプレートで利用するデータと、Viewに関する情報
    * @return ModelAndView テンプレートで利用するデータと、Viewに関する情報
    */
	public ModelAndView getUserPage(@PathVariable("userId") String userId, ModelAndView mav);

	/**
    * getFollowPageメソッド<br>
    * 指定したユーザーフォローページを返す
    *  @param userId urlで指定されたユーザーID
    *  @param mav テンプレートで利用するデータと、Viewに関する情報
    * @return ModelAndView テンプレートで利用するデータと、Viewに関する情報
    */
	public ModelAndView getFollowPage(@PathVariable("userId") String userId, ModelAndView mav);

	/**
    * getFollowerPageメソッド<br>
    * 指定したユーザーフォロワーページを返す
    *  @param userId urlで指定されたユーザーID
    *  @param mav テンプレートで利用するデータと、Viewに関する情報
    * @return ModelAndView テンプレートで利用するデータと、Viewに関する情報
    */
	public ModelAndView getFollowerPage(@PathVariable("userId") String userId, ModelAndView mav);

}
