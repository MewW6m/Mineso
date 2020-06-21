package app.main.service;

import app.main.model.Settings;
import app.main.model.User;
import app.main.repository.SettingsRepository;
import app.main.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UserService<br>
 * ユーザー情報を取得する
 * @author MewW6m　(https://github.com/MewW6m)
 */
@Service
public class UserService {
    @Autowired
    private User user;

    @Autowired
    private Settings settings;
    
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private SettingsRepository settingsRepository;

    /**
     * setUserメソッド<br>
     * ユーザー情報(ユーザーと設定)を設定する
     *  @param userId ユーザーID
     */
    public void setUser(String userId) {
    	user = userRepository.selectUser("userId", userId);
    	settings = settingsRepository.selectSettings("uId", user.getUId());
    }

    /**
     * getUserNameメソッド<br>
     * ユーザー名を取得する
     *  @param userId ユーザーID
     * @return String ユーザー名を返す
     */
	public String getUserName(String userId){
		return user.getUserName();
	}

    /**
     * getUserMailAddresメソッド<br>
     * ユーザーメールアドレスを取得する
     *  @param userId ユーザーID
     * @return String ユーザーメールアドレスを返す
     */
	public String getUserMailAddres(String userId){
		return user.getUserMailAddres();
	}

    /**
     * getUserDescriptionメソッド<br>
     * ユーザーの詳細を取得する
     *  @param userId ユーザーID
     * @return String ユーザーの詳細を返す
     */
	public String getUserDescription(String userId){
		return user.getUserDescription();
	}

    /**
     * getUserImageメソッド<br>
     * ユーザーの画像を取得する
     *  @param userId ユーザーID
     * @return String ユーザーの画像を返す
     */
	public String getUserImage(String userId){
		return user.getUserImage();
	}

    /**
     * getUserEnabledメソッド<br>
     * ユーザーを使用できるかを判別する
     *  @param userId ユーザーID
     * @return String ユーザーの使用可否を返す
     */
	public Boolean getUserEnabled(String userId) {
    	return settings.isUserEnabled();
    }

    /**
     * getUserVisibledメソッド<br>
     * ユーザーが見えるかを判別するを判別する
     *  @param userId ユーザーID
     * @return String ユーザーの可視可否を返す
     */
	public Boolean getUserVisibled(String userId) {
    	return settings.isUserVisibled();
    }
}