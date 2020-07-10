package app.model;

import app.config.JView;
import com.fasterxml.jackson.annotation.JsonView;
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

    @JsonView(JView.NortificationInfo.class)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nid")
    private int nid;

    @JsonView(JView.NortificationInfo.class)
    @Column(name = "ntitle")
    private String ntitle;

    @JsonView(JView.NortificationInfo.class)
    @Column(name = "ndetail")
    private String ndetail;

    @JsonView(JView.NortificationInfo.class)
    @Column(name = "ntype")
    private String ntype;

    @JsonView(JView.NortificationInfo.class)
    @Column(name = "ndate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ndate;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="uid", referencedColumnName="uid", nullable = false)
    private Users users;
}
