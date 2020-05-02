package app.main.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * ServicesDomainImplクラス<br>
 *　サービス情報ドメイン実装
 * @author MewW6m　(https://github.com/MewW6m)
 */
// クラス
@Data
@EqualsAndHashCode(callSuper=true)
public class ServicesDomainImpl extends ServicesDomainIF{
	private int serviceId;
	private int uId;
	private boolean serviceDisabled;
	private String serviceName;
	private String serviceImage;
	private String ServiceURL;
}