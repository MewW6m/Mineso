package app.main.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * UserDomainIFインターフェース<br>
 *　ユーザー情報ドメインインターフェース
 * @author MewW6m　(https://github.com/MewW6m)
 */
@Data
@Component
public  abstract class UserDomainIF{
	protected int uId;
	protected String userId;
	protected String userName;
	protected String userMailAddres;
	protected String userDescription;
	protected String userImage;
}