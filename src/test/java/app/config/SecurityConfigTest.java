//package app.config;
//
//import app.service.UserService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
// @SpringBootTest
//public class SecurityConfigTest extends WebSecurityConfigurerAdapter{
//
//    @NonNull
//    SaveAndGenerateUserDetails saveAndGenerateUserDetails
//
//    @Autowired
//    private UserService userService;
//
//    @Autowired
//    private Constant C;
//
//
//    @Override
//    public void configure(WebSecurity web) throws Exception {
//        web.ignoring().antMatchers(C.CSSPATH, C.JSPATH, C.IMGPATH, C.LIBPATH);
//    }
//
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//            // SNSログイン
//            .oauth2Login()
//                .loginPage("/top")
//                .userInfoEndpoint()
//                // OAuth認証時に実行するServiceクラス
//                .userService(new UserService(saveAndGenerateUserDetails))
//                // OpenId認証時に実行するServiceクラス
//                .oidcUserService(new UserService(saveAndGenerateUserDetails))
//            .and()
//                // 必要があればSuccessHandlerを実装
//                .successHandler(new MyAuthenticationSuccessHandler())
//                // 必要があればSuccessHandlerを実装。今回はデフォルト。
//                .failureHandler(new SimpleUrlAuthenticationFailureHandler("/login?error"));
//    }
//
//    //変更点 ロード時に、「admin」ユーザを登録する。
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth
//            .userDetailsService(userService)
//                .passwordEncoder(new PasswordEncoder());
//    }
//}
package app.config;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.header.writers.StaticHeadersWriter;


/**
 * SecurityConfig<br>
 * セキュリティ設定
 * @author MewW6m　(https://github.com/MewW6m)
 */
@SpringBootTest
public class SecurityConfigTest  extends WebSecurityConfigurerAdapter{
}