package app.main.domain;

import lombok.Data;

/**
 * TagDomainIFインターフェース<br>
 *　タグ情報ドメインインターフェース
 * @author MewW6m　(https://github.com/MewW6m)
 */
@Data
public  abstract class TagDomainIF{
	private int tId;
	private int tName;
}