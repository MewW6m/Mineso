package app.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.main.domain.SettingsDomainIF;
import app.main.domain.UserDomainIF;
import app.main.repository.SettingsRepositoryIF;
import app.main.repository.UserRepositoryIF;

/**
 * UserServiceImplクラス<br>
 * ユーザー情報を取得する実装
 * @author MewW6m　(https://github.com/MewW6m)
 */
@Service
public class UserServiceImpl implements UserServiceIF{
    @Autowired(required=false)
    private UserDomainIF user;

    @Autowired(required=false)
    private SettingsDomainIF settings;
    
    @Autowired(required=false)
    private UserRepositoryIF userRepository;
    
    @Autowired(required=false)
    private SettingsRepositoryIF settingsRepository;

    @Override
    public void setUser(String userId) {
    	user = userRepository.selectUser("userId", userId);
    	settings = settingsRepository.selectSettings("uId", user.getUId());
    }

    @Override
	public String getUserName(String userId){
		return user.getUserName();
	}
	
    @Override
	public String getUserMailAddres(String userId){
		return user.getUserMailAddres();
	}
	
    @Override
	public String getUserDescription(String userId){
		return user.getUserDescription();
	}
	
    @Override
	public String getUserImage(String userId){
		return user.getUserImage();
	}
    
    @Override
	public Boolean getUserEnabled(String userId) {
    	return settings.isUserEnabled();
    }
    
    @Override
	public Boolean getUserVisibled(String userId) {
    	return settings.isUserVisibled();
    }
}