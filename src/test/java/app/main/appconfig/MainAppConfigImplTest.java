package app.main.appconfig;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MainAppConfigImplTest extends MainAppConfigIFTest{
	private MainAppConfigIF mainAppConfig = new MainAppConfigImpl();
}