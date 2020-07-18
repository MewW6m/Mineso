package app.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;
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
    @Column(name = "nid", nullable = false)
    private Integer nid;

    @JsonIgnore
    @Column(name = "uid", nullable = false, updatable = false, insertable = false)
    private Integer uid;

    @Column(name = "ntitle", nullable = false)
    private String ntitle;

    @Column(name = "ndetail", nullable = false)
    private String ndetail;

    @Column(name = "ntype", nullable = false)
    private String ntype;

    @Column(name = "ndate", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date ndate;

    @Column(name = "nflag", nullable = false)
    private Boolean nflag;

    @JsonIgnore
    @OneToOne(cascade=CascadeType.DETACH)
    @JoinColumn(name="uid", referencedColumnName="uid", nullable = false)
    private Users users;
}
