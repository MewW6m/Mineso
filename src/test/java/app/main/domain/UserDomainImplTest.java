package app.main.domain;

import org.springframework.boot.test.context.SpringBootTest;

// User情報クラス
@SpringBootTest
class UserDomainImplTest extends UserDomainIFTest{
	private UserDomainIF userDomain = new UserDomainImpl();
}