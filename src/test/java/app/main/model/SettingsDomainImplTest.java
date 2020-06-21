package app.main.model;

import org.springframework.boot.test.context.SpringBootTest;

// 設定情報クラス
@SpringBootTest
class SettingsDomainImplTest extends SettingsDomainIFTest{
	private SettingsDomainIF settingsDomain = new Settings();
}