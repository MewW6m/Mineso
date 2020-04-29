package app.main.helper;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UListHelperImplTest extends UListHelperIFTest{
	private UListHelperIF uListHelper = new UListHelperImpl();
}