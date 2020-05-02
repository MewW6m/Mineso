package app.main.domain;

import org.springframework.boot.test.context.SpringBootTest;

// タグ情報クラス
@SpringBootTest
class TagDomainImplTest extends TagDomainIFTest{
	private TagDomainIF tagDomain = new TagDomainImpl();
}