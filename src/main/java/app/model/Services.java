package app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Services<br>
 *　サービス情報
 * @author MewW6m　(https://github.com/MewW6m)
 */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Services {
	@Id
	private int serviceId;
	private int uId;
	private boolean serviceDisabled;
	@Column(unique=true)
	private String serviceName;
	private String serviceImage;
	private String ServiceURL;
}