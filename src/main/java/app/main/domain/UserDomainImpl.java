package app.main.domain;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * UserDomainImplクラス<br>
 *　ユーザー情報ドメイン実装
 * @author MewW6m　(https://github.com/MewW6m)
 */
@Data
@Component
@EqualsAndHashCode(callSuper=true)
public class UserDomainImpl extends UserDomainIF{
	private int uId;
	private String userId;
	private String userName;
	private String userMailAddres;
	private String userDescription;
	private String userImage;
}