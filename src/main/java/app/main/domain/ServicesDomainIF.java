package app.main.domain;

import lombok.Data;

/**
 * ServicesDomainIFインターフェース<br>
 *　サービス情報ドメインインターフェース
 * @author MewW6m　(https://github.com/MewW6m)
 */
@Data
public abstract class ServicesDomainIF{
	protected int serviceId;
	protected int uId;
	protected boolean serviceDisabled;
	protected String serviceName;
	protected String serviceImage;
	protected String ServiceURL;
}