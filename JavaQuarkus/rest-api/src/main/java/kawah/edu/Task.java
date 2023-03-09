package kawah.edu;

import javax.persistence.*;

/**
 *  JPA
 */

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;

    @Column(nullable = false)
    public String mapel;
    @Column(nullable = false)
    public String description;
    @Column(nullable = false)
    public int nilai;
}
