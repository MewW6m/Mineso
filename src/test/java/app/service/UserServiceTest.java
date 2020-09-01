package app.service;

import app.config.Util;
import app.model.Follow;
import app.model.Settings;
import app.model.Users;
import app.repository.FollowRepository;
import app.repository.SettingsRepository;
import app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * UserService<br>
 * ユーザー情報を操作するビジネスロジック
 * @author MewW6m　(https://github.com/MewW6m)
 */
@SpringBootTest
public class UserServiceTest  {

}