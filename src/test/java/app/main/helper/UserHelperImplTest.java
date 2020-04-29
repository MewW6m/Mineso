package app.main.helper;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserHelperImplTest extends UserHelperIFTest{
	private UserHelperIF userHelper = new UserHelperImpl();
}