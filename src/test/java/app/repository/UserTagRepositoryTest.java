package app.repository;

import app.model.UserTag;
import app.model.UserTagKey;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@SpringBootTest
public interface UserTagRepositoryTest extends JpaRepository<UserTag, UserTagKey> {

}
