package app.model;

import app.config.JView;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

/**
 * Apps<br>
 *　アプリ情報
 * @author MewW6m　(https://github.com/MewW6m)
 */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Apps {

	@JsonView({JView.AppInfo.class, JView.UserDetail.class})
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "aid", nullable = false, updatable = false, insertable = false)
	private Integer aid;

	@Column(name = "adisabled")
	private Boolean adisabled;

	@JsonView({JView.AppInfo.class, JView.UserDetail.class})
	@Column(name = "aname", unique=true, nullable = false)
	private String aname;

	@JsonView({JView.AppInfo.class, JView.UserDetail.class})
	@Column(name = "aimgpath")
	private String aimgpath;

	@JsonView({JView.AppInfo.class, JView.UserDetail.class})
	@Column(name = "aurl", nullable = false)
	private String aurl;
	
	@OneToMany(mappedBy = "apps", cascade = CascadeType.ALL)
	private List<UserApp> userapp;
}