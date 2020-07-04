package app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

/**
 * App<br>
 *　アプリ情報
 * @author MewW6m　(https://github.com/MewW6m)
 */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Apps {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "aid", nullable = false, updatable = false, insertable = false)
	private int aid;
	@Column(name = "adisabled")
	private boolean adisabled;
	@Column(name = "aname", unique=true, nullable = false)
	private String aname;
	@Column(name = "aimgpath")
	private String aimgpath;
	@Column(name = "aurl", nullable = false)
	private String aurl;


	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(
			name="userapp",
			joinColumns=@JoinColumn(name="aid"),
			inverseJoinColumns=@JoinColumn(name="uid")
	)
	private List<Apps> applist;
}