package app.main.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
// 

/**
 * TagDomainImplクラス<br>
 *　タグ情報ドメイン実装
 * @author MewW6m　(https://github.com/MewW6m)
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class TagDomainImpl extends TagDomainIF{
	private int tId;
	private int tName;
}