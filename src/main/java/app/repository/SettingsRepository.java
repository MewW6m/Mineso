package app.repository;

import app.model.Settings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * SettingsRepository<br>
 * 設定をDBから取得する
 * @author MewW6m　(https://github.com/MewW6m)
 */
@Repository
public interface SettingsRepository extends JpaRepository<Settings, Long> {

	/**
	 * findFirstByUidメソッド<br>
	 * 設定を{key,value}をもとにDBから取得するメソッド
	 *  @param uid ユーザー情報ID
	 * @return Settings 設定情報
	 */
	public Settings findFirstByUid(int uid);
}