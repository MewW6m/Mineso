package app.main.repository;

import org.springframework.boot.test.context.SpringBootTest;

// 設定をDBから取得するインターフェース
@SpringBootTest
abstract class SettingsRepositoryIFTest{
	protected SettingsRepositoryIF loginRepository;
}