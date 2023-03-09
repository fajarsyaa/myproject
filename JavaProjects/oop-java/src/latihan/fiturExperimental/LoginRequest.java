/**
 *  *  Record Class
 *  *      kadang kita sering membuat class, hanya untuk class yang berisikan data. Hanya data getter, equals,
 *  *      hashCode, dan toString method.
 *  *      Nah record class ini dibuat untuk mempermudah itu.
 *  *
 *  *      saat membuat record class otomatis di buatkan getter, equals, hashCode, dan toString method secara
 *  *      otomastis dan juga constructor secara otomatis.
 *  *
 *  *      record class bersifat immutable, yaitu tidak bisa dirubah valuenya.
 *  *
 *  *      record class otomatis meng-extends class java.lang.Record yang artinya kita tidak bisa meng extends
 *  *      class lain. namun tetap bisa meng-implements interface.
 *  *
 */

package latihan.fiturExperimental;

            // constructor langsung di tulis di sini
public record LoginRequest(String username, String password) {

    /**
     *  untuk melakukan sesuatu di constractor, kita bisa membuat compact constructor, yaitu constructor
     *  tanpa tanda ()
     *
     *  untuk melakukan overloading constructor, diharuskan memanggil constructor utamanya yang otomatis
     *  dibuatkan di record class
     *
     *  untuk membuat method sendiri tidak ada perbedaan
     */

    public LoginRequest{
        System.out.println("membuat object login request");
    }

    public LoginRequest(String username){
        this(username,"");
    }

    public void sayHello(){
        System.out.println("sapaaa aku bang");
    }

}
