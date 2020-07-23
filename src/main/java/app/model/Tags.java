package app.model;

import app.config.JView;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

/**
 * Tags<br>
 *　タグ情報
 * @author MewW6m　(https://github.com/MewW6m)
 */

@Entity
@Getter
@Setter
@EqualsAndHashCode(exclude="usertag")
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Tags {

	public Tags(String tname){
		this.tname = tname;
	}

	@JsonView({JView.TagInfo.class, JView.UserDetail.class})
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tid", nullable = false, updatable = false, insertable = false)
	private Integer tid;

	@JsonView({JView.TagInfo.class, JView.UserDetail.class})
	@Column(name = "tname", unique=true)
	private String tname;

	@OneToMany(mappedBy = "tags", cascade = CascadeType.ALL)
	private List<UserTag> usertag;
}