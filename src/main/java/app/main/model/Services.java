package app.main.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Services<br>
 *　サービス情報
 * @author MewW6m　(https://github.com/MewW6m)
 */

@Entity
@Data
@Component
public class Services {
	@Id
	private int serviceId;
	private int uId;
	private boolean serviceDisabled;
	private String serviceName;
	private String serviceImage;
	private String ServiceURL;
}