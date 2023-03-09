package latihan.data;

/**
 * Interface, mirip seperti abstract class, bedanya semua method otomatis menjadi method abstract
 * untuk mewariskan interface menggunakan kata kunci implments
 * @note method otomatis di tambah public abstract, jadi semua menjadi method abstract
 *
 * Interface inheritance, di java child class hanya bisa punya 1 parent class, namun di interface
 *           sebuah child class bisa memiliki lebih dari 1 interfce. Bahkan dari interface ke interface
 *           bisa implements/pewarisan.
 *
 * @use dari class ke interface menggunakan keyword implements
 * @use dari interface ke interface menggunakan keyword extends
 *
 * Multiple inteface inheritance, dipisan dengan koma (,)
 */
public interface Car extends HasBrand, IsMaintenance{
    void drive();
    int getTire();


    /**
     * Default method, java.8
     * ketika menambah method baru di interface, secara otomatis semua class yang implement akan rusak
     * karena harus meng-override method baru tersebut.
     * Dengan default method inilah kita bisa menangani itu, kita bisa menambahkan konkrit method di interface
     * dan secara otomatis semua turunannya tidak wajib untuk meng-override method default
     */
    default boolean isBig(){
        return true;
    }
}
