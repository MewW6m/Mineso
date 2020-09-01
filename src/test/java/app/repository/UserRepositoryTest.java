package app.repository;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import app.model.Users;

import java.util.List;

/**
 * UserRepository<br>
 * ユーザー情報をDBに直接操作する
 * @author MewW6m　(https://github.com/MewW6m)
 */
@SpringBootTest
public interface UserRepositoryTest extends JpaRepository<Users, Long> {

}