package app.main.service;

import org.springframework.boot.test.context.SpringBootTest;

// ユーザー情報を取得する実装クラス
@SpringBootTest
class UserServiceImplTest extends UserServiceIFTest{
	private UserServiceIF userService = new UserServiceImpl();
}