package app.main.domain;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MainDomainImplTest extends MainDomainIFTest{
	private MainDomainIF mainDomain = new MainDomainImpl();
}