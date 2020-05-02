package app.main.domain;

import org.springframework.boot.test.context.SpringBootTest;

// サービス情報クラス
@SpringBootTest
class ServicesDomainImplTest extends ServicesDomainIFTest{
	private ServicesDomainIF servicesDomain = new ServicesDomainImpl();
}