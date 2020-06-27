//package app.main.util;
//
//import javax.servlet.http.HttpServletRequest;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.AfterThrowing;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Controller;
//
//
///**
// * ErrorUtil<br>
// * エラーページページを返すコントローラー、エラーログ出力、エラー共通処理など<br>
// * エラーに関する処理をまとめた実装クラス
// * @author MewW6m　(https://github.com/MewW6m)
// * @inheritDoc
// */
//
//@Aspect
//@Component
//@Controller
//@RequestMapping("/error")
//public class ErrorUtil {
//
//	/**
//	 * getErrorPathメソッド<br>
//	 * エラーページのパスを取得する
//	 * @return String エラーページのパス
//	 */
//	public String getErrorPath() {
//		return null;
//	}
//
//	/**
//	 * handleErrorViewメソッド<br>
//	 * カスタムエラーページを返す
//	 *  @param req リクエスト情報
//	 *  @param mav テンプレートで利用するデータと、Viewに関する情報
//	 * @return ModelAndView テンプレートで利用するデータと、Viewに関する情報
//	 */
//	@RequestMapping("/error")
//	public ModelAndView handleErrorView(HttpServletRequest req, ModelAndView mav) {
//	    mav.setStatus(HttpStatus.NOT_FOUND);
//	    mav.setViewName("error");
//	    return mav;
//    }
//
//	/**
//	 * commonAfterThrowingメソッド<br>
//	 * 全クラス共通でメソッド実行で例外がスローされた後に呼び出す
//	 *  @param e エラー情報
//	 */
//	@AfterThrowing(value = "execution(* *..*(..))", throwing = "e")
//	public void commonAfterThrowing(Throwable e){
//		System.out.println(e.getMessage());
//	}
//}
