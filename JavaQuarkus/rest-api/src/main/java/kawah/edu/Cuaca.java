package kawah.edu;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 *  PANACHE
 */

@Entity
@Table(name = "wheater")
public class Cuaca extends PanacheEntityBase {

//     Generate column
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    public String kota;
    @Column(name = "suhu_low",nullable = false)
    public String suhuLow;
    @Column(name = "suhu_high",nullable = false)
    public String suhuHigh;
    @Column(nullable = false)
    public Date tanggal;


}
