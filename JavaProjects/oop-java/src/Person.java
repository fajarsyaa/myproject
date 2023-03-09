/**
 * Class
 */
class Person {
    /**
     * object = instansiasi dari sebuah class
     * field / atribute / properti addalah data yang bisa kita sisipkan di dalam object
     */
    String nama;
    String alamat;
    final String country = "indonesia";


    /**
     * method constructor = method yang akan di panggil (otomatis) saat object pertama kali di instansiasi
     * @syarat nama method constructor harus sama dengan nama classnya
     *
     * Constructor overloading = membuat constructor lebih dari satu
     * @syarat tipe parameter atau jumlah parameter harus berbeda
     *
     * constructor bisa juga memangil contructor yang lain.
     * ini berguna agar tidak menulis kode constuctor yang codenya sama
     * @cara this()
     *
     * @note this mengacu/merepresentasikan pada object saat ini
     * @note Variable Shadowing = kejadian kita membuat variable dengan nama yang sama di dalam 1 scope yang sama
     *       Saat ini terjadi variable yang berada di atas tidak bisa di akses, kerena tertutupi variabel yang sama
     */

    Person(String nama,String alamat){
        this.nama   = nama;
        this.alamat = alamat;
    }
    Person(String nama){
        this(nama,null);
    }
    Person(){
        this(null,null);
    }

    /**
     * method
     * @param nama
     */

    void sayHello(String nama){
        System.out.println("Hello "+nama+", nama ku "+this.nama);
    }

}
