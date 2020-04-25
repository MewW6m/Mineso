package app.main.domain;

import lombok.Data;

// サービス情報クラス
@Data
public class ServicesDomain{
	private int serviceId;
	private int uId;
	private boolean serviceDisabled;
	private String serviceName;
	private String serviceImage;
	private String ServiceURL;	
}