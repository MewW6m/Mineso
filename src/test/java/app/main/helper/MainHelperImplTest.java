package app.main.helper;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MainHelperImplTest extends MainHelperIFTest{
	private MainHelperIF mainHelper = new MainHelperImpl();
}