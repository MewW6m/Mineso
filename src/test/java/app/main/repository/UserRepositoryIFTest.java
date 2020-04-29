package app.main.repository;

import org.springframework.boot.test.context.SpringBootTest;

// ユーザー情報をDBから取得するインターフェース
@SpringBootTest
abstract class UserRepositoryIFTest{
	protected UserRepositoryIF userRepository;
}