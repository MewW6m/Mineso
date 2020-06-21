package app.main.model;

import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class LoginDomainImplTest extends LoginDomainIFTest{
	private LoginDomainIF loginDomain = new Login();
}