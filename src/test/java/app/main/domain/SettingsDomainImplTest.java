package app.main.domain;

import org.springframework.boot.test.context.SpringBootTest;

// 設定情報クラス
@SpringBootTest
class SettingsDomainImplTest extends SettingsDomainIFTest{
	private SettingsDomainIF settingsDomain = new SettingsDomainImpl();
}