package app.repository;

import app.model.Settings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * SettingsRepository<br>
 * 設定情報をDBに直接操作する
 * @author MewW6m　(https://github.com/MewW6m)
 */
@Repository
public interface SettingsRepository extends JpaRepository<Settings, Long> {

	/**
	 * findFirstByUid<br>
	 * 設定情報をuidをもとにDBから取得するメソッド
	 *  @param uid ユーザー情報ID
	 * @return Settings 設定情報
	 */
	public Optional<Settings> findFirstByUid(int uid);
}