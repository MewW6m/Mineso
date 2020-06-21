package app.main.repository;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LoginRepositoryImplTest extends LoginRepositoryIFTest{
	private LoginRepositoryIF loginRepository = new LoginRepository();
}