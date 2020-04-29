package app.main.service;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LoginServiceImplTest extends LoginServiceIFTest{
	private LoginServiceIF loginService = new LoginServiceImpl();
}