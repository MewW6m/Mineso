package app.service;

import app.config.Util;
import app.model.Settings;
import app.model.Users;
import app.repository.SettingsRepository;
import app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
 * ユーザー情報を取得する
 * @author MewW6m　(https://github.com/MewW6m)
 */
@Service
public class UserService  {
//public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private SettingsRepository settingsRepository;

    @Autowired
    private Util util;

    /**
     * getUser<br>
     * ユーザー情報(ユーザーと設定)を取得する
     *  @param userid ユーザーID
     *  @param getCntFlg フォロー数取得可否
     */
    public Users getUser(String userid, Boolean getCntFlg) throws Exception {
    	Users users = userRepository.findFirstByUserid(userid);
        Settings settings = settingsRepository.findFirstByUid(users.getUid()).orElseThrow(() -> new Exception());
        if(settings.getUservisibled() && !users.getUdisabled()){
            if(getCntFlg) {
                List<List<Integer>> followList = userRepository.getFollowCount(users.getUid());
                users.setFollowCount(followList.get(0).get(0));
                users.setFollowerCount(followList.get(0).get(1));
            }
            return users;
        } else {
            throw new Exception();
        }
    }

    /**
     * postUser<br>
     * ユーザー情報を更新する
     * @param users
     * @throws Exception
     */
    public void postUser(Users users, Users baseUsers) throws Exception {
        if (users.getUserid()!=null && (users.getUid() == baseUsers.getUid())) {
            util.copyNonNullProperties(users, baseUsers);
            userRepository.saveAndFlush(baseUsers);
        }
    }

    /**
     * getUser<br>
     * フォロー情報を取得する
     *  @param userid ユーザーID
     * @return フォローリスト
     */
    public List<Users> getFollow(String userid) throws Exception {
        Users users = userRepository.findFirstByUserid(userid);
        Settings settings = settingsRepository.findFirstByUid(users.getUid()).orElseThrow(() -> new Exception());
        if(settings.getUservisibled() && !users.getUdisabled()){
            return userRepository.getFollow(users.getUid());
        } else {
            throw new Exception();
        }
    }



    /**
     * getUser<br>
     * フォローワー情報を取得する
     *  @param userid ユーザーID
     * @return フォロワーリスト
     */
    public List<Users> getFollower(String userid) throws Exception {
        Users users = userRepository.findFirstByUserid(userid);
        Settings settings = settingsRepository.findFirstByUid(users.getUid()).orElseThrow(() -> new Exception());
        if(settings.getUservisibled() && !users.getUdisabled()){
            return userRepository.getFollower(users.getUid());
        } else {
            throw new Exception();
        }
    }



/*
    @Override
    public User loadUserByUsername(String username) throws UsernameNotFoundException {
        if (username == null || "".equals(username)) {
            throw new UsernameNotFoundException("Username is empty");
        }

        User user = userRepository.findFirstByUserid(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found: " + username);
        }

        return user;
    }*/
}