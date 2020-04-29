package app.main.appconfig;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserAppConfigImplTest extends UserAppConfigIFTest{
	private UserAppConfigIF userAppConfig = new UserAppConfigImpl();
}