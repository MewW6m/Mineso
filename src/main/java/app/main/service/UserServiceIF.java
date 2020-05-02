package app.main.service;

import org.springframework.stereotype.Service;

/**
 * UserServiceIFインターフェース<br>
 * ユーザー情報を取得するインターフェース
 * @author MewW6m　(https://github.com/MewW6m)
 */
@Service
public interface UserServiceIF{    

    /**
    * setUserメソッド<br>
    * ユーザー情報(ユーザーと設定)を設定する
    *  @param userId ユーザーID
    */
	public void setUser(String userId);    

    /**
    * getUserNameメソッド<br>
    * ユーザー名を取得する
    *  @param userId ユーザーID
    * @return String ユーザー名を返す
    */
	public String getUserName(String userId);
	
	/**
    * getUserMailAddresメソッド<br>
    * ユーザーメールアドレスを取得する
    *  @param userId ユーザーID
    * @return String ユーザーメールアドレスを返す
    */
	public String getUserMailAddres(String userId);

	/**
    * getUserDescriptionメソッド<br>
    * ユーザーの詳細を取得する
    *  @param userId ユーザーID
    * @return String ユーザーの詳細を返す
    */
	public String getUserDescription(String userId); 
	
	/**
    * getUserImageメソッド<br>
    * ユーザーの画像を取得する
    *  @param userId ユーザーID
    * @return String ユーザーの画像を返す
    */
	public String getUserImage(String userId);

	/**
    * getUserEnabledメソッド<br>
    * ユーザーを使用できるかを判別する
    *  @param userId ユーザーID
    * @return String ユーザーの使用可否を返す
    */
	public Boolean getUserEnabled(String userId);

	/**
    * getUserVisibledメソッド<br>
    * ユーザーが見えるかを判別するを判別する
    *  @param userId ユーザーID
    * @return String ユーザーの可視可否を返す
    */
	public Boolean getUserVisibled(String userId);
}