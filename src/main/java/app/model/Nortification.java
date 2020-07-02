package app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Nortification<br>
 *　通知情報
 * @author MewW6m　(https://github.com/MewW6m)
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Nortification {
    @Id
    private int nid;
    @Column(unique = true)
    private int uid;
    @Column
    private String nortitle;
    @Column
    private String nordetail;
    @Column
    private String norcategory;
}
