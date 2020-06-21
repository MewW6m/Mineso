package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot起動時に実行されるクラス
 * @author MewW6m　(https://github.com/MewW6m)
 * @link https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/SpringApplication.html
 */
@SpringBootApplication
public class MinesOApplication {

	/**
    * mainメソッド
    * Springアプリケーションを実行し、新しいApplicationContextを作成し ます。
    *  @param args 
    */
	public static void main(String[] args) {
		SpringApplication.run(MinesOApplication.class, args);
	}

}
