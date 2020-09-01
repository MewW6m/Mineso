package app.repository;

import app.model.Apps;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * AppRepository<br>
 * アプリ情報をDBに直接操作する
 * @author MewW6m　(https://github.com/MewW6m)
 */
@SpringBootTest
public interface AppRepositoryTest extends JpaRepository<Apps, Long> {

}
