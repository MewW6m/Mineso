package app.main.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Tag<br>
 *　タグ情報
 * @author MewW6m　(https://github.com/MewW6m)
 */

@Entity
@Data
@Component
public class Tag {
	@Id
	private int tId;
	private int tName;
}