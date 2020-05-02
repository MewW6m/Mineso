package app.main.domain;

import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class LoginDomainImplTest extends LoginDomainIFTest{
	private LoginDomainIF loginDomain = new LoginDomainImpl();
}