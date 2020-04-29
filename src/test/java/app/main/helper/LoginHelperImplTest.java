package app.main.helper;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LoginHelperImplTest extends LoginHelperIFTest{
	private LoginHelperIF loginHelper = new LoginHelperImpl();
}