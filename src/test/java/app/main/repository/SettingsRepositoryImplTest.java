package app.main.repository;

import org.springframework.boot.test.context.SpringBootTest;

//　設定をDBから取得する実装クラス
@SpringBootTest
class SettingsRepositoryImplTest extends SettingsRepositoryIFTest{
	private SettingsRepositoryIF settingsRepository = new SettingsRepositoryImpl();
}