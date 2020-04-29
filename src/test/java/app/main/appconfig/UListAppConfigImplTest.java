package app.main.appconfig;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UListAppConfigImplTest extends UListAppConfigIFTest{
	protected UListAppConfigIF uListAppConfig = new UListAppConfigImpl();
}