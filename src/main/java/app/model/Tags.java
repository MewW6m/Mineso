package app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

/**
 * Tags<br>
 *　タグ情報
 * @author MewW6m　(https://github.com/MewW6m)
 */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Tags {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tid", nullable = false, updatable = false, insertable = false)
	private Integer tid;

	@Column(name = "tagname", unique=true)
	private Integer tagname;


	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(
			name="usertag",
			joinColumns=@JoinColumn(name="tid"),
			inverseJoinColumns=@JoinColumn(name="uid")
	)
	private List<Users> userlist;
}