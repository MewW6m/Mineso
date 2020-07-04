package app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * Nortifications<br>
 *　通知情報
 * @author MewW6m　(https://github.com/MewW6m)
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Nortifications {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nid")
    private int nid;
    @Column(name = "ntitle")
    private String ntitle;
    @Column(name = "ndetail")
    private String ndetail;
    @Column(name = "ntype")
    private String ntype;
    @Column(name = "ndate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ndate;
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="uid", referencedColumnName="uid", nullable = false)
    private Users users;
}
