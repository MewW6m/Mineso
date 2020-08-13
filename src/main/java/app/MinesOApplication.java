package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

/**
 * SpringBoot起動時に実行されるクラス
 * @author MewW6m　(https://github.com/MewW6m)
 */
@SpringBootApplication
public class MinesOApplication {

	/**
	 * main<br>
	 * Springアプリケーションを実行し、新しいApplicationContextを作成します。
	 * @param args 不明
	 */
	public static void main(String[] args) {
		SpringApplication.run(MinesOApplication.class, args);
	}

}
