package app.repository;

import app.model.Follow;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * FollowRepository<br>
 * フォロー情報をDBに直接操作する
 * @author MewW6m　(https://github.com/MewW6m)
 */
@SpringBootTest
public interface FollowRepositoryTest extends JpaRepository<Follow, Long> {

}
