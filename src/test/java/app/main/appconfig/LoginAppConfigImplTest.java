package app.main.appconfig;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LoginAppConfigImplTest extends LoginAppConfigIFTest{
	private LoginAppConfigIF loginAppConfig = new LoginAppConfigImpl();
}