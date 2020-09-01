package app.repository;

import app.model.Tags;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * TagRepository<br>
 * タグ情報をDBに直接操作する
 * @author MewW6m　(https://github.com/MewW6m)
 */
@SpringBootTest
public interface TagRepositoryTest  extends JpaRepository<Tags, Long> {

}
