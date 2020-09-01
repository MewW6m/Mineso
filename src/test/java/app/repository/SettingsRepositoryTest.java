package app.repository;

import app.model.Settings;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * SettingsRepository<br>
 * 設定情報をDBに直接操作する
 * @author MewW6m　(https://github.com/MewW6m)
 */
@SpringBootTest
public interface SettingsRepositoryTest extends JpaRepository<Settings, Long> {

}